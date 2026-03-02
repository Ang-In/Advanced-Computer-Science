public class BaldEagle extends Animal {
    // instance variables
    private final String scientificName;
    private final String habitat;
    private final String diet;
    private final int averageLifespan;
    private final String movementMethod;
    private final String conservationStatus;
    private double wingspan;
    private boolean isNesting;

    // constructors
    public BaldEagle(String name, double age, boolean isAlive, double hunger, double weight,
            int speed, double wingspan, boolean isNesting) {
        setName(name);
        setAge(age);
        setWeight(weight);
        setSpeed(speed);
        setAlive(isAlive);
        this.hunger = hunger;
        this.wingspan = wingspan;
        this.isNesting = isNesting;

        // species facts
        this.scientificName = "Haliaeetus leucocephalus";
        this.habitat = "North America - near large bodies of open water";
        this.diet = "Carnivore - fish, waterfowl, and small mammals";
        this.averageLifespan = 20;
        this.movementMethod = "Flies";
        this.conservationStatus = "Least Concern";
    }

    public BaldEagle() {
        setName("Bald Eagle");
        setAge(0);
        setWeight(5.8);
        setSpeed(120);
        setAlive(true);
        this.hunger = 50.0;
        this.wingspan = 200.0;
        this.isNesting = false;

        // species facts
        this.scientificName = "Haliaeetus leucocephalus";
        this.habitat = "North America - near large bodies of open water";
        this.diet = "Carnivore - fish, waterfowl, and small mammals";
        this.averageLifespan = 20;
        this.movementMethod = "Flies";
        this.conservationStatus = "Least Concern";
    }

    // getters
    public double getHunger() {
        return hunger;
    }

    public double getWingspan() {
        return wingspan;
    }

    public boolean isNesting() {
        return isNesting;
    }

    // final variables
    public String getScientificName() {
        return scientificName;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getDiet() {
        return diet;
    }

    public double getAverageLifespan() {
        return averageLifespan;
    }

    public String getMovementMethod() {
        return movementMethod;
    }

    public String getConservationStatus() {
        return conservationStatus;
    }

    // setters
    public void setHunger(double hunger) {
        if (hunger < 0) {
            hunger = 0;
        } else if (hunger > 100) {
            hunger = 100;
        }

        this.hunger = hunger;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public void setNesting(boolean isNesting) {
        this.isNesting = isNesting;
    }

    // inherited methods
    public boolean equals(BaldEagle other) {
        if (!(this.getName().equals(other.getName()))) {
            return false;
        }
        if (this.getAge() != other.getAge()) {
            return false;
        }
        if (this.isAlive() != other.isAlive()) {
            return false;
        }
        if (this.hunger != other.hunger) {
            return false;
        }
        if (this.getWeight() != other.getWeight()) {
            return false;
        }
        if (this.getSpeed() != other.getSpeed()) {
            return false;
        }
        if (this.wingspan != other.wingspan) {
            return false;
        }
        if (this.isNesting != other.isNesting) {
            return false;
        }

        return true;
    }

    public String toString() {
        String output = "== Bald Eagle Records ==";

        // specimen details
        String outName = "\nName: " + getName();
        String outScientificName = "\nScientific Name: " + scientificName;
        String outAlive = "\nAlive: " + isAlive();
        String outAge = "\nAge: " + getAge();
        String outWeight = "\nWeight: " + getWeight();
        String outHunger = "\nHunger: " + hunger;
        String outWingspan = "\nWingspan: " + wingspan + " cm";
        String outSpeed = "\nSpeed: " + getSpeed();
        String outNesting = "\nNesting: " + isNesting;
        String specimenDetails = outName + outScientificName + outAlive + outAge + outWeight
                + outHunger + outWingspan + outSpeed + outNesting;

        // general species details
        String outHabitat = "\nHabitat: " + habitat;
        String outDiet = "\nDiet: " + diet;
        String outLifespan = "\nAverage Lifespan: " + averageLifespan;
        String outMovement = "\nMovement: " + movementMethod;
        String outConservation = "\nConservation Status: " + conservationStatus;
        String speciesDetails = outHabitat + outDiet + outLifespan + outMovement + outConservation;

        return output + specimenDetails + speciesDetails;
    }

    // methods
    public void feed() {
        if (!(this.isAlive())) {
            throw new IllegalArgumentException("A dead eagle cannot feed!");
        }

        if (hunger > 0) {
            hunger -= 20.0;
            if (hunger < 0)
                hunger = 0;
            System.out.println(getName() + " has been fed. Hunger level: " + hunger);
        } else {
            System.out.println(getName() + " is not hungry.");
        }
    }

    public void hunt() {
        if (!(this.isAlive())) {
            throw new IllegalArgumentException("A dead eagle cannot hunt!");
        }
        if (isNesting) {
            nest();
        }

        System.out.println(
                getName() + " dives at " + (int) (getSpeed() * 1.3) + " km/h! -30 Hunger!");
        hunger -= 30.0;
        if (hunger < 0) {
            hunger = 0;
        }
        System.out.println("Hunger level after hunt: " + hunger);
    }

    public void nest() {
        if (!(this.isAlive())) {
            throw new IllegalArgumentException("A dead eagle cannot nest!");
        }

        if (isNesting) {
            System.out.println(getName() + " has stopped nesting.");
        } else {
            System.out.println(getName() + " is nesting...");
        }
    }
}
