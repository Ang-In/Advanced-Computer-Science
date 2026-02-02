import java.util.ArrayList;

public class Unit4ExercisesTester {

    public static void main(String[] args) {

        System.out.println("Testing matchingEndSequences()");
        testMatchingEndSequences();
        System.out.println();

        System.out.println("Testing hasThreeConsecutive()");
        testHasThreeConsecutive();
        System.out.println();

        System.out.println("Testing generateNumberSequence()");
        testGenerateNumberSequence();
        System.out.println();

        System.out.println("Testing fizzBuzz()");
        testFizzBuzz();
        System.out.println();

        System.out.println("Testing moveEvenBeforeOdd()");
        testMoveEvenBeforeOdd();
        System.out.println();

        System.out.println("Testing noNegatives()");
        testNoNegatives();
        System.out.println();

        System.out.println("Testing excludeTeenNumbers()");
        testExcludeTeenNumbers();
        System.out.println();

        System.out.println("Testing appendY()");
        testAppendY();
        System.out.println();

        System.out.println("Testing squarePlus10()");
        testSquarePlus10();
        System.out.println();
    }

    public static void testMatchingEndSequences() {
        int[] nums = {5, 6, 45, 99, 13, 5, 6};

        // Testing Main Cases
        System.out.println("Expected false: " + Unit4Exercises.matchingEndSequences(nums, 1));

        System.out.println("Expected true: " + Unit4Exercises.matchingEndSequences(nums, 2));

        System.out.println("Expected false: " + Unit4Exercises.matchingEndSequences(nums, 3));

        System.out.println("Expected true: " + Unit4Exercises.matchingEndSequences(nums, 0));

        // Edge Case: nums is empty
        nums = new int[0];
        System.out.println("Expected false: " + Unit4Exercises.matchingEndSequences(nums, 2));

        // Edge Case: nums is null
        try {
            nums = null;
            System.out.println(Unit4Exercises.matchingEndSequences(nums, 1));
            System.out.println("Expected exception!");
        } catch (Exception e) {
            System.out.println(e);
            System.out
                    .println("The method threw an exception when the input was null, as expected");
        }
    }

    public static void testHasThreeConsecutive() {
        // Testing Main Cases
        System.out.println(
                "Expected true: " + Unit4Exercises.hasThreeConsecutive(new int[] {2, 1, 3, 5}));

        System.out.println(
                "Expected false: " + Unit4Exercises.hasThreeConsecutive(new int[] {2, 1, 2, 5}));

        System.out.println(
                "Expected true: " + Unit4Exercises.hasThreeConsecutive(new int[] {2, 4, 2, 5}));

        // Edge Case: given array has less than 3 numbers
        System.out
                .println("Expected false: " + Unit4Exercises.hasThreeConsecutive(new int[] {2, 4}));

        System.out.println("Expected false: " + Unit4Exercises.hasThreeConsecutive(new int[0]));

        // Edge Case: given array is null
        try {
            System.out.println(Unit4Exercises.hasThreeConsecutive(null));
            System.out.println("Expected exception!");
        } catch (Exception e) {
            System.out.println(e);
            System.out
                    .println("The method threw an exception when the input was null, as expected");
        }
    }

    public static void testGenerateNumberSequence() {
        // Testing Main Cases
        System.out.println("Expected [5, 6, 7, 8, 9]: "
                + Utils.printIntegerArray(Unit4Exercises.generateNumberSequence(5, 10)));

        System.out.println("Expected [11, 12, 13, 14, 15, 16, 17]: "
                + Utils.printIntegerArray(Unit4Exercises.generateNumberSequence(11, 18)));

        System.out.println("Expected [1, 2]: "
                + Utils.printIntegerArray(Unit4Exercises.generateNumberSequence(1, 3)));

        // Edge Case: Start and end are the same number/index
        System.out.println("Expected []: "
                + Utils.printIntegerArray(Unit4Exercises.generateNumberSequence(7, 7)));

        // Edge Case: End number is greater than start number
        System.out.println("Expected []: "
                + Utils.printIntegerArray(Unit4Exercises.generateNumberSequence(10, 1)));
    }

    public static void testFizzBuzz() {
        // Testing Main Cases
        System.out.println("Expected [1, 2, Fizz, 4, Buzz]: "
                + Utils.printStringArray(Unit4Exercises.fizzBuzz(1, 6)));

        System.out.println("Expected [1, 2, Fizz, 4, Buzz, Fizz, 7]: "
                + Utils.printStringArray(Unit4Exercises.fizzBuzz(1, 8)));

        System.out.println("Expected [1, 2, Fizz, 4, Buzz, Fizz, 7, 8, "
                + "Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz]: "
                + Utils.printStringArray(Unit4Exercises.fizzBuzz(1, 16)));

        // Edge Case: End number is greater than start number
        try {
            System.out.println(Unit4Exercises.fizzBuzz(10, 1));
            System.out.println("Expected exception!");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("The method threw an exception when end > start, as expected");
        }

        // Edge Case: start and/or end < 0
        try {
            System.out.println(Unit4Exercises.fizzBuzz(-3, -5));
            System.out.println("Expected exception!");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exception when start and/or end < 0, as expected");
        }
    }

