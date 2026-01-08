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

        System.out.println("Testing calculateSumOfSquares()");
        testCalculateSumOfSquares();
        System.out.println();

        System.out.println("Testing getNthFibonacci()");
        testGetNthFibonacci();
        System.out.println();

        System.out.println("Testing sortArrayDescending()");
        testSortArrayDescending();
        System.out.println();

        System.out.println("Testing findLongestWord()");
        testFindLongestWord();
        System.out.println();

        System.out.println("Testing calculateInterest()");
        testCalculateInterest();
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

    public static void testCalculateSumOfSquares() {
        // Test Case - Main Case
        int[] nums = {-1, 2, -3, 4, -5, 0};
        // expected output: 55
        System.out.println("Expected 55: " + Unit3Exercises.calculateSumOfSquares(nums));

        // Test Case - Edge Case: Null array
        try {
            nums = null;
            System.out.println("Expected exception: " + Unit3Exercises.calculateSumOfSquares(nums));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("The method threw an exception when the array was null, as intended");
        }
    }

    public static void testGetNthFibonacci() {
        // Test Case - Main Case
        int testInt = 5;
        // expected output: 5
        System.out.println("Expected 5: " + Unit3Exercises.getNthFibonacci(testInt));
        testInt = 8;
        // expected output: 21
        System.out.println("Expected 21: " + Unit3Exercises.getNthFibonacci(testInt));

        // Test Case - Edge Case: Null array
        try {
            testInt = -1;
            System.out.println("Expected exception: " + Unit3Exercises.getNthFibonacci(testInt));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("The method threw an exception when the array was null, as intended");
        }
    }

    public static void testSortArrayDescending() {
        // Test Case - Main Case: Positive Integers only
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println("Orignal array: " + Utils.printIntArr(nums));
        Unit3Exercises.sortArrayDescending(nums);
        // expected output: [5, 4, 3, 2, 1]
        System.out.println("Expected [5, 4, 3, 2, 1]: " + Utils.printIntArr(nums));

        // Test Case - Main Case: Negative integers present
        nums = new int[] {-1, 2, -3, 4, -5};
        System.out.println("Orignal array: " + Utils.printIntArr(nums));
        Unit3Exercises.sortArrayDescending(nums);
        // expected output: 4, 2, -1, -3, -5
        System.out.println("Expected [4, 2, -1, -3, -5]: " + Utils.printIntArr(nums));

        // Test Case - Edge Case: Null array
        try {
            nums = null;
            Unit3Exercises.sortArrayDescending(nums);
            System.out.print("Expected exception!");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("The method threw an exception when the array was null, as intended");
        }
    }

    public static void testFindLongestWord() {
        // Test Case - Main Case: No duplicate longest lengths
        String testString = "The quick fox jumped over the lazy dog.";
        System.out.println("Expected \"jumped\": " + Unit3Exercises.findLongestWord(testString));
        testString = "Have mercy on me!";
        System.out.println("Expected \"mercy\": " + Unit3Exercises.findLongestWord(testString));

        // Test Case - Main Case: Duplicate longest lengths
        testString = "Judge my vow, sphinx of black quartz";
        System.out.println("Expected \"sphinx\": " + Unit3Exercises.findLongestWord(testString));

        // Test Case - Edge Case: Null string
        try {
            testString = null;
            System.out.println("Expected exception: " + Unit3Exercises.findLongestWord(testString));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("The method threw an exception when the string was null, as intended");
        }

        // Test Case - Edge Case: Empty String
        try {
            testString = "";
            System.out.println("Expected exception: " + Unit3Exercises.findLongestWord(testString));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the string was empty, as intended");
        }
    }

    public static void testCalculateInterest() {
        // Test Case - Main Case
        double testPrincipal = 5000;
        double testRate = 2.0;
        int testYears = 5;
        // expected output: 5,520.40
        System.out.println("Expected 5,520.40: "
                + Unit3Exercises.calculateInterest(testPrincipal, testRate, testYears));
        testPrincipal = 1000;
        testRate = 5.0;
        testYears = 15;
        // expected output: 2,078.93
        System.out.println("Expected 2,078.93: "
                + Unit3Exercises.calculateInterest(testPrincipal, testRate, testYears));

        // Test Case - Edge Case: principal is negative
        try {
            testPrincipal = -1;
            System.out.println("Expected exception: "
                    + Unit3Exercises.calculateInterest(testPrincipal, testRate, testYears));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the principal was negative, as intended");
        }

        // Test Case - Edge Case: rate is negative
        try {
            testPrincipal = 1000;
            testRate = -1;
            System.out.println("Expected exception: "
                    + Unit3Exercises.calculateInterest(testPrincipal, testRate, testYears));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the rate was negative, as intended");
        }

        // Test Case - Edge Case: years are negative
        try {
            testRate = 5.0;
            testYears = -1;
            System.out.println("Expected exception: "
                    + Unit3Exercises.calculateInterest(testPrincipal, testRate, testYears));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the years were negative, as intended");
        }
    }
}
