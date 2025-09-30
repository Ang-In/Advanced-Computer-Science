public class DogTester {
    public static void main(String[] args) {
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
        System.out.println("Dog char for ID 123: " + bestBoy.generateDogChar());
        System.out.println("Dog char for ID 693: " + sammy.generateDogChar());
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
    }
}
