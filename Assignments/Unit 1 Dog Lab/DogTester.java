public class DogTester {
    public static void main(String[] args) {
        // Day 1
        Dog sammy = new Dog("Sammy", "Cornelia", 12, 693);
        Dog standard = new Dog();
        Dog bestBoy = new Dog("Fido", "Wish", 3, 123);

        // getter + setter test
        System.out.println("Initial dog values:");
        System.out.println(sammy);
        System.out.println(standard);
        System.out.println(bestBoy);

        standard.setName("Puffball");
        bestBoy.setAge(4);

        System.out.println("Updated dog values:");
        System.out.println(sammy);
        System.out.println(standard);
        System.out.println(bestBoy);

        // specialized methods test
        System.out.println("Dog char for ID 123: " + Dog.generateDogChar(bestBoy.getDogId()));
        System.out.println("Dog char for ID 693: " + Dog.generateDogChar(sammy.getDogId()));
        System.out.println("ToString for each dog:");
        System.out.println("Sammy: " + sammy.toString());
        System.out.println("Standard: " + standard.toString());
        System.out.println("bestBoy: " + bestBoy.toString());


        // equals method test
        System.out.println("Are Sammy and Standard equal: " + sammy.equals(standard));
        Dog dupeBestBoy = new Dog("Fido", "Wish", 4, 123);
        System.out.println("Are bestBoy and dupeBestBoy equal: " + bestBoy.equals(dupeBestBoy));

        // edge case test
        bestBoy.setStillInFacility(false);
        System.out.println("Updated toString for dog outside facility:");
        System.out.println(bestBoy.toString());

        // Day 2

        // Static Dog.generateDogChar() test
        System.out.println("dogChar for ID 123: " + Dog.generateDogChar(123)); // should return 'L'
        System.out.println("dogChar for ID 456: " + Dog.generateDogChar(456)); // should return 'K'
        System.out.println("dogChar for ID 789: " + Dog.generateDogChar(789)); // should return 'J'

        // Static Dog.pickup() test
        Dog myDog = new Dog("Cream", "Maria", 9, 101);
        System.out.println(Dog.pickup(myDog, "Maria")); // should print correct message
        System.out.println(Dog.pickup(myDog, "John")); // should print error message

        // Static Dog.checkIn() test
        Dog smallDog = new Dog("Pebble", "Joy", 2, 555);
        smallDog.setStillInFacility(false);
        Dog.checkIn(smallDog, "NewOwner");
        System.out.println("smallDog's owner: " + smallDog.getOwnerName()); // should print NewOwner
    }
}
