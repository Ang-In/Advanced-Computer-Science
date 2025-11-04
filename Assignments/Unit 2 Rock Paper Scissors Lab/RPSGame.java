import java.util.Scanner;

public class RPSGame {
    // instance variables
    private Player player;
    private NPC opponent;

    // constructors
    public RPSGame(Player player, NPC opponent) {
        this.player = player;
        this.opponent = opponent;
    }

    // methods
    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("What is your choice: rock, paper, or scissors?");
        String choice = scanner.nextLine();
        int failedAttempts = 0;

        while (!validateChoice(choice.toLowerCase())) {
            failedAttempts++;
            if (failedAttempts == 3) {
                System.out.println("Too many invalid choices! Assigning a random choice...");
                break;
            }

            System.out.println(
                    "Invalid choice! You have " + (3 - failedAttempts) + " attempts remaining.");
            System.out.println("What is your choice: rock, paper, or scissors?");
            choice = scanner.nextLine();
        }

        setPlayerValues(name, choice);
    }

    public void setPlayerValues(String name, String choice) {
        player.setName(name);
        player.setChoice(choice);
    }

    public boolean didPlayerWin() {
        if (player.getChoice().equals("rock") && opponent.getChoice().equals("scissors")) {
            return true;
        }
        if (player.getChoice().equals("paper") && opponent.getChoice().equals("rock")) {
            return true;
        }
        if (player.getChoice().equals("scissors") && opponent.getChoice().equals("paper")) {
            return true;
        }
        return false;
    }

    public String toString() {
        if (didPlayerWin()) {
            return player.getName() + " won!\nCongratulations!";
        } else {
            return "Opponent won!\nBetter luck next time!";
        }
    }

    public String displayResults() {
        return player.toString() + "\n" + opponent.toString() + "\n" + toString();
    }

    // static methods
    public static boolean validateChoice(String choice) {
        while (!(choice.equals("rock") || choice.equals("paper") || choice.equals("scissors"))) {
            return false;
        }
        return true;
    }

    public static String generateRandomChoice() {
        int randInt = (int) (Math.random() * 3);
        if (randInt == 0) {
            return "rock";
        } else if (randInt == 1) {
            return "paper";
        } else {
            return "scissors";
        }
    }

}
