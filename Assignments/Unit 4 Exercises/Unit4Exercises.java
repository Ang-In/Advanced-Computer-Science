import java.util.ArrayList;

public class Unit4Exercises {

    // Method 1: matchingEndSequences
    public static boolean matchingEndSequences(int[] nums, int n) {
        if (nums == null) {
            throw new IllegalArgumentException("Cannot compare values in a nonexistent array!");
        }
        if (nums.length == 0) {
            return true;
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] != nums[nums.length - n + i]) {
                return false;
            }
        }
        return true;
    }

    // Method 2: hasThreeConsecutive
    public static boolean hasThreeConsecutive(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException("Cannot compare values in a nonexistent array!");
        }
        if (nums.length < 3) {
            return false;
        }

        for (int i = 0; i <= nums.length - 3; i++) {
            boolean firstEven = nums[i] % 2 == 0;
            boolean secondEven = nums[i + 1] % 2 == 0;
            boolean thirdEven = nums[i + 2] % 2 == 0;

            if (firstEven && secondEven && thirdEven) {
                return true;
            }
            if (!firstEven && !secondEven && !thirdEven) {
                return true;
            }
        }
        return false;
    }

    // Method 3: generateNumberSequence
    public static int[] generateNumberSequence(int start, int end) {
        if (end < start) {
            return new int[0];
        }

        int len = end - start;
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            result[i] = start + i;
        }
        return result;
    }

    // Method 4: fizzBuzz
    public static String[] fizzBuzz(int start, int end) {
        if (end < start) {
            throw new IllegalArgumentException(
                    "You cannot read an array starting after the end index!");
        }
        if (start < 0 || end < 0) {
            throw new IllegalArgumentException("Cannot read negative indexes!");
        }

        String[] fizzBuzzArray = new String[end - start];
        int num = start;
        for (int i = 0; i < fizzBuzzArray.length; i++) {
            if (num % 3 == 0 && num % 5 == 0) {
                fizzBuzzArray[i] = "FizzBuzz";
                num++;
            } else if (num % 3 == 0) {
                fizzBuzzArray[i] = "Fizz";
                num++;
            } else if (num % 5 == 0) {
                fizzBuzzArray[i] = "Buzz";
                num++;
            } else {
                fizzBuzzArray[i] = String.valueOf(num);
                num++;
            }
        }

        return fizzBuzzArray;
    }

    // Method 5: moveEvenBeforeOdd
    public static int[] moveEvenBeforeOdd(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException("Cannot compare values in a nonexistent array!");
        }

        int[] result = new int[nums.length];
        int k = 0;

        // even loop
        for (int x : nums) {
            if (x % 2 == 0) {
                result[k++] = x;
            }
        }
        // odd loop
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
        if (nums == null) {
            throw new IllegalArgumentException("Cannot filter values in a nonexistent arraylist!");
        }

        ArrayList<Integer> filtered = new ArrayList<>();
        for (int x : nums) {
            if (x >= 0) {
                filtered.add(x);
            }
        }
        return filtered;
    }

    // Method 2: excludeTeenNumbers
    public static ArrayList<Integer> excludeTeenNumbers(ArrayList<Integer> nums) {
        if (nums == null) {
            throw new IllegalArgumentException("Cannot filter values in a nonexistent arraylist!");
        }

        ArrayList<Integer> filtered = new ArrayList<>();
        for (int x : nums) {
            if (x < 13 || x > 19) {
                filtered.add(x);
            }
        }
        return filtered;
    }

    // Method 3: appendY
    public static ArrayList<String> appendY(ArrayList<String> strings) {
        if (strings == null) {
            throw new IllegalArgumentException("Cannot edit values in a nonexistent arraylist!");
        }

        ArrayList<String> appendedY = new ArrayList<>();
        for (String s : strings) {
            String withY = s + "y";
            if (!withY.contains("yy")) {
                appendedY.add(withY);
            }
        }
        return appendedY;
    }

    // Method 4: squarePlus10
    public static ArrayList<Integer> squarePlus10(ArrayList<Integer> nums) {
        if (nums == null) {
            throw new IllegalArgumentException("Cannot edit values in a nonexistent arraylist!");
        }

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