    public static void testMoveEvenBeforeOdd() {
        // Testing Main Cases
        System.out.println("Expected [0, 0, 0, 1, 1, 3, 1]: " + Utils.printIntegerArray(
                Unit4Exercises.moveEvenBeforeOdd(new int[] {1, 0, 1, 0, 0, 3, 1})));

        System.out.println("Expected [2, 3, 3]: "
                + Utils.printIntegerArray(Unit4Exercises.moveEvenBeforeOdd(new int[] {3, 3, 2})));

        System.out.println("Expected [2, 2, 2]: "
                + Utils.printIntegerArray(Unit4Exercises.moveEvenBeforeOdd(new int[] {2, 2, 2})));

        // Edge Case: given array is empty
        System.out.println("Expected []: " + Utils.printIntegerArray(new int[0]));

        // Edge Case: given array is null
        try {
            System.out.println(Unit4Exercises.moveEvenBeforeOdd(null));
            System.out.println("Expected exception!");
        } catch (Exception e) {
            System.out.println(e);
            System.out
                    .println("The method threw an exception when the input was null, as expected");
        }
    }

    public static void testNoNegatives() {
        // Testing Main Cases
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(-2);
        System.out.println("Expected [1]: " + Unit4Exercises.noNegatives(nums));

        nums = new ArrayList<>();
        nums.add(-3);
        nums.add(-3);
        nums.add(3);
        nums.add(3);
        System.out.println("Expected [3, 3]: " + Unit4Exercises.noNegatives(nums));

        nums = new ArrayList<>();
        nums.add(-1);
        nums.add(-1);
        nums.add(-1);
        System.out.println("Expected []: " + Unit4Exercises.noNegatives(nums));

        // Edge Case: given arraylist is empty
        nums = new ArrayList<>();
        System.out.println("Expected []: " + Unit4Exercises.noNegatives(nums));

        // Edge Case: given arraylist is null
        try {
            System.out.println(Unit4Exercises.noNegatives(null));
            System.out.println("Expected exception!");
        } catch (Exception e) {
            System.out.println(e);
            System.out
                    .println("The method threw an exception when the input was null, as expected");
        }
    }

    public static void testExcludeTeenNumbers() {
        // Testing Main Cases
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(13);
        nums.add(19);
        nums.add(20);
        System.out.println("Expected [12, 20]: " + Unit4Exercises.excludeTeenNumbers(nums));

        nums = new ArrayList<>();
        nums.add(1);
        nums.add(14);
        nums.add(1);
        System.out.println("Expected [1, 1]: " + Unit4Exercises.excludeTeenNumbers(nums));

        nums = new ArrayList<>();
        nums.add(15);
        System.out.println("Expected []: " + Unit4Exercises.excludeTeenNumbers(nums));

        // Edge Case: given arraylist is empty
        nums = new ArrayList<>();
        System.out.println("Expected []: " + Unit4Exercises.excludeTeenNumbers(nums));

        // Edge Case: given arraylist is null
        try {
            System.out.println(Unit4Exercises.excludeTeenNumbers(null));
            System.out.println("Expected exception!");
        } catch (Exception e) {
            System.out.println(e);
            System.out
                    .println("The method threw an exception when the input was null, as expected");
        }
    }

    public static void testAppendY() {
        // Testing Main Cases
        ArrayList<String> words = new ArrayList<>();
        words.add("a");
        words.add("b");
        words.add("c");
        System.out.println("Expected [ay, by, cy]: " + Unit4Exercises.appendY(words));

        words = new ArrayList<>();
        words.add("a");
        words.add("b");
        words.add("cy");
        System.out.println("Expected [ay, by]: " + Unit4Exercises.appendY(words));

        words = new ArrayList<>();
        words.add("xx");
        words.add("ya");
        words.add("zz");
        System.out.println("Expected [xxy, yay, zzy]: " + Unit4Exercises.appendY(words));

        // Edge Case: empty value in arraylist
        words = new ArrayList<>();
        words.add("xx");
        words.add("");
        System.out.println("Expected [xxy, y]: " + Unit4Exercises.appendY(words));

        // Edge Case: arraylist is empty/empty value in arraylist
        words = new ArrayList<>();
        System.out.println("Expected []: " + Unit4Exercises.appendY(words));

        // Edge Case: arraylist is null
        try {
            System.out.println(Unit4Exercises.appendY(null));
            System.out.println("Expected exception!");
        } catch (Exception e) {
            System.out.println(e);
            System.out
                    .println("The method threw an exception when the input was null, as expected");
        }
    }

    public static void testSquarePlus10() {
        // Testing Main Cases
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(1);
        nums.add(4);
        System.out.println("Expected [19, 11]: " + Unit4Exercises.squarePlus10(nums));

        nums = new ArrayList<>();
        nums.add(1);
        System.out.println("Expected [11]: " + Unit4Exercises.squarePlus10(nums));

        nums = new ArrayList<>();
        nums.add(2);
        System.out.println("Expected [14]: " + Unit4Exercises.squarePlus10(nums));

        // Edge Case: Exclude values ending in 5 or 6
        nums = new ArrayList<>();
        nums.add(5);
        nums.add(6);
        System.out.println("Expected []: " + Unit4Exercises.squarePlus10(nums));

        // Edge Case: arraylist is empty
        nums = new ArrayList<>();
        System.out.println("Expected []: " + Unit4Exercises.squarePlus10(nums));

        // Edge Case: arraylist is null
        try {
            System.out.println(Unit4Exercises.squarePlus10(null));
            System.out.println("Expected exception!");
        } catch (Exception e) {
            System.out.println(e);
            System.out
                    .println("The method threw an exception when the input was null, as expected");
        }
    }
}
