import java.util.ArrayList;
import java.util.Scanner;

/*
 * DeckValidator — deck validation and building (students implement).
 *
 * USEFUL METHODS FOR YOUR IMPLEMENTATIONS:
 *
 * card.hasAbility() -> true if the card has a real ability (not NONE) card.getAbility() -> returns
 * the Ability interface reference card.getAbility().getId() -> returns "BASTION", "RIPPLE",
 * "CLEAVE", or "NONE" card.getType() -> returns the CardType enum (GRANITE, PARCHMENT, BLADE)
 * card.getStrength() -> returns the card's strength stat card.getHealth() -> returns the card's
 * health stat
 *
 * CardType.fromText("granite") -> returns CardType.GRANITE AbilityLibrary.fromText("bastion") ->
 * returns the BastionAbility instance
 *
 * createCard("name", type, str, hp, ability) -> creates the right subclass (Granite, Parchment, or
 * Blade) based on the CardType
 */
public class DeckValidator {

    // ----------------------------
    // CHECKERS (students implement)
    // ----------------------------

    // Rule: no more than 3 total ability cards in the deck.
    // HINT: loop through the deck, use card.hasAbility() to count how many
    // cards have a real ability, and return true if the count is <= 3.
    public static boolean checkNoMoreThanThreeAbilityCards(ArrayList<Card> deck) {
        if (deck == null) {
            // might change to return false
            throw new IllegalArgumentException("Cannot validate a nonexistent deck!");
        }
        if (deck.size() <= 3) {
            return true;
        }

        int abilityCount = 0;

        for (Card card : deck) {
            if (abilityCount > 3) {
                return false;
            }
            if (card.hasAbility()) {
                abilityCount++;
            }
        }

        return true;
    }

    // Rule: no duplicate abilities in the deck (max one BASTION, one RIPPLE, one
    // CLEAVE).
    // HINT: loop through the deck, use card.getAbility().getId() to get
    // each ability's name, and check for duplicates.
    public static boolean checkNoDuplicateAbilities(ArrayList<Card> deck) {
        if (deck == null) {
            // might change to return false
            throw new IllegalArgumentException("Cannot validate a nonexistent deck!");
        }
        ArrayList<String> abilities = new ArrayList<String>(3);
        for (Card card : deck) {
            if (!card.hasAbility()) {
                continue;
            }
            if (abilities.contains(card.getAbility().getId())) {
                return false;
            } else {
                abilities.add(card.getAbility().getId());
            }
        }

        return true;
    }

    // Rule: strength and health must be 1..5, and strength + health <= 6.
    // HINT: loop through the deck, use card.getStrength() and card.getHealth().
    public static boolean checkStatsInRange(ArrayList<Card> deck) {
        if (deck == null) {
            // might change to return false
            throw new IllegalArgumentException("Cannot validate a nonexistent deck!");
        }

        for (Card card : deck) {
            if (card.getStrength() < 1 || card.getStrength() > 5) {
                return false;
            }
            if (card.getHealth() < 1 || card.getHealth() > 5) {
                return false;
            }
            if (card.getStrength() + card.getHealth() > 6) {
                return false;
            }
        }

        return true;
    }

    // Returns true only if the deck is fully valid:
    // - deck has exactly 5 cards
    // - AND all checks above return true
    public static boolean isValidDeck(ArrayList<Card> deck) {
        if (deck == null) {
            // might change to return false
            throw new IllegalArgumentException("Cannot validate a nonexistent deck!");
        }
        if (deck.size() != 5) {
            return false;
        }
        if (!checkNoMoreThanThreeAbilityCards(deck) || !checkNoDuplicateAbilities(deck)
                || !checkStatsInRange(deck)) {
            return false;
        }

        return true;
    }

    // ----------------------------
    // DECK BUILDERS (students implement)
    // ----------------------------

