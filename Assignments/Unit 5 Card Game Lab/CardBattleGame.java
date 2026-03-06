import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
 * CardBattleGame — the main game loop (students implement).
 *
 * USEFUL METHODS YOU'LL NEED:
 *
 * Card methods: card.applySelfOnPlay() -> applies shield/bonusDamage from the card's ability
 * card.getAbility().pingDamageOnPlay() -> how much ping damage this ability deals
 * card.getAbility().cyclesOnPlay() -> whether the card cycles to the bottom of the deck
 * card.computeDamageAgainst(defender) -> calculates damage with type multipliers
 * card.takeDamage(amount) -> reduces shield first, then health card.isDefeated() -> true if health
 * <= 0 card.getType() -> returns CardType (uses polymorphism!)
 *
 * PlayerState methods: state.getDeck() -> returns the player's ArrayList<Card> state.getActive() /
 * setActive(card) -> the currently active card (or null) state.hasAnythingLeft() -> true if active
 * card or cards remain in deck state.getPendingDamage() / setPendingDamage(int) -> stored Ripple
 * damage for next drawn card
 */
public class CardBattleGame {

    // To-do: Implement the full game.
    // Must print:
    // == CARD CLASH ==
    // Starting: Player/Bot
    // Winner: Player/Bot
    public static String playGame(ArrayList<Card> playerDeck, ArrayList<Card> botDeck, Random rng) {
        int move;
        PlayerState player = new PlayerState("Player", playerDeck);
        PlayerState bot = new PlayerState("Bot", botDeck);
        String winner = "N/A";

        System.out.println("== CARD CLASH ==");

        int randomInt = rng.nextInt();
        if (randomInt % 2 == 1) {
            System.out.println("Starting: Player");
            move = 1;
        } else {
            System.out.println("Starting: Bot");
            move = 2;
        }


        boolean gameOver = false;
        while (!gameOver) {
            if (move % 2 == 1) { // Player's Turn
                System.out.println("Player's Turn:");
                if (!player.hasAnythingLeft()) {
                    System.out.println("GAME OVER");
                    winner = "Bot";
                    break;
                }

                move = 2;
            } else { // Bot's Turn
                System.out.println("Bot's Turn:");
                if (!bot.hasAnythingLeft()) {
                    System.out.println("GAME OVER");
                    winner = "Player";
                    break;
                }

                move = 1;
            }
        }

        System.out.println("Winner: " + winner);
        return winner;
    }

    // ----- helpers you may implement or use -----

    // Draw top card if no active, apply on-play effects via card.applySelfOnPlay()
    public static void drawAndPlayIfNeeded(PlayerState self, PlayerState other) {
        if (self == null || other == null) {
            throw new IllegalArgumentException("Cannot act without two decks!");
        }

        Card actingCard = self.getActive();
        Card otherCard = other.getActive();

        if (actingCard == null) {
            self.setActive(self.getDeck().removeFirst());
        }
        if (otherCard == null) {
            other.setActive(other.getDeck().removeFirst());
        }

        actingCard.applySelfOnPlay();
        System.out.println(self.getName() + " played: " + actingCard);
        
    }

    // One attack (self active attacks other active if both exist)
    public static void attackOnce(PlayerState attacker, PlayerState defender) {
        if (attacker == null || defender == null) {
            throw new IllegalArgumentException("Cannot attack without two decks!");
        }

        Card offenseCard = attacker.getActive();
        Card defenseCard = defender.getActive();

        int dmg = attacker.getActive().computeDamageAgainst(defender.getActive());
        System.out.println(offenseCard.getName() + " attacks " + defenseCard.getName() + " for " + dmg);
        defender.getActive().takeDamage(dmg);
        System.out.println(defenseCard.getName() + " after dmg: " + b);
    }

    // Optional local run (not graded)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Card> player = DeckValidator.buildDefaultDeck();
        ArrayList<Card> bot = DeckBuilderBot.buildBotDeck();

        if (!DeckValidator.isValidDeck(player)) {
            System.out.println("Player deck invalid!");
            return;
        }

        playGame(player, bot, new Random());
    }
}
