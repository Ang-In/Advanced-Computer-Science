public class ForEachDemo {

    // for-each loops do NOT work when modifying immutable data types like Strings
    // or primitive data types like integers and booleans

    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5};

        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }

        // "for each number in the list x"
        for (int number : x) {
            System.out.println(number);
        }

        String[] names = {"Beverly", "Levi", "Ava", "Boyan"};

        for (String name : names) {
            name = "Hello, " + name;
        }

        for (String name : names) {
            System.out.println(name);
        }
    }
}
