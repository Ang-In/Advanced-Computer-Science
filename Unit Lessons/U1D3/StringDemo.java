public class StringDemo {
    // in the AP, only use the methods from this class here

    public static void main(String[] args) {
        // Strings are objects
        String fullName = "Cornelia Lovelace";
        String fullName2 = "Cornelia Lovelace";
        // there is only one object: fullName 2

        System.out.println(fullName == fullName2); // true because they're the same object

        fullName2 = "Cornelia 'Lacey' Lovelace";
        // there are now 2 objects, a new one was made

        String fullName3 = "Cornelia Lovelace";
        // there are 2 objects still.

        // fullName3 += " :)";

        String fullName4 = new String("Cornelia Lovelace");
        // there are now 3 objects because of the keyword 'new'

        // Strings are immutable: any change creates a new string object.

        // Dog dog1 = new Dog();
        // Dog dog2 = new Dog();

        System.out.println(fullName == fullName3);

        // methods
        // charAt() -> returns the char value at given index
        System.out.println(fullName.charAt(3)); // 'n'

        // indexOf() -> returns the index of a char value
        System.out.println(fullName.indexOf('r')); // 3

        // if there are duplicates, indexOf returns the first version of the char
        System.out.println(fullName.indexOf('l')); //

        // substring() -> returns a portion of a string given a start and end index

        // "Cornelia Lovelace"
        int firstSpace = fullName.indexOf(" "); // find the index of this space
        String lastName = fullName.substring(firstSpace);
        // make a substring of fullName starting at firstSpace

        // " Lovelace"
        System.out.println(lastName.indexOf('l')); // find first lowercase l in the substring

        // ""
        String nickname = fullName2.substring(8, 14);
        // substring(inclusive, exclusive)

        System.out.println(lastName.indexOf("C"));
        // indexOf returns -1 to show the character is not there

        // compareTo() -> returns a number depending on the order;
        String string1 = "abc";
        String string2 = "abcde";

        System.out.println(string1.compareTo(string2));
        // returns negative if string1 is before string2
        // returns positive if string1 is after string2
        // returns 0 if strings are equal

        // note: first tests each character compared to each other
        // if it's zero and the strings are unequal lengths, it returns the difference in length

        System.out.println(string2.compareTo(string1));

    }
}
