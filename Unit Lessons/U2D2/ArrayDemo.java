public class ArrayDemo {
    public static void main(String[] args) {

        // Pokemon
        // You can have a team of 6, index is 5 at max

        // Pokemon[] team = new Pokemon[6];
        // created a list of size 6, so max index is 5
        // {0, 1, 2, 3, 4, 5} ordered list

        // team[3] = new Pokemon("Charizard"); // 3rd index/4th slot = "Charizard"
        // {0, 1, 2, "Charizard", 4, 5}

        // Pokemon[] box = new Pokemon[30];
        // Pokemon[] box2 = new Pokemon[1000];
        // important note: cannot resize lists

        int[] myFavoriteNumbers = new int[4];
        myFavoriteNumbers[0] = 8; // myFavoriteNumbers sub 0 (sub = [])
        myFavoriteNumbers[1] = 432;
        myFavoriteNumbers[2] = 427;
        myFavoriteNumbers[3] = 88;
        // {8, 432, 427, 88}

        myFavoriteNumbers[0] = 5; // {5, 432, 427, 88}
        System.out.println(myFavoriteNumbers[3]);

        // Challenge: print out the entire list using a for loop
        // System.out.println(myFavoriteNumbers); doesn't work! prints the reference address!

        for (int i = 0; i < myFavoriteNumbers.length; i++) {
            System.out.println(myFavoriteNumbers[i]);
        }

        // what if i actually have 5 numbers?
        // List sizes are immutable! (can't change w/o new object)
        // Strings are a list (array) of characters! They are also immutable.
        // "hello" = {'h', 'e', 'l', 'l', 'o'}

        // String[] beatles = new String[4];
        // beatles[0] = "John Lennon";
        // beatles[1] = "Paul McCartney"

        String[] beatles = {"John Lennon", "Paul McCartney", null, "Ringo Starr"};
        // , "George Harrison" got removed :(

        // NB: Different data types cannot go in one list...
        // ...but technically data types with the same ancestor can.

        // Challenge: update the beatles list to include you as the fifth beatle
        String[] beatles2 = new String[5];
        for (int i = 0; i < beatles.length; i++) {
            beatles2[i] = beatles[i];
            if (beatles[i] != null) {
                System.out.println(beatles[i].length());
            } else {
                System.out.println("this element is null.");
            }
        }
        beatles2[4] = "CC";

        String[] list = new String[3];
        // {null, null, null} by default (all objects are like this)
        // Check that an element is NOT null before executing anything!

        // System.out.println(args.length)
    }
}
