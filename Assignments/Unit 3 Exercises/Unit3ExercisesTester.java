public class Unit3ExercisesTester {
    public static void main(String[] args) {
        System.out.println("Testing calculateAverageStringLength()");
        testCalculateStringLengthAverage();
        System.out.println();

        System.out.println("Testing reverseString()");
        testReverseString();
        System.out.println();

        System.out.println("Testing findMaxValue()");
        testFindMaxValue();
        System.out.println();

        System.out.println("Testing isPalindrome()");
        testIsPalindrome();
        System.out.println();

        System.out.println("Testing sumEvenNumbers()");
        testSumEvenNumbers();
        System.out.println();
    }

    public static void testCalculateStringLengthAverage() {
        // Test Case - Main Case
        String[] letters = {"abc", "cde", "efg", "hij"};
        // expected output: 3.0
        System.out.println("Expected 3.0: " + Unit3Exercises.calculateAverageStringLength(letters));

        // Test Case - Edge Case: Null element in array
        letters = new String[] {"abc", "cde", "efg", null, "hij"};
        // expected output: 3.0
        System.out.println("Expected 3.0: " + Unit3Exercises.calculateAverageStringLength(letters));

        // Test Case - Edge Case: Null array
        try {
            letters = null;
            System.out.println(
                    "Expected exception: " + Unit3Exercises.calculateAverageStringLength(letters));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("The method threw an exception when the array was null, as intended");
        }
    }

    public static void testReverseString() {
        // Test Case - Main Case
        String testString = "abc";
        System.out.println("Expected cba: " + Unit3Exercises.reverseString(testString));

        // Test Case - Edge Case: String with spaces at the end and in the middle
        testString = " ab c ";
        System.out.println("Expected ' c ba ': " + Unit3Exercises.reverseString(testString));

        // Test Case - Edge Case: String with special characters
        testString = "a1b!c&";
        System.out.println("Expected '&c!b1a': " + Unit3Exercises.reverseString(testString));

        // Test Case - Edge Case: Null string
        try {
            testString = null;
            System.out.println("Expected exception: " + Unit3Exercises.reverseString(testString));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("The method threw an exception when the string was null, as intended");
        }
    }

    public static void testFindMaxValue() {
        // Test Case - Main Case
        int[] nums = {1, 2, 3, 4, 5};
        // expected output: 5
        System.out.println("Expected 5: " + Unit3Exercises.findMaxValue(nums));

        // Test Case - Edge Case: Negative integers & Zero present
        nums = new int[] {-1, -5, 0, -2, -4};
        // expected output: 0
        System.out.println("Expected 0: " + Unit3Exercises.findMaxValue(nums));

        // Test Case - Edge Case: Negative integers only
        nums = new int[] {-1, -2, -3, -4, -5};
        // expected output: -1
        System.out.println("Expected -1: " + Unit3Exercises.findMaxValue(nums));

        // Test Case - Edge Case: Null array
        try {
            nums = null;
            System.out.println("Expected exception: " + Unit3Exercises.findMaxValue(nums));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("The method threw an exception when the array was null, as intended");
        }
    }

    public static void testIsPalindrome() {
        // Test Case - Main Case: Palindrome String
        String testString = "racecar";
        System.out.println("Expected true: " + Unit3Exercises.isPalindrome(testString));

        // Test Case - Main Case: Non-Palidrome String
        testString = "break";
        System.out.println("Expected false: " + Unit3Exercises.isPalindrome(testString));

        // Test Case - Edge Case: Null string
        try {
            testString = null;
            System.out.println("Expected exception: " + Unit3Exercises.isPalindrome(testString));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("The method threw an exception when the string was null, as intended");
        }

        // Test Case - Edge Case: Empty String
        testString = "";
        System.out.println("Expected true: " + Unit3Exercises.isPalindrome(testString));
    }

    public static void testSumEvenNumbers() {
        // Test Case - Main Case
        int[] nums = {1, 2, 3, 4, 5};
        // expected output: 6
        System.out.println("Expected 6: " + Unit3Exercises.sumEvenNumbers(nums));

        // Test Case - Edge Case: Negative integers only
        nums = new int[] {-1, -2, -3, -4, -5};
        // expected output: -6
        System.out.println("Expected -6: " + Unit3Exercises.sumEvenNumbers(nums));

        // Test Case - Edge Case: Positive and Negative integers present
        nums = new int[] {1, -5, 0, 2, -4};
        // expected output: -2
        System.out.println("Expected -2: " + Unit3Exercises.sumEvenNumbers(nums));

        // Test Case - Edge Case: Null array
        try {
            nums = null;
            System.out.println("Expected exception: " + Unit3Exercises.sumEvenNumbers(nums));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("The method threw an exception when the array was null, as intended");
        }
    }
}
