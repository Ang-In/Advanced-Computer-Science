public class MenelausCaterpillar extends Animal {
    // instance variables
    private final String scientificName;
    private final String habitat;
    private final String diet;
    private final double averageLifespan;
    private final String movementMethod;
    private final String conservationStatus;
    private boolean isPupating;

    // constructors
    public MenelausCaterpillar(String name, double age, boolean isAlive, double hunger,
            double weight, int speed, double wingspan, boolean isPupating) {
        setName(name);
        setAge(age);
        setAlive(isAlive);
        setHunger(hunger);
        setWeight(weight);
        setSpeed(speed);
        this.isPupating = isPupating;

        // species facts
        this.scientificName = "Morpho menelaus";
        this.habitat = "Central and South America - Along Food Source Plants";
        this.diet = "Hervivores - Leaves of Erythroxylum, Dalbergia, and Fabaceae Plants";
        this.averageLifespan = 115;
        this.movementMethod = "Crawls";
        this.conservationStatus = "Least Concern";
    }

    // getters
    public double getHunger() {
        return hunger;
    }

    public boolean isPupating() {
        return isPupating;
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

    public void setPupating(boolean isPupating) {
        this.isPupating = isPupating;
    }

    // inherited methods
    public boolean equals(MenelausCaterpillar other) {
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
        if (this.isPupating != other.isPupating) {
            return false;
        }

        return false;
    }

    public String toString() {
        String output = "== Menelaus Blue Morpho Caterpillar Records ==";

        // specimen details
        String outName = "\nName: " + getName();
        String outScientificName = "\nScientific Name: " + scientificName;
        String outAlive = "\nAlive: " + isAlive();
        String outAge = "\nAge: " + getAge();
        String outWeight = "\nWeight: " + getWeight();
        String outHunger = "\nHunger: " + hunger;
        String outSpeed = "\nSpeed: " + getSpeed();
        String outPupating = "\nPupating: " + isPupating;
        String specimenDetails = outName + outScientificName + outAlive + outAge + outWeight
                + outHunger + outSpeed + outPupating;

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
    public void pupate() {
        if (!(this.isAlive())) {
            throw new IllegalArgumentException("A dead caterpillar cannot pupate!");
        }
        if (hunger == 0 && getAge() > 56) {
            isPupating = true;
        }
    }

    public MenelausBlueMorpho metamorphose() {
        if (!(this.isAlive())) {
            throw new IllegalArgumentException("A dead caterpillar cannot metamorphose!");
        }
        if (!isPupating) {
            throw new IllegalArgumentException(
                    "This caterpillar hasn't pupated yet - cannot metamorphose!");
        }

        System.out.println(getName() + "has metamorphosed into a butterfly!");
        MenelausBlueMorpho metamorphosed =
                new MenelausBlueMorpho(getName(), getAge() + 14, true, 50.0, 0.4, 5, 12.0, false);
        return metamorphosed;
    }

    public void feed() {
        if (!(this.isAlive())) {
            throw new IllegalArgumentException("A dead caterpillar cannot pupate!");
        }
        if (isPupating) {
            throw new IllegalArgumentException("This caterpillar is pupating - it cannot feed!");
        }

        System.out.println(getName() + " has fed!");
        setHunger(hunger - 10);

    }
}
