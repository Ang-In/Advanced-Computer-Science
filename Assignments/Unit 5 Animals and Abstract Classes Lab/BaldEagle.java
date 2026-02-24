public class BaldEagle extends Animal {
    // instance variables
    private String scientificName;
    private String habitat;
    private String diet;
    private double averageLifespan;
    private String movementMethod;
    private String conservationStatus;
    private double wingspan;
    private boolean isNesting;

    // constructors
    public BaldEagle() {
        setName("Bald Eagle");
        setAge(0);
        setWeight(5.8);
        setSpeed(120);
        setAlive(true);
        hunger = 50.0;
        scientificName = "Haliaeetus leucocephalus";
        habitat = "North America - near large bodies of open water";
        diet = "Carnivore - fish, waterfowl, and small mammals";
        averageLifespan = 20.0;
        movementMethod = "Flies";
        conservationStatus = "Least Concern";
        wingspan = 200.0;
        isNesting = false;
    }

    public BaldEagle(String name, double age, double weight, int speed, double hunger,
            String habitat, String diet, double averageLifespan, String conservationStatus,
            double wingspan, boolean isNesting) {
        setName(name);
        setAge(age);
        setWeight(weight);
        setSpeed(speed);
        setAlive(true);
        this.hunger = hunger;
        this.scientificName = "Haliaeetus leucocephalus";
        this.habitat = habitat;
        this.diet = diet;
        this.averageLifespan = averageLifespan;
        this.movementMethod = "Flies";
        this.conservationStatus = conservationStatus;
        this.wingspan = wingspan;
        this.isNesting = isNesting;
    }

    // getters
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

    public double getWingspan() {
        return wingspan;
    }

    public boolean isNesting() {
        return isNesting;
    }

    // setters
    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public void setAverageLifespan(double averageLifespan) {
        this.averageLifespan = averageLifespan;
    }

    public void setMovementMethod(String movementMethod) {
        this.movementMethod = movementMethod;
    }

    public void setConservationStatus(String conservationStatus) {
        this.conservationStatus = conservationStatus;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public void setNesting(boolean isNesting) {
        this.isNesting = isNesting;
    }

    // inherited methods
    public boolean equals(BaldEagle other) {
        return super.equals(other);
    }

    // to-do: fix toString formatting
    public String toString() {
        return "Bald Eagle: " + getName() + "\n Scientific Name: " + scientificName + "\n Age: "
                + getAge() + "\n Weight: " + getWeight() + "\n Speed: " + getSpeed()
                + "\n Wingspan: " + wingspan + " cm" + "\n Is Nesting: " + isNesting
                + "\n Habitat: " + habitat + "\n Diet: " + diet + "\n Average Lifespan: "
                + averageLifespan + "\n Movement: " + movementMethod + "\n Conservation Status: "
                + conservationStatus + "\n Hunger: " + hunger + "\n Alive: " + isAlive();
    }

    // methods
    public void feed() {
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
        System.out
                .println(getName() + " dives at " + (int) (getSpeed() * 1.3) + " km/h! +30 Food!");
        hunger -= 30.0;
        if (hunger < 0) {
            hunger = 0;
        }
        System.out.println("Hunger level after hunt: " + hunger);
    }
}