    // Must create 5 cards, all 3/3, no abilities (use AbilityLibrary.NONE).
    // Use the Granite, Parchment, and Blade subclasses directly,
    // or use the createCard() helper below.
    public static ArrayList<Card> buildDefaultDeck() {
        ArrayList<Card> newDeck = new ArrayList<Card>(5);
        // base 3
        newDeck.add(createCard("P1", CardType.fromText("granite"), 3, 3, AbilityLibrary.NONE));
        newDeck.add(createCard("P2", CardType.fromText("parchment"), 3, 3, AbilityLibrary.NONE));
        newDeck.add(createCard("P3", CardType.fromText("blade"), 3, 3, AbilityLibrary.NONE));

        // bonus 2
        newDeck.add(createCard("P4", CardType.fromText("granite"), 3, 3, AbilityLibrary.NONE));
        newDeck.add(createCard("P5", CardType.fromText("blade"), 3, 3, AbilityLibrary.NONE));

        return newDeck;
    }

    // Prompts the user 5 times using Scanner and validates inputs.
    // Required prompt order per card:
    // 1. name (String)
    // 2. type (granite / parchment / blade) -> use CardType.fromText()
    // 3. strength (int)
    // 4. health (int)
    // 5. ability (bastion / ripple / cleave / none) -> use
    // AbilityLibrary.fromText()
    //
    // Then use createCard() to build the right subclass from the parsed type.
    public static ArrayList<Card> buildUserDeck(Scanner sc) {
        ArrayList<Card> newDeck = new ArrayList<Card>(5);

        for (int i = 0; i < 5; i++) {
            System.out.println("Card " + (i + 1) + ":");

            System.out.println("Enter card name: ");
            String name = sc.next();

            System.out.println("Enter card type (granite / parchment / blade): ");
            CardType type = CardType.fromText(sc.next());
            while (type == null) {
                System.out.println("Invalid card type! Try again!");
                System.out.println("Enter card type (granite / parchment / blade): ");
                type = CardType.fromText(sc.next());
            }

            System.out.println("Enter card strength (1-5): ");
            int strength = Integer.parseInt(sc.next());
            while (strength < 1 || strength > 5) {
                System.out.println("Invalid card strength! Try again!");
                System.out.println("Enter card strength (1-5): ");
                strength = Integer.parseInt(sc.next());
            }

            System.out.println("Enter card health (1-5): ");
            int health = Integer.parseInt(sc.next());
            while (health < 1 || health > 5) {
                System.out.println("Invalid card health! Try again!");
                System.out.println("Enter card health (1-5): ");
                health = Integer.parseInt(sc.next());
            }

            System.out.println(
                    "Note: You cannot have duplicate card abilities or more than three card abilities in a deck!");
            System.out.println("Enter card ability (bastion / ripple / cleave / none): ");
            Ability ability = AbilityLibrary.fromText(sc.next());
            while (ability == null) {
                System.out.println("Invalid card ability! Try again!");
                System.out.println("Enter card ability (bastion / ripple / cleave / none): ");
                ability = AbilityLibrary.fromText(sc.next());
            }

            Card newCard = createCard(name, type, strength, health, ability);
            newDeck.add(newCard);

            // spacing for readability
            System.out.println();
        }

        if (!isValidDeck(newDeck)) {
            System.out.println("Invalid Deck! Please rebuild your deck below:");
            buildUserDeck(sc);
        }

        return newDeck;
    }

    // ----------------------------
    // Helper: create a Card subclass from a CardType
    // ----------------------------

    // This is a FACTORY METHOD — it decides which subclass to instantiate
    // based on the CardType enum value. The caller doesn't need to know
    // about the specific subclasses; they just pass in the type and get
    // back a Card reference.
    public static Card createCard(String name, CardType type, int strength, int health,
            Ability ability) {
        switch (type) {
            case GRANITE:
                return new CardGranite(name, strength, health, ability);
            case PARCHMENT:
                return new CardParchment(name, strength, health, ability);
            case BLADE:
                return new CardBlade(name, strength, health, ability);
            default:
                return null;
        }
    }

    // ----------------------------
    // Optional helpers you may use
    // ----------------------------

    public static boolean isYes(String s) {
        if (s == null)
            return false;
        s = s.trim().toLowerCase();
        return s.equals("y") || s.equals("yes");
    }
}
