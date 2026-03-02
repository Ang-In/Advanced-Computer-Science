public class MenelausBlueMorpho extends Animal {
    // instance variables
    private final String scientificName;
    private final String habitat;
    private final String diet;
    private final int averageLifespan;
    private final String movementMethod;
    private final String conservationStatus;
    private double wingspan;
    private boolean isCamouflaged;

    // constructors
    public MenelausBlueMorpho(String name, double age, boolean isAlive, double hunger, double weight,
            int speed, double wingspan, boolean isCamouflaged) {
        setName(name);
        setAge(age);
        setAlive(isAlive);
        setHunger(hunger);
        setWeight(weight);
        setSpeed(speed);
        this.wingspan = wingspan;
        this.isCamouflaged = isCamouflaged;

        // species facts
        this.scientificName = "Morpho menelaus";
        this.habitat = "Central and South America - Along Rivers & Open Land";
        this.diet = "Omnivores - Rotting Fruit, Tree Sap, Decaying Organic Matter";
        this.averageLifespan = 115;
        this.movementMethod = "Flies";
        this.conservationStatus = "Least Concern";
    }

    public MenelausBlueMorpho() {
        setName("Menelaus Blue Morpho");
        setAge(61);
        setAlive(true);
        setHunger(50);
        setWeight(0.4);
        setSpeed(5);
        this.hunger = 50;
        this.wingspan = 12;
        this.isCamouflaged = false;

        // species facts
        this.scientificName = "Morpho menelaus";
        this.habitat = "Central and South America - Along Rivers & Open Land";
        this.diet = "Omnivores - Rotting Fruit, Tree Sap, Decaying Organic Matter";
        this.averageLifespan = 115;
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

    public boolean isCamouflaged() {
        return isCamouflaged;
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
