public class SpaceTester {

    public static void main(String[] args) {
        // 1. instantiate a spaceship (make an instance of Spaceship)
        Spaceship ship = new Spaceship("a rusting ship from the 1990s", 25, 50.0, true);
        // new -> creates a new object (new instance of Spaceship)

        // 2. invoke a method
        String shipDesc = ship.getDescription();
        int shipPassengerCount = ship.getPassengerCount();
        double shipFuel = ship.getFuelLevel();

        System.out.println("Before setters:");
        System.out.println(shipDesc);
        System.out.println(shipPassengerCount);
        System.out.println(shipFuel);

        // 3. manipulate the data
        ship.setDescription("A refurbished ship, originally from the 1990s");
        ship.setPassengerCount(125);
        ship.setFuelLevel(100.0);

        shipDesc = ship.getDescription();
        shipPassengerCount = ship.getPassengerCount();
        shipFuel = ship.getFuelLevel();

        System.out.println("After setters:");
        System.out.println(shipDesc);
        System.out.println(shipPassengerCount);
        System.out.println(shipFuel);
    }

}
