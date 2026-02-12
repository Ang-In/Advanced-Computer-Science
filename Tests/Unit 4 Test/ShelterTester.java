import java.util.ArrayList;
import java.util.Arrays;

public class ShelterTester {
    public static void main(String[] args) {
        // some good dogs
        Dog dog1 = new Dog("Fido", 3);
        Dog dog2 = new Dog("Spot", 4);
        Dog dog3 = new Dog("Rex", 2);
        Dog dog4 = new Dog("Fido", 4);

        // taking the good dogs, and putting them in a list
        ArrayList<Dog> goodDogs = new ArrayList<Dog>(Arrays.asList(dog1, dog2, dog3, dog4));

        // creating a shelter
        Shelter shelter = new Shelter();

        // setting the shelter's kennels to a 3x3 array of dogs, note that some kennels are empty
        Dog[][] starterKennels =
                new Dog[][] {{dog1, null, null}, {null, dog2, null}, {dog3, null, dog4}};
        shelter.setKennels(starterKennels);


        // extra dogs for you to use
        Dog dog5 = new Dog("Growlithe", 5);
        Dog dog6 = new Dog("Inu", 2);
        Dog dog7 = new Dog("Cerberus", 3);


        // method that displays the shelter's current status
        shelter.displayStatus();



        // to-do: it is recommended that you test the following methods before you submit your code:

        // add an animal to the shelter at a specific location
        // then display the shelter's status
        // add(Dog animal, int row, int col)

        // Edge Case - invalid indices
        try {
            shelter.add(dog5, -1, 100);
            System.out.println("Exception expected!");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exception when the indices were invalid, as expected");
        }

        // Edge Case - dog is null
        try {
            shelter.add(null, 0, 0);
            System.out.println("Exception expected!");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("The method threw an exception when the dog was null, as expected");
        }

        // Edge Case - replacing preexisting dog
        shelter.add(dog5, 0, 0);
        shelter.displayStatus(); // should be dog1, dog5, etc.

        // add an animal to the shelter at the first available location
        // then display the shelter's status
        // add(Dog animal)

        // Main Case - add a dog to first available space
        Shelter testShelter = new Shelter(1, 1);
        testShelter.add(dog1);
        testShelter.displayStatus(); // should show dog1's stats

        // Edge Case - no space
        testShelter.add(dog2); // should print "No empty kennels."

        // add a list of animals to the shelter at the first available location
        // then display the shelter's status
        // add(ArrayList<Dog> animals)

        // Edge Case - adding overflow
        testShelter = new Shelter(1, 1);
        testShelter.add(goodDogs); // should accept dog1, print three "No empty kennels."
        testShelter.displayStatus(); // should show dog1's stats



        // remove an animal from the shelter at a specific location
        // then display the shelter's status
        // adopt(int row, int col)

        // Edge Case - invalid indices
        try {
            shelter.adopt(-1, 100);
            System.out.println("Exception expected!");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exception when the indices were invalid, as expected");
        }

        // Edge Case - dog is null
        try {
            shelter.adopt(0, 2); // null space here
            System.out.println("Exception expected!");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("The method threw an exception when the dog was null, as expected");
        }

        // Main Case - successful adoption
        System.out.println(shelter.adopt(0, 0)); // should print dog5's details
        shelter.displayStatus(); // should print empty, dog1, etc.

        // search the kennel for animals with a specific name
        // then print the list
        // System.out.println(shelter.search("Fido"));

        // Edge Case - searching with invalid name
        try {
            shelter.search("");
            System.out.println("Exception expected!");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exception when the name was invalid, as expected");
        }

        // Main Case - searching for valid name
        System.out.println(shelter.search("Fido")); // should print 2 fidos
        shelter.displayStatus(); // should be unchanged

        // search the kennel for animals with a specific age
        // then print the list
        // System.out.println(shelter.search(4));

        // Edge Case - searching with invalid age
        try {
            shelter.search(-1);
            System.out.println("Exception expected!");
        } catch (Exception e) {
            System.out.println(e);
            System.out
                    .println("The method threw an exception when the age was invalid, as expected");
        }

        // Main Case - searching for valid name
        System.out.println(shelter.search(4)); // should print 2 dogs of age 4
    }
}
