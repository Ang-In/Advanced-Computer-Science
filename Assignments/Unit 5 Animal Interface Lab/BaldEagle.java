public class BaldEagle extends Animal {
    // instance variables
    private final String dietFact;
    private final String averageLifespanFact;
    private final String movementMethodFact;
    private final String conservationStatusFact;
    private final String miscFact;
    private String specimenName;
    private double wingspan;
    private boolean isNesting;
    private String[] facts;

    // constructors
    public BaldEagle(String specimenName, double wingspan, boolean isNesting) {
        super("Bald Eagle", "Accipitriformes", "Accipitridae", "Haliaeetus", "leucocephalus",
                "North America - near large bodies of open water");
        setSpecimenName(specimenName);
        setWingspan(wingspan);
        setNesting(isNesting);

        // species facts
        this.dietFact = getScientificName()
                + " are carnivores- they eat fish, waterfowl, and small mammals, though they fish via swooping and snatching them straight from a body of water.";
        this.averageLifespanFact = getScientificName()
                + " butterflies live for 115 days on average- just under 4 months.";
        this.movementMethodFact =
                getScientificName() + " butterflies fly with a slow and floppy flight pattern.";
        this.conservationStatusFact = getScientificName()
                + " has a conservation status of \"Least Concern\", despite collectors prizing these butterflies for their iridescent blue wings.";
        this.miscFact = "The wings of " + getScientificName()
                + " butterflies are hydrophobic: water droplets roll off the surface of their wings in a spherical ball.";

        String[] morphoFacts = {dietFact, averageLifespanFact, movementMethodFact,
                conservationStatusFact, miscFact};
        facts = morphoFacts;

        // species facts
        this.scientificName = "Haliaeetus leucocephalus";
        this.habitat = "North America - near large bodies of open water";
        this.diet = "Carnivore - fish, waterfowl, and small mammals";
        this.averageLifespan = 20;
        this.movementMethod = "Flies";
        this.conservationStatus = "Least Concern";
    }

    public BaldEagle() {
        super("Bald Eagle", "Accipitriformes", "Accipitridae", "Haliaeetus", "leucocephalus",
                "North America - near large bodies of open water");
        setSpecimenName(specimenName);
        setWingspan(wingspan);
        setNesting(false);

        // species facts
        this.scientificName = "Haliaeetus leucocephalus";
        this.habitat = "North America - near large bodies of open water";
        this.diet = "Carnivore - fish, waterfowl, and small mammals";
        this.averageLifespan = 20;
        this.movementMethod = "Flies";
        this.conservationStatus = "Least Concern";
    }

    // getters
    public String getSpecimenName() {
        return specimenName;
    }

    public double getWingspan() {
        return wingspan;
    }

    public boolean isNesting() {
        return isNesting;
    }

    public String[] getFacts() {
        return facts;
    }

    // final variables
    public String getDietFact() {
        return dietFact;
    }

    public String getAverageLifespanFact() {
        return averageLifespanFact;
    }

    public String getMovementMethodFact() {
        return movementMethodFact;
    }

    public String getConservationStatusFact() {
        return conservationStatusFact;
    }

    public String getMiscFact() {
        return miscFact;
    }

    // setters
    public void setSpecimenName(String specimenName) {
        if (specimenName == null || specimenName.equals("")) {
            throw new IllegalArgumentException("Cannot set specimen name to nothing!");
        }

        this.specimenName = specimenName;
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

    // to-do: fix toString to work w/ new Animal class
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
