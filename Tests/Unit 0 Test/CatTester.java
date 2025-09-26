public class CatTester {
    public static void main(String[] args) {
        Cat myCat = new Cat("Betsy", "Tabby"); // 16. added new keyword
        Cat otherCat = new Cat("Tiger Beast", "Tabby"); // 17. added new keyword
        System.out.println(myCat.toString());
        System.out.println("My Cat's Name: " + myCat.getName()); // 18. completed sout statement

        System.out.println("Are the cat's equal? " + myCat.equals(otherCat));
        // 19. replaced return with sout

        System.out.println("Is my cat hungry? " + myCat.getIsHungry());
        // 20. replaced python print with sout

        // 21. added getBreed check
        System.out.println("My cat's breed: " + myCat.getBreed());

        String firstName = "Tiger";
        String lastName = "Beast"; // 22. changed == to =
        String name = firstName + " " + lastName;

        System.out.println("Changing the cat's name...");
        myCat.setName(name);
        System.out.println("The two cat's are the same now: " + myCat.equals(otherCat));
    }

}
