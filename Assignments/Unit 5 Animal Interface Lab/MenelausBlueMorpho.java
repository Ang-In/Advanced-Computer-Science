public class MenelausBlueMorpho extends Animal {
    // instance variables
    private final String dietFact;
    private final String averageLifespanFact;
    private final String movementMethodFact;
    private final String conservationStatusFact;
    private final String miscFact;
    private String specimenName;
    private double wingspan;
    private boolean isCamouflaged;
    private String[] facts;

    // constructors
    public MenelausBlueMorpho(String specimenName, double wingspan, boolean isCamouflaged) {
        super("Menelaus Blue Morpho", " Lepidoptera", "Nymphalidae", "Morpho", "menelaus",
                "Central and South America - Along Rivers & Open Land");
        setSpecimenName(specimenName);
        setWingspan(wingspan);
        setCamoflaged(isCamouflaged);

        // species facts
        this.dietFact = getScientificName() + " are ommivores- they eat rotting fruit, tree sap, or decaying organic matter, not nectar.";
        this.averageLifespanFact = getScientificName() + " live for 115 days on average- just under 4 months.";
        this.movementMethodFact = getScientificName() + "fly with a slow and floppy flight pattern.";
        this.conservationStatusFact = getScientificName() + " have a conservation status of \"Least Concern\", ";
        this.facts =  
    }

    public MenelausBlueMorpho() {
        super("Menelaus Blue Morpho", " Lepidoptera", "Nymphalidae", "Morpho", "menelaus",
                "Central and South America - Along Rivers & Open Land");
        setSpecimenName("Blue Morpho Butterfly");
        setWingspan(wingspan);
        setCamoflaged(false);

        // species facts
        this.diet = "Omnivores - Rotting Fruit, Tree Sap, Decaying Organic Matter";
        this.averageLifespan = 115;
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

    public boolean isCamouflaged() {
        return isCamouflaged;
    }

    // final variables
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
    public void setSpecimenName(String specimenName) {
        if (specimenName == null || specimenName.equals("")) {
            throw new IllegalArgumentException("Cannot set specimen name to nothing!");
        }

        this.specimenName = specimenName;
    }

    public void setWingspan(double wingspan) {
        if (wingspan < 12) {
            throw new IllegalArgumentException("Minimum Wingspan is 12 cm!");
        } else if (wingspan > 18) {
            throw new IllegalArgumentException("Maximum Wingspan is 18 cm!");
        }

        this.wingspan = wingspan;
    }

    public void setCamoflaged(boolean isCamouflaged) {
        this.isCamouflaged = isCamouflaged;
    }

    // inherited methods
    public boolean equals(MenelausBlueMorpho other) {
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

        return false;
    }

    public String toString() {
        String output = "== Menelaus Blue Morpho Butterfly Records ==";

        // specimen details
        String outName = "\nName: " + getName();
        String outScientificName = "\nScientific Name: " + scientificName;
        String outAlive = "\nAlive: " + isAlive();
        String outAge = "\nAge: " + getAge();
        String outWeight = "\nWeight: " + getWeight();
        String outHunger = "\nHunger: " + hunger;
        String outWingspan = "\nWingspan: " + wingspan + " cm";
        String outSpeed = "\nSpeed: " + getSpeed();
        String outCamoflaging = "\nCamoflaging: " + isCamouflaged;
        String specimenDetails = outName + outScientificName + outAlive + outAge + outWeight
                + outHunger + outWingspan + outSpeed + outCamoflaging;

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
            throw new IllegalArgumentException("A dead butterfly cannot feed!");
        }

        System.out.println(getName() + " has fed!");
        setHunger(hunger - 10);
    }

    public void mate(MenelausBlueMorpho other) {
        if (!(this.isAlive()) || !(other.isAlive())) {
            throw new IllegalArgumentException("Cannot mate with a dead butterfly!");
        }

        System.out.println(this.getName() + " is mating with " + other.getName() + "!");
    }

    public void camoflage() {
        if (!(this.isAlive())) {
            throw new IllegalArgumentException("A dead butterfly cannot move!");
        }

        if (isCamouflaged) {
            System.out.println(getName() + " has stopped displaying its eyespots.");
        } else {
            System.out.println(getName() + " is displaying its eyespots!");
        }
    }
}
