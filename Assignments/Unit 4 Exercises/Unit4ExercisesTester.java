import java.util.Arrays;
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

    // ---------------- TEST METHODS ----------------

    public static void testMatchingEndSequences() {
        int[] nums = {5, 6, 45, 99, 13, 5, 6};

        System.out.println("Expected false: " + Unit4Exercises.matchingEndSequences(nums, 1));

        System.out.println("Expected true: " + Unit4Exercises.matchingEndSequences(nums, 2));

        System.out.println("Expected false: " + Unit4Exercises.matchingEndSequences(nums, 3));

        System.out.println("Expected true: " + Unit4Exercises.matchingEndSequences(nums, 0));
    }

    public static void testHasThreeConsecutive() {
        System.out.println(
                "Expected true: " + Unit4Exercises.hasThreeConsecutive(new int[] {2, 1, 3, 5}));

        System.out.println(
                "Expected false: " + Unit4Exercises.hasThreeConsecutive(new int[] {2, 1, 2, 5}));

        System.out.println(
                "Expected true: " + Unit4Exercises.hasThreeConsecutive(new int[] {2, 4, 2, 5}));

        System.out
                .println("Expected false: " + Unit4Exercises.hasThreeConsecutive(new int[] {2, 4}));
    }

    public static void testGenerateNumberSequence() {
        System.out.println("Expected [5, 6, 7, 8, 9]: "
                + Arrays.toString(Unit4Exercises.generateNumberSequence(5, 10)));

        System.out.println("Expected [11, 12, 13, 14, 15, 16, 17]: "
                + Arrays.toString(Unit4Exercises.generateNumberSequence(11, 18)));

        System.out.println(
                "Expected [1, 2]: " + Arrays.toString(Unit4Exercises.generateNumberSequence(1, 3)));

        System.out.println(
                "Expected []: " + Arrays.toString(Unit4Exercises.generateNumberSequence(7, 7)));
    }

    public static void testFizzBuzz() {
        System.out.println("Expected [1, 2, Fizz, 4, Buzz]: "
                + Arrays.toString(Unit4Exercises.fizzBuzz(1, 6)));

        System.out.println("Expected [1, 2, Fizz, 4, Buzz, Fizz, 7]: "
                + Arrays.toString(Unit4Exercises.fizzBuzz(1, 8)));

        System.out.println("Expected [1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz]: "
                + Arrays.toString(Unit4Exercises.fizzBuzz(1, 11)));
    }

    public static void testMoveEvenBeforeOdd() {
        System.out.println("Expected [0, 0, 0, 1, 1, 3, 1]: " + Arrays
                .toString(Unit4Exercises.moveEvenBeforeOdd(new int[] {1, 0, 1, 0, 0, 3, 1})));

        System.out.println("Expected [2, 3, 3]: "
                + Arrays.toString(Unit4Exercises.moveEvenBeforeOdd(new int[] {3, 3, 2})));

        System.out.println("Expected [2, 2, 2]: "
                + Arrays.toString(Unit4Exercises.moveEvenBeforeOdd(new int[] {2, 2, 2})));
    }

    public static void testNoNegatives() {
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
    }

    public static void testExcludeTeenNumbers() {
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
    }

    public static void testAppendY() {
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
    }

    public static void testSquarePlus10() {
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

        nums = new ArrayList<>();
        nums.add(5);
        nums.add(6);
        System.out.println("Expected []: " + Unit4Exercises.squarePlus10(nums));
    }
}
