// class = collection of related attributes & behaviors/methods

public class HelloWorld {

    // main = entry point/starting point for the computer to run code
    public static void main(String[] args) {
        // Two print methods: print is basic, println starts on a new line
        System.out.println("Hello world!");
        System.out.println("My name is Wish!");

        System.out.print("My favorite pizza toppings are caramelized onions. ");
        System.out.print("My favorite caffinated drink is boba milk tea. ");

        // 8 primitive data types in each program.
        int number = 5; // integer
        char letter = 'a'; // character, single quotes
        boolean isTrue = true; // true or false (1 or 0)
        float decimal = 50.0f; // 32-bit decimal, needs f at the end
        double bigDecimal = 0.6; // 64-bit decimal

        // INT alternatives (can ignore, int's usually enough)
        byte age = 25;
        short population = 3200;
        long bigInteger = 100000; // bigger integer; 64-bit

        // string is NOT a primitive data type; it's a class (same color + capitalized)
        String myName = "Wish";
        // a collection of PRIMITIVE characters to describe text

        // prints out the length of the string w/ length method
        System.out.println(myName.length());

        // conditional statements: if this, then that
        // conditions are always BOOLEAN (t or f)

        // example 1
        int value = 5;
        if (value == 5) {
            System.out.println(value);
        }

        // example 2
        boolean isCompSciFun = true;
        if (isCompSciFun == false) {
            System.out.println("Comp Sci Sucks!");
        } else if (isCompSciFun = true) {
            System.out.println("Comp Sci is fun!");
        }

        // example 2.1 (cleaner version)
        if (isCompSciFun) {
            System.out.println("Comp Sci is really fun!");
        } else {
            System.out.println("Comp Sci stresses me out...");
        }

        // Challenge: Write a condition if-else statement where you do something if you ate 5 apples
        // vs. 10, print something if neither is true

        int appleCount = 10;

        // Challenge complete!
        if (appleCount == 5) {
            System.out.println("You ate 5 apples today! Have a star!");
        } else if (appleCount == 10) {
            System.out.println(
                    "You ate 10 apples today! Now the doctor's going to stay ten feet away!");
        } else {
            System.out.println("You ate " + appleCount
                    + " apples today! Huh, what a strange number of apples!");
        }

        // Challenge Complete v2:
        if (appleCount == 5 || appleCount == 10) {
            System.out.println(
                    "You ate " + appleCount + " apples today! Ah yes, a nice, even apple count...");
        } else {
            System.out.println("You ate " + appleCount
                    + " apples today! Huh, what a strange number of apples!");
        }

        // == equal to
        // > greater than
        // >= greater than or equal to
        // < less than
        // <= less that or equal to

    }
}
