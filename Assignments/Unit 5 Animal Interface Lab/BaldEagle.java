public class BaldEagle extends Animal implements Flyable, Predator {
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
                + " live for 20 years on average, but the oldest recorded wild eagle lived for 38 years- almost double the average!";
        this.movementMethodFact = getScientificName() + " ";
        this.conservationStatusFact = getScientificName()
                + " has a conservation status of \"Least Concern\", but they used to be hunted extensively to the point where they were at risk of becoming extinct in the wild within the United States.";
        this.miscFact = getScientificName()
                + " make the largest tree nests ever recorded out of every species on Earth, up to 4 meters deep and 2.5 meters wide.";

        String[] eagleFacts = {dietFact, averageLifespanFact, movementMethodFact,
                conservationStatusFact, miscFact};
        facts = eagleFacts;
    }

    public BaldEagle() {
        super("Bald Eagle", "Accipitriformes", "Accipitridae", "Haliaeetus", "leucocephalus",
                "North America - near large bodies of open water");
        setSpecimenName("American Bald Eagle");
        setWingspan(2);
        setNesting(false);

        // species facts
        this.dietFact = getScientificName()
                + " are carnivores- they eat fish, waterfowl, and small mammals, though they fish via swooping and snatching them straight from a body of water.";
        this.averageLifespanFact = getScientificName()
                + " live for 20 years on average, but the oldest recorded wild eagle lived for 38 years- almost double the average!";
        this.movementMethodFact = getScientificName()
                + " can migrate: if the nearest water source is unavailable during the wintertime via freezing over, they will migrate to a coast or southward.";
        this.conservationStatusFact = getScientificName()
                + " has a conservation status of \"Least Concern\", but they used to be hunted extensively to the point where they were at risk of becoming extinct in the wild within the United States.";
        this.miscFact = getScientificName()
                + " make the largest tree nests ever recorded out of every species on Earth, up to 4 meters deep and 2.5 meters wide.";

        String[] eagleFacts = {dietFact, averageLifespanFact, movementMethodFact,
                conservationStatusFact, miscFact};
        facts = eagleFacts;
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
        if (!(this.getSpecimenName().equals(other.getSpecimenName()))) {
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
    // public String toString() {
    // String output = "== Bald Eagle Records ==";

    // // specimen details
    // String outName = "\nName: " + getName();
    // String outScientificName = "\nScientific Name: " + getScientificName();
    // String outAlive = "\nAlive: " + isAlive();
    // String outAge = "\nAge: " + getAge();
    // String outWeight = "\nWeight: " + getWeight();
    // String outHunger = "\nHunger: " + hunger;
    // String outWingspan = "\nWingspan: " + wingspan + " cm";
    // String outSpeed = "\nSpeed: " + getSpeed();
    // String outNesting = "\nNesting: " + isNesting;
    // String specimenDetails = outName + outScientificName + outAlive + outAge + outWeight
    // + outHunger + outWingspan + outSpeed + outNesting;

    // // general species details
    // String outHabitat = "\nHabitat: " + habitat;
    // String outDiet = "\nDiet: " + diet;
    // String outLifespan = "\nAverage Lifespan: " + averageLifespan;
    // String outMovement = "\nMovement: " + movementMethod;
    // String outConservation = "\nConservation Status: " + conservationStatus;
    // String speciesDetails = outHabitat + outDiet + outLifespan + outMovement + outConservation;

    // return output + specimenDetails + speciesDetails;
    // }

    public String getFact(int index) {
        return facts[index];
    }

    public String getFact() {
        return facts[Utils.generateRandomInt(0, 5)];
    }

    // Basic Behaviors
    public void makeSound() {
        System.out
                .println("The eagle makes a few weak, staccato whistles: \"Kleek kik ik ik ik!\"");
    }

    public void eat() {
        System.out.println("The sound of tearing flesh ensues as the eagle consumes a fish.");
    }

    public void move() {
        System.out.println("Strong wingflaps are heard as the eagle soars to its destination.");
    }

    public String getSoundDescription() {
        return "The eagle makes a few weak, staccato whistles: \"Kleek kik ik ik ik!\"";
    }

    public String getEatDescription() {
        return "The sound of tearing flesh ensues as the eagle consumes a fish.";
    }

    public String getMoveDescription() {
        return "Strong wingflaps are heard as the eagle soars to its destination.";
    }

    // methods (interfaces)
    // Flyable
    public double getFlightSpeed() {
        return 63.0;
    }

    public double getMaxAltitude() {
        return 27.0;
    }

    // Basic Behaviors
    public void takeOff() {
        System.out.println(
                "The eagle spreads its wings and flaps once, soaring into the air with grace.");
    }

    public void fly() {
        System.out.println("The eagle flaps its wings occasionally, gliding with the winds.");
    }

    public void land() {
        System.out.println(
                "The eagle flaps its wings rapidly to control its descent, before landing with grace.");
    }

    // Predator
    public String getPrimaryPrey() {
        return "Fish";
    }

    public double getAveragePreyMass() {
        return 0.16; // kg
    }

    // Basic Behaviors - BE CREATIVE

    public void stalkPrey() {
        System.out
                .println("The eagle circles the body of water, searching for which fish to hunt.");
    }

    public void attackPrey() {
        System.out.println(
                "The eagle dives at blistering speeds, snatching the fish straight from the water before flying to shore.");
    }

    public void eatPrey() {
        System.out.println(
                "The eagle feasts in solitude, using its beak to tear open the fish and fill its stomach.");
    }
}
