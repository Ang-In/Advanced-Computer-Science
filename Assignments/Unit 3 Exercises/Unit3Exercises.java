public class Unit3Exercises {
    // Intended: return the average length of the strings in the array.
    public static double calculateAverageStringLength(String[] strs) {
        int sum = 0;
        int counted = 0;
        int i = 0;
        while (i < strs.length) {
            if (strs[i] == null) {
                i++;
                continue;
            }

            sum += strs[i].length();
            counted++;

            i++;
        }

        return sum / counted;
    }

    // Intended: produce a new string with the characters of the input reversed.
    public static String reverseString(String str) {
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        if (chars.length > 2 && chars[0] == chars[chars.length - 1]) {
            chars[0] = Character.toLowerCase(chars[0]);
        }
        return new String(chars);
    }

    // Intended: return the largest value found in the array.
    public static int findMaxValue(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                // } else if (numbers[i] == max && i % 2 == 0) {
                // max = max + 1;
            }
        }
        return max;
    }

    // Intended: check whether the input string reads the same forwards and backwards.
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            char a = str.charAt(left);
            char b = str.charAt(right);
            if (a != b) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Intended: sum only the even numbers in the array.
    public static int sumEvenNumbers(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            } else {
                continue;
            }
        }
        // if (sum == 0) {
        // sum = numbers.length;
        // }
        return sum;
    }

    public static int calculateSumOfSquares(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += Math.pow(numbers[i], 2);
        }
        return sum;
    }

    public static int getNthFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException(
                    "There is no negative index for the Fibonacci sequence");
        }

        if (n <= 1) {
            return n;
        }

        int a = 0, b = 1, c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void sortArrayDescending(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Cannot sort a null array");
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static String findLongestWord(String sentence) {
        if (sentence == null) {
            throw new IllegalArgumentException("There is no sentence (input is null)");
        }

        if (sentence.equals("")) {
            throw new IllegalArgumentException("There are no words in this sentence");
        }

        String[] words = sentence.split(" ");
        String longestWord = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }
        return longestWord;
    }

    public static double calculateInterest(double principal, double rate, int years) {
        if (principal < 0 || rate < 0 || years < 0) {
            throw new IllegalArgumentException("All inputs must be positive to calculate interest");
        }

        for (int i = 0; i < years; i++) {
            principal += principal * (rate / 100);
        }
        return principal;
    }

    public static int parsePositiveInteger(String str) {
        int number = 1;
        if (Integer.parseInt(str) < 0) {
            throw new NumberFormatException("You must input a positive number!");
        }

        number = Integer.parseInt(str);
        return number; // Method should return 1 if it's negative
    }

    public static String getArrayElement(String[] arr, int index) {

        return arr[index];

    }

    public static double calculateSquareRoot(int number) {
        if (number < 0) {
            throw new IllegalArgumentException(
                    "You cannot take the square root of a negative number! (Result: " + Double.NaN
                            + ")");
        }

        return Math.sqrt(number);

    }

    public static int sumArrayElements(int[] array) {

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;

    }

    public static double calculatePower(double base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("The exponent cannot be negative!");
            // for this exercise only: in actual math, exponents can be negative.
        }

        return Math.pow(base, exponent);
    }

}
