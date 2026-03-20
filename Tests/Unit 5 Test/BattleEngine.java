// a class for all of the battle engine functions
// this class will be used to validate the type, element, weakness, health, and attack of the
// monsters
// there's also methods that will be used to calculate the damage and the health of the monsters
// and apply the type advantage multipliers

import java.util.ArrayList;

public class BattleEngine {

    // to-do: validateStats
    // checks if the monster stats are valid
    // the total combined stats of the monster should not exceed 250
    public static boolean validateStats(Monster monster) {
        if (monster == null) {
            throw new IllegalArgumentException("Cannot validate a nonexistent monster!");
        }

        if (monster.getHealth() < 0) {
            return false;
        }
        if (monster.getAttack() < 0) {
            return false;
        }
        if (monster.getDefense() < 0) {
            return false;
        }
        if (monster.getSpeed() < 0) {
            return false;
        }
        if (monster.getTotalStatSum() > 250) {
            return false;
        }

        return true;
    }

    // to-do: validateElement
    // checks if the monster element is valid
    // the only valid types allowed are "Fire", "Water", "Earth", and "Air"
    public static boolean validateElement(Monster monster) {
        if (monster == null) {
            throw new IllegalArgumentException("Cannot validate a nonexistent monster!");
        }

        if (monster.getElement() == null) {
            return false;
        }

        if (monster.getElement().equals(ElementType.FIRE)) {
            return true;
        }
        if (monster.getElement().equals(ElementType.AIR)) {
            return true;
        }
        if (monster.getElement().equals(ElementType.EARTH)) {
            return true;
        }
        if (monster.getElement().equals(ElementType.WATER)) {
            return true;
        }

        return false;
    }

    // to-do: correctStats
    // checks if stats are invalid
    // fixes them so they are valid, however you choose
    public static void correctStats(Monster monster) {
        if (monster == null) {
            throw new IllegalArgumentException("Cannot validate a nonexistent monster!");
        }

        if (!validateElement(monster)) {
            monster.setElement(ElementType.FIRE);
        }

        if (!validateStats(monster)) {
            monster.setAttack(62);
            monster.setDefense(62);
            monster.setHealth(62);
            monster.setSpeed(62);
        }
    }

    // to-do: startBattle
    // each monster takes turn attacking the other until a monster's hp reaches 0. It returns the
    // winning monster.
    public static Monster startBattle(Monster monster1, Monster monster2) {
        if (monster1 == null || monster2 == null) {
            throw new IllegalArgumentException("Cannot start a battle with nonexistent monsters!");
        }
        correctStats(monster1);
        correctStats(monster2);
        Monster winner = null;
        int turn = (int) ((Math.random() * 9) + 1);

        System.out.println(monster1.getName() + " wants to fight!");
        System.out.println(monster2.getName() + " wants to fight!");
        while (winner == null) {
            displayStatus(monster1, monster2);
            if (turn % 2 == 1) { // monster1 turn
                if (monster1.getHealth() <= 0) {
                    System.out.println(monster1.getName() + " has fainted!");
                    winner = monster2;
                    break;
                }
                monster1.attack(monster2);
                turn = 2;
            } else {
                if (monster2.getHealth() <= 0) {
                    System.out.println(monster2.getName() + " has fainted!");
                    winner = monster1;
                    break;
                }
                monster2.attack(monster1);
                turn = 1;
            }
        }

        System.out.println(winner.victoryNoise());
        return winner;
    }

    // last-monster-standing tournament
    public static Monster startTourney(ArrayList<Monster> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Cannot start a tourney with nonexistent monsters!");
        }

        // filter for valid monsters
        ArrayList<Monster> fighters = new ArrayList<Monster>();
        for (Monster monster : list) {
            if (monster == null) {
                continue;
            }
            fighters.add(monster);
        }

        if (fighters.isEmpty()) {
            System.out.println("No valid monsters - No winner!");
            return null;
        }

        // running the tourney
        Monster victor = fighters.get(0);
        int round = 1;
        while (fighters.size() > 1) {
            Monster challenger = fighters.get((fighters.indexOf(victor)) + 1);
            // test later to ensure functionality of challenger index
            int victorHP = victor.getHealth(); // to heal back to max hp later
            int challengerHP = challenger.getHealth();
            System.out.println(
                    "\nRound " + round + ": " + victor.getName() + " vs. " + challenger.getName());
            Monster roundWinner = startBattle(victor, challenger);
            if (roundWinner.equals(victor)) {
                System.out.println(challenger.getName() + " has been eliminated.");
                fighters.remove(challenger);
                victor.setHealth(victorHP);
            } else {
                System.out.println(victor.getName() + " has been eliminated.");
                fighters.remove(victor);
                challenger.setHealth(challengerHP);
                victor = challenger;
            }
            round++;
        }

        return victor;
    }

    // to-do: displayStatus
    // method prints out the current health of each monster.
    public static void displayStatus(Monster monster, Monster opponent) {
        if (monster == null || opponent == null) {
            throw new IllegalArgumentException("Cannot display status of nonexistent monsters!");
        }
        String header = "== Status ==";
        String monStats = monster.getName() + ": " + monster.getHealth() + " HP";
        String oppStats = opponent.getName() + ": " + opponent.getHealth() + " HP";
        String output = header + "\n" + monStats + " vs. " + oppStats;

        System.out.println(output);
    }
}
