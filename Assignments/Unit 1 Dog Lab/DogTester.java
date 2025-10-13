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
        System.out.println("Dog char for ID 123: "
            + PawesomeUtils.generateDogChar(bestBoy.getDogId()));
        System.out.println("Dog char for ID 693: "
            + PawesomeUtils.generateDogChar(sammy.getDogId()));
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
        System.out.println("dogChar for ID 123: " + PawesomeUtils.generateDogChar(123));
        // should return 'L'

        System.out.println("dogChar for ID 456: " + PawesomeUtils.generateDogChar(456));
        // should return 'K'

        System.out.println("dogChar for ID 789: " + PawesomeUtils.generateDogChar(789));
        // should return 'J'

        // Static Dog.pickup() test
        Dog myDog = new Dog("Cream", "Maria", 9, 101);
        System.out.println(PawesomeUtils.pickup(myDog, "Maria")); 
        // should print correct message
        System.out.println(PawesomeUtils.pickup(myDog, "John")); 
        // should print error message
        
        // Static Dog.checkIn() test
        Dog smallDog = new Dog("Pebble", "Joy", 2, 555);
        smallDog.setStillInFacility(false);
        PawesomeUtils.checkIn(smallDog, "NewOwner");
        System.out.println("smallDog's owner: " + smallDog.getOwnerName()); 
        // should print NewOwner

        // Day 3

        // Static validateDogId() test
        System.out.println("Is ID 123 valid: " + PawesomeUtils.validateDogId(123));
        // should return 123

        System.out.println("Is ID 456 valid: " + PawesomeUtils.validateDogId(456));
        // should return 456

        System.out.println("Is ID 789 valid: " + PawesomeUtils.validateDogId(789));
        // should return 789

        System.out.println("Is ID 055 valid: " + PawesomeUtils.validateDogId(055));
        // should return random numbers

        // Static validateDogTag() test
        Dog standardDog = new Dog();
        Dog validDog = new Dog("Snickerdoodle", "Cherrie", 2, 555);
        Dog invalidDog = new Dog("???", "[REDACTED]", 19, 001);


        System.out.println("Is standardDog's dogTag valid: "
            + PawesomeUtils.validateDogTag(standardDog));
        // should return true

        System.out.println("Is validDog's dogTag valid: "
            + PawesomeUtils.validateDogTag(validDog));
        // should return true

        System.out.println("Is invalidDog's dogTag valid: "
            + PawesomeUtils.validateDogTag(invalidDog));
        // should return false

        // validateDogTag() edge case test
        Dog editedDog = new Dog();
        editedDog.setDogChar('A');
        System.out.println("Is editedDog's dogTag valid (changed char): "
            + PawesomeUtils.validateDogTag(editedDog));
        // should return false

        editedDog.setDogId(1001);
        System.out.println("Is editedDog's dogTag valid (changed id): "
            + PawesomeUtils.validateDogTag(editedDog));
        // should return false

        // Day 4

        // Static convertAgeToHumanAge() test
        Dog oneYearOld = new Dog("Young", "test", 1, 123);
        Dog twoYearsOld = new Dog("Adult", "test", 2, 123);
        Dog manyYearsOld = new Dog("Old", "test", 5, 123);

        System.out.println("1 dog year in human years: "
            + PawesomeUtils.convertAgeToHumanAge(oneYearOld));
        // should return 15

        System.out.println("2 dog years in human years: "
            + PawesomeUtils.convertAgeToHumanAge(twoYearsOld));
        // should return 24

        System.out.println("5 dog years in human years: "
            + PawesomeUtils.convertAgeToHumanAge(manyYearsOld));
        // should return 39

        // Static convertAgeToDogYears() test
        System.out.println("13 years old in dog years: "
            + PawesomeUtils.convertAgeToDogYears(13));
        // should return 1

        System.out.println("18 years old in dog years: "
            + PawesomeUtils.convertAgeToDogYears(18));
        // should return 2

        System.out.println("49 years old in dog years: "
            + PawesomeUtils.convertAgeToDogYears(49));
        // should return 7
    }
}
