public class Unit6Exercises {

    /**
     * Problem 1 - Factorial: Write a recursive and non-recursive method that returns the factorial
     * of a given number n.
     */
    public static int factorial(int n) {
        if (n < 0) {
            // throw new IllegalArgumentException("Cannot obtain the factorial of a negative
            // number!");
            return 0;
        }
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static int factorialRecursive(int n) {
        if (n < 0) {
            // throw new IllegalArgumentException("Cannot obtain the factorial of a negative
            // number!");
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    /**
     * Problem 2 - Fibonacci Sequence: Write a recursive and non-recursive method that returns the
     * nth number in the Fibonacci sequence.
     */
    public static int fibonacci(int n) {
        if (n < 0) {
            // throw new IllegalArgumentException("Negative Fibonacchi numbers do not exist!");
            return 0;
        }

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int fibonacci = 0;
            int prevFibonacci = 1;
            int prev2Fibonacci = 0;

            for (int i = 2; i <= n; i++) {
                fibonacci = prevFibonacci + prev2Fibonacci;
                prev2Fibonacci = prevFibonacci;
                prevFibonacci = fibonacci;
            }

            return fibonacci;
        }
    }

    public static int fibonacciRecursive(int n) {
        if (n < 0) {
            // throw new IllegalArgumentException("Negative Fibonacchi numbers do not exist!");
            return 0;
        }

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacciRecursive(n - 2) + fibonacciRecursive(n - 1);
        }
    }

    /**
     * Problem 3 - Sum of Digits: Write a recursive and non-recursive method that returns the sum of
     * the digits of a given integer.
     */
    public static int sumDigits(int n) {
        if (n < 0) {
            return 0;
        }

        int digitCount = ((int) Math.log10(Math.abs(n))) + 1;
        int sum = 0;
        int step = n;
        for (int i = 0; i < digitCount; i++) {
            sum += step % 10;
            step /= 10;
        }
        return sum;
    }

    public static int sumDigitsRecursive(int n) {
        if (n <= 0) {
            return 0;
        }
        return (n % 10) + sumDigitsRecursive(n / 10);
    }

    /**
     * Problem 4 - Count X: Write a recursive and non-recursive method that returns the count of
     * occurrences of 'x' in a given string.
     */
    public static int countX(String str) {
        if (str == null) {
            throw new IllegalArgumentException(
                    "Cannot count 'x' occurrences in a nonexistent string!");
        }
        int count = 0;
        char[] strArr = str.toLowerCase().toCharArray();
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] == 'x') {
                count++;
            }
        }
        return count;
    }

    public static int countXRecursive(String str) {
        if (str == null) {
            throw new IllegalArgumentException(
                    "Cannot count 'x' occurrences in a nonexistent string!");
        }

        if (str.isEmpty()) {
            return 0;
        }
        if (str.toLowerCase().charAt(0) == 'x') {
            return 1 + countXRecursive(str.substring(1));
        } else {
            return countXRecursive(str.substring(1));
        }
    }

    /**
     * Problem 5 - Reverse String: Write a recursive and non-recursive method that returns the
     * reverse of a given string.
     */
    public static String reverseString(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Cannot reverse a nonexistent string!");
        }

        String reverse = "";
        char[] strArr = str.toLowerCase().toCharArray();
        for (int i = strArr.length - 1; i >= 0; i--) {
            reverse += strArr[i];
        }

        return reverse;
    }

    public static String reverseStringRecursive(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Cannot reverse a nonexistent string!");
        }

        if (str.isEmpty()) {
            return "";
        }
        return "" + str.charAt(str.length() - 1)
                + reverseStringRecursive(str.substring(0, str.length() - 1));
    }

    /**
     * Problem 6 - Power of a Number: Write a recursive and non-recursive method that calculates and
     * returns the value of base raised to the power of exponent.
     */
    public static int power(int base, int exponent) {
        int exp = base;
        if (exponent == 0) {
            return 1;
        }
        for (int i = 1; i < Math.abs(exponent); i++) {
            exp *= base;
        }
        return exp;
    }

    public static int powerRecursive(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return base * powerRecursive(base, exponent - 1);
    }

    /**
     * Problem 7 - Palindrome Checker: Write a recursive and non-recursive method that checks
     * whether a given string is a palindrome.
     */
    public static boolean isPalindrome(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Cannot check a nonexistent string! (Palindrome)");
        }

        int midIndex = str.length() / 2;
        char[] strArr = str.toLowerCase().toCharArray();
        for (int i = 0; i < midIndex; i++) {
            if (strArr[i] != strArr[(str.length() - 1) - i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Cannot check a nonexistent string! (Palindrome)");
        }

        if (str.length() <= 1) {
            return true;
        }
        if (str.toLowerCase().charAt(0) != str.toLowerCase().charAt(str.length() - 1)) {
            return false;
        }
        return isPalindromeRecursive(str.substring(1, str.length() - 1));
    }

    /**
     * Problem 8 - Greatest Common Divisor (GCD): Write a recursive and non-recursive method that
     * finds and returns the greatest common divisor of two numbers.
     */
    public static int gcd(int a, int b) {
        int gcd = 1;
        int curDiv = 1;
        if (a == 0 || b == 0) {
            return Math.max(Math.abs(a), Math.abs(b));
        }
        while (curDiv <= Math.min(Math.abs(a), Math.abs(b))) {
            if (a % curDiv == 0 && b % curDiv == 0) {
                gcd = curDiv;
            }
            curDiv++;
        }

        return gcd;
    }

    public static int gcdRecursive(int a, int b) {
        if (a == 0 || b == 0) {
            return Math.max(Math.abs(a), Math.abs(b));
        }
        int larger = Math.max(a, b);
        int smaller = Math.min(a, b);

        return gcdRecursive(smaller, larger % smaller);
    }

    /**
     * Problem 9 - Bunny Ears 2: We have bunnies standing in a line, numbered 1, 2, ... The odd
     * bunnies (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3 ears,
     * because they each have a raised foot. Recursively return the number of "ears" in the bunny
     * line 1, 2, ... n (without loops or multiplication).
     */

    public static int bunnyEars(int bunnies) {
        if (bunnies < 0) {
            // throw new IllegalArgumentException("Cannot count nonexistent bunnies' ears!");
            return 0;
        }
        int ears = 0;
        for (int i = 1; i <= bunnies; i++) {
            if (i % 2 == 0) {
                ears += 3;
            } else {
                ears += 2;
            }
        }
        return ears;

    }

    public static int bunnyEarsRecursive(int bunnies) {
        if (bunnies < 0) {
            // throw new IllegalArgumentException("Cannot count nonexistent bunnies' ears!");
            return 0;
        }

        if (bunnies == 0) {
            return 0;
        }

        if (bunnies % 2 == 0) {
            return 3 + bunnyEarsRecursive(bunnies - 1);
        } else {
            return 2 + bunnyEarsRecursive(bunnies - 1);
        }
    }

    /**
     * Problem 10 - Binary Search: Write a recursive and non-recursive method that implements the
     * binary search algorithm to find and return the index of a given element in a sorted array.
     */
    public static int binarySearch(int[] arr, int key) {
        if (arr == null) {
            throw new IllegalArgumentException("Cannot search in a nonexistent array!");
        }
        if (arr.length == 0) {
            return -1;
        }

        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int midIndex = left + ((right - left) / 2);
            if (arr[midIndex] == key) { // found item
                return midIndex;
            }
            if (arr[midIndex] > key) { // search left
                /*
                 * if (right - left == 1) { break; }
                 */
                right = midIndex - 1;
                // continue;
            }
            if (arr[midIndex] < key) { // search right
                /*
                 * if (right - left == 1) { break; }
                 */
                left = midIndex + 1;
                // continue;
            }
        }

        return -1;
    }

    public static int binarySearchRecursiveHelper(int[] arr, int key, int low, int high) {
        if (arr == null) {
            throw new IllegalArgumentException("Cannot search in a nonexistent array!");
        }

        int midIndex = low + ((high - low) / 2);
        if (arr[midIndex] == key) { // found item
            return midIndex;
        }
        if (arr[midIndex] >= key) { // search left
            if (high - low == 1) {
                return -1;
            }
            return binarySearchRecursiveHelper(arr, key, low, midIndex);
        }
        if (arr[midIndex] <= key) { // search right
            if (high - low == 1) {
                return -1;
            }
            return binarySearchRecursiveHelper(arr, key, midIndex, high);
        }

        return -1; // failsafe
    }

    // DO NOT EDIT! Work on the helper version above this method. This method is to be used for
    // testing purposes only.
    public static int binarySearchRecursive(int[] arr, int key) {
        return binarySearchRecursiveHelper(arr, key, 0, arr.length - 1); // Element not found
    }


}
