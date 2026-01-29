// arrays -> objects that represent a list of elements
// the size of an array CANNOT be changed once initialized (immutable)
// if you want to expand the array, you would have to create a new array and copy on the old values
// arrays do NOT have methods

// ArrayList class
// expandable list with methods
// must import the class before use!

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        // arraylists reserve 10 empty spots in memory by default

        // names[1] = "Lopez"
        names.add("Daniel");
        names.add("Matthew");
        names.add("Morgan");
        names.add("Ava");
        names.add("Crystal");
        names.add("Isabelle");
        names.add("Jason");
        names.add("Ryan");
        names.add("Zayra");
        names.add("Boyan");

        names.add("Henry");
        // now reserves 15 slots in memory; 1.5 times increase each time
        // 10 -> 15 -> 23 -> 35

        System.out.println(names); // direct print call functions work!
        System.out.println(names.size()); // same as names.length for traditional arrays

        System.out.println(names.get(4));

        // drawback on arraylists: cannot be used with primitive data types!!!
        // we can wrap primitive data types in their respective wrapper classes
        // Ex: int -> Integer (As in Integer.parseInt())

        ArrayList<Integer> myFavNumbers = new ArrayList<Integer>();
        myFavNumbers.add(7); // {7}
        myFavNumbers.add(13); // {7, 13}
        myFavNumbers.add(21); // {7, 13, 21}

        myFavNumbers.add(1, 4); // (index, value) format -> {7, 4, 13, 21}

        System.out.println(myFavNumbers.set(2, 3)); // sets value at index 2 to 3 (replacement)
        // set() -> returns the value that was replaced!

        System.out.println(myFavNumbers.remove(1));
        // removes the element at index 1, returns removed val

        System.out.println(myFavNumbers.get(2)); // gets val at index 2
    }
}
