public class CarTester {
    public static void main(String[] args) {
        // testing constructors + toString()
        Car newCar = new Car();
        System.out.println("newCar (base constructor):\n" + newCar.toString());
        System.out.println();

        // testing setters
        newCar.setModel("Placeholder");
        newCar.setOwnerName("     Cornelia        Lovelace     "); // edge case
        newCar.setUsername("love drama");
        newCar.setCleanlinessLevel(-10); // edge case
        newCar.setNeedsOilChange(true);
        System.out.println("newCar (after setters):\n" + newCar.toString());
        System.out.println();

        // testing equals() & other constructor
        Car otherCar = new Car("Placeholder", "Cornelia Lovelace", 0);
        otherCar.setUsername("love drama"); // matching newCar
        otherCar.setNeedsOilChange(true); // matching newCar
        System.out.println("Are newCar and otherCar equal: " + newCar.equals(otherCar)); // true
        System.out.println();

        // testing cleanCar()
        System.out.println("Before cleaning: " + newCar.getCleanlinessLevel());
        AutoUtils.cleanCar(newCar);
        System.out.println("After cleaning: " + newCar.getCleanlinessLevel());
        System.out.println();
    }
}
