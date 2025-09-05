// camelCase -> was to write variable names, standard for Java

// Ex:
// A -> thefoxjumpedoverthelazydog
// B -> TheFoxJumpedOverTheLazyDog

// first letter lowercase if it's a variable name or a method name
// first letter capital if it's a class name

// a class is a blueprint for a new data type
// -> not the object itself, but a plan for one

public class Spaceship {

    // instance variables
    private String description;
    private int passengerCount;
    private double fuelLevel;
    private boolean shieldsActive;

    // constructors

    public Spaceship(String desc, int peopleCount, double fuelLvl, boolean shieldStatus) {
        description = desc;
        passengerCount = peopleCount;
        fuelLevel = fuelLvl;
        shieldsActive = shieldStatus;
    }

    // methods

    // getters (aka accessors)

    public String getDescription() {
        return description;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public boolean getShieldsActive() {
        return shieldsActive;
    }


    // setters (these methods are void)

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public void setShieldsActive(boolean shieldsActive) {
        this.shieldsActive = shieldsActive;
    }

    // Challenge: use 3 setters to ubdate the values of 3 different instance variables, make sure to print before and after the update

}
