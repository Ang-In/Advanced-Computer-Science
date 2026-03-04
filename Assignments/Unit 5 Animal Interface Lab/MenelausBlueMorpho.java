public class MenelausBlueMorpho extends Animal implements Flyable, Pettable {
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
        this.dietFact = getScientificName()
                + " are ommivores- they eat rotting fruit, tree sap, or decaying organic matter, not nectar.";
        this.averageLifespanFact =
                getScientificName() + " live for 115 days on average- just under 4 months.";
        this.movementMethodFact =
                getScientificName() + "fly with a slow and floppy flight pattern.";
        this.conservationStatusFact = getScientificName()
                + " have a conservation status of \"Least Concern\", despite collectors prizing these butterflies for their iridescent blue wings.";
        this.miscFact = "The wings of " + getScientificName()
                + " butterflies are hydrophobic: water droplets roll off the surface of their wings in a spherical ball.";

        String[] morphoFacts = {dietFact, averageLifespanFact, movementMethodFact,
                conservationStatusFact, miscFact};
        facts = morphoFacts;
    }

    public MenelausBlueMorpho() {
        super("Menelaus Blue Morpho", " Lepidoptera", "Nymphalidae", "Morpho", "menelaus",
                "Central and South America - Along Rivers & Open Land");
        setSpecimenName("Blue Morpho Butterfly");
        setWingspan(wingspan);
        setCamoflaged(false);

        // species facts
        this.dietFact = getScientificName()
                + " are ommivores- they eat rotting fruit, tree sap, or decaying organic matter, not nectar.";
        this.averageLifespanFact =
                getScientificName() + " live for 115 days on average- just under 4 months.";
        this.movementMethodFact =
                getScientificName() + "fly with a slow and floppy flight pattern.";
        this.conservationStatusFact = getScientificName()
                + " have a conservation status of \"Least Concern\", despite collectors prizing these butterflies for their iridescent blue wings.";
        this.miscFact = "The wings of " + getScientificName()
                + " butterflies are hydrophobic: water droplets roll off the surface of their wings in a spherical ball.";

        String[] morphoFacts = {dietFact, averageLifespanFact, movementMethodFact,
                conservationStatusFact, miscFact};
        facts = morphoFacts;
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
        if (!(this.specimenName.equals(other.specimenName))) {
            return false;
        }
        if (this.wingspan != other.wingspan) {
            return false;
        }
        if (this.isCamouflaged != other.isCamouflaged) {
            return false;
        }
        for (int i = 0; i < facts.length; i++) {
            if (!(this.facts[i].equals(other.facts[i]))) {
                return false;
            }
        }

        return true;
    }

    // to-do: fix toString to work w/ new Animal class
    /*
     * public String toString() { String output = "== Menelaus Blue Morpho Butterfly Records ==";
     * 
     * // specimen details String outName = "\nName: " + getName(); String outScientificName =
     * "\nScientific Name: " + scientificName; String outAlive = "\nAlive: " + isAlive(); String
     * outAge = "\nAge: " + getAge(); String outWeight = "\nWeight: " + getWeight(); String
     * outHunger = "\nHunger: " + hunger; String outWingspan = "\nWingspan: " + wingspan + " cm";
     * String outSpeed = "\nSpeed: " + getSpeed(); String outCamoflaging = "\nCamoflaging: " +
     * isCamouflaged; String specimenDetails = outName + outScientificName + outAlive + outAge +
     * outWeight + outHunger + outWingspan + outSpeed + outCamoflaging;
     * 
     * // general species details String outHabitat = "\nHabitat: " + habitat; String outDiet =
     * "\nDiet: " + diet; String outLifespan = "\nAverage Lifespan: " + averageLifespan; String
     * outMovement = "\nMovement: " + movementMethod; String outConservation =
     * "\nConservation Status: " + conservationStatus; String speciesDetails = outHabitat + outDiet
     * + outLifespan + outMovement + outConservation;
     * 
     * return output + specimenDetails + speciesDetails; }
     */

    public String getFact(int index) {
        return facts[index];
    }

    public String getFact() {
        return facts[Utils.generateRandomInt(0, 5)];
    }

    // Basic Behaviors
    public void makeSound() {
        System.out.println("Soft rustling sounds ensue as the butterfly walks along a surface.");
    }

    public void eat() {
        System.out.println(
                "Very soft slurping sounds ensue as the butterfly consumes some detritus.");
    }

    public void move() {
        System.out.println("Soft wingflaps ensue as the butterfly soars.");
    }

    public String getSoundDescription() {
        return "Soft rustling sounds ensue as the butterfly walks along a surface.";
    }

    public String getEatDescription() {
        return "Very soft slurping sounds ensue as the butterfly consumes some detritus.";
    }

    public String getMoveDescription() {
        return "Soft wingflaps ensue as the butterfly soars.";
    }

    // methods (interface)
    // Flyable
    public double getFlightSpeed() {
        return 8.05;
    }

    public double getMaxAltitude() {
        return 20.0;
    }

    // Basic Behaviors
    public void takeOff() {
        System.out
                .println("The butterfly flaps its wings a few times before soaring into the air.");
    }

    public void fly() {
        System.out.println("The butterfly flaps its wings, which shimmer in the light.");
    }

    public void land() {
        System.out.println(
                "The butterfly flaps its wings rapidly to control its descent, before landing softly.");
    }

    // Pettable
    public int getFriendlinessLevel() {
        return 3;
    }

    public int getEnergyLevel() {
        return 7;
    }

    // Basic Behaviors - BE CREATIVE

    public void greetHuman() {
        System.out.println("The butterfly flaps its wings, fluttering about its enclosure.");
    }

    // prints out how the animal reacts when it is being petted
    public void bePetted() {
        System.out.println("The butterfly flies away, spooked.");
    }

    public void playWithHuman() {
        System.out.println(
                "The butterfly waves its wings around, showing off it's multiple colorations.");
    }

}
