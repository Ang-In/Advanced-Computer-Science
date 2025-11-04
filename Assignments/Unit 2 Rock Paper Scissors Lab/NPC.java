public class NPC {
    // instance variables
    String choice;

    // constructors
    public NPC() {
        choice = RPSGame.generateRandomChoice();
    }

    // getters and setters
    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        choice = choice.toLowerCase();
        if (RPSGame.validateChoice(choice)) {
            this.choice = choice;
        } else {
            this.choice = RPSGame.generateRandomChoice();
        }
    }

    // methods
    public String toString() {
        return "Opponent chose " + choice + ".";
    }

}
