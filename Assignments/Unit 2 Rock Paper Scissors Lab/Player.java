public class Player {
    // instance variables
    String name;
    String choice;

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        choice = choice.toLowerCase();
        if(RPSGame.validateChoice(choice)){
            this.choice = choice;
        } else {
            this.choice = RPSGame.generateRandomChoice();
        }
    }

    // methods
    public String toString() {
        return name + " chose " + choice + ".";
    }
}
