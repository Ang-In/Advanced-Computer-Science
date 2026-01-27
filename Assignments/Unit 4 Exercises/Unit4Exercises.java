import java.util.ArrayList;

public class Unit4Exercises {

    // Method 1: matchingEndSequences
    public static boolean matchingEndSequences(int[] nums, int n) {
        for (int i = 0; i < n; i++) {
            if (nums[i] != nums[nums.length - n + i]) {
                return false;
            }
        }
        return true;
    }

    // Method 2: hasThreeConsecutive
    public static boolean hasThreeConsecutive(int[] nums) {
        for (int i = 0; i <= nums.length - 3; i++) {
            boolean aEven = nums[i] % 2 == 0;
            boolean bEven = nums[i + 1] % 2 == 0;
            boolean cEven = nums[i + 2] % 2 == 0;

            if (aEven && bEven && cEven) {
                return true;
            }
            if (!aEven && !bEven && !cEven) {
                return true;
            }
        }
        return false;
    }

    // Method 3: generateNumberSequence
    public static int[] generateNumberSequence(int start, int end) {
        int len = end - start;
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            result[i] = start + i;
        }
        return result;
    }

    // Method 4: fizzBuzz
    public static String[] fizzBuzz(int start, int end) {
        if (end > start) {
            throw new IllegalArgumentException("You cannot make an array starting after it ends!");
        }

        String[] fizzBuzzArray = new String[end - start];
        int num = start;
        for (int i = 0; i < fizzBuzzArray.length; i++) {
            if (num % 3 == 0 && num % 5 == 0) {
                fizzBuzzArray[i] = "FizzBuzz";
            }
            if (num % 3 == 0) {
                fizzBuzzArray[i] = "Fizz";
            }
            if (num % 5 == 0) {
                fizzBuzzArray[i] = "Buzz";
            }

            fizzBuzzArray[i] = String.valueOf(num);
        }


        return fizzBuzzArray;
    }

    // Method 5: moveEvenBeforeOdd
    public static int[] moveEvenBeforeOdd(int[] nums) {
        int[] result = new int[nums.length];
        int k = 0;

        // evens first
        for (int x : nums) {
            if (x % 2 == 0) {
                result[k++] = x;
            }
        }
        // then odds
        for (int x : nums) {
            if (x % 2 != 0) {
                result[k++] = x;
            }
        }

        return result;
    }

    // ArrayList Methods

    // Method 1: noNegatives
    public static ArrayList<Integer> noNegatives(ArrayList<Integer> nums) {
        ArrayList<Integer> filteredNums = new ArrayList<>();
        for (int x : nums) {
            if (x >= 0) {
                filteredNums.add(x);
            }
        }
        return filteredNums;
    }

    // Method 2: excludeTeenNumbers
    public static ArrayList<Integer> excludeTeenNumbers(ArrayList<Integer> nums) {
        ArrayList<Integer> out = new ArrayList<>();
        for (int x : nums) {
            if (x < 13 || x > 19) {
                out.add(x);
            }
        }
        return out;
    }

    // Method 3: appendY
    public static ArrayList<String> appendY(ArrayList<String> strs) {
        ArrayList<String> appendedY = new ArrayList<>();
        for (String s : strs) {
            String t = s + "y";
            if (!t.contains("yy")) {
                appendedY.add(t);
            }
        }
        return appendedY;
    }

    // Method 4: squarePlus10
    public static ArrayList<Integer> squarePlus10(ArrayList<Integer> nums) {
        ArrayList<Integer> squaredPlusTenList = new ArrayList<>();
        for (int x : nums) {
            int val = x * x + 10;
            int lastDigit = Math.abs(val) % 10;
            if (lastDigit != 5 && lastDigit != 6) {
                squaredPlusTenList.add(val);
            }
        }
        return squaredPlusTenList;
    }

}
