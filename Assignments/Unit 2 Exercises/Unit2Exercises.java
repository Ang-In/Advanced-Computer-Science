public class Unit2Exercises {
    public static String alarmClock(int day, boolean vacation) {
        if (day == 0 || day == 6) {
            if (vacation) {
                return "off";
            }
            return "10:00";
        } else {
            if (vacation) {
                return "10:00";
            }
            return "7:00";
        }
    }

    public static boolean love6(int a, int b) {
        if (a == 6 || b == 6 || Math.abs(a - b) == 6 || Math.abs(a + b) == 6) {
            return true;
        }
        return false;
    }

    public static int redTicket(int a, int b, int c) {
        if (a == b && b == c && c == a) {
            if (a == 2) {
                return 10;
            }
            return 5;
        }

        if (a != b && a != c) {
            return 1;
        }

        return 0;
    }

    public static String fizzString(String str) {
        if (str == null) {
            return "";
        }

        String response = "";
        String lowerStr = str.toLowerCase();

        if (lowerStr.charAt(0) == 'f') {
            response += "Fizz";
        }
        if (lowerStr.charAt(lowerStr.length() - 1) == 'b') {
            response += "Buzz";
        }
        if (response == "") {
            response += str;
        }
        return response;

    }

    public static String doubleChar(String str) {
        if (str == null) {
            return "";
        }

        String doubled = "";
        for (int i = 0; i < str.length(); i++) {
            doubled += str.charAt(i);
            doubled += str.charAt(i);
        }
        return doubled;

    }

    public static int countHi(String str) {
        if (str == null) {
            return 0;
        }

        int hiCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i == str.length() - 1) {
                continue;
            }
            if (str.charAt(i) != 'h' || str.charAt(i + 1) != 'i') {
                continue;
            }
            hiCount++;
        }

        return hiCount;
    }

    public static boolean catDog(String str) {
        if (str == null) {
            return false; // to-do: check and change later based on tester
        }

        int catCount = 0, dogCount = 0;
        // cat loop
        for (int i = 0; i < str.length(); i++) {
            if (i >= str.length() - 2) {
                continue;
            }
            if (str.charAt(i) != 'c' || str.charAt(i + 1) != 'a' || str.charAt(i + 2) != 't') {
                continue;
            }
            catCount++;
        }

        // dog loop
        for (int i = 0; i < str.length(); i++) {
            if (i >= str.length() - 2) {
                continue;
            }
            if (str.charAt(i) != 'd' || str.charAt(i + 1) != 'o' || str.charAt(i + 2) != 'g') {
                continue;
            }
            dogCount++;
        }

        if (catCount == dogCount) {
            return true;
        }

        return false;
    }

    public static String mixString(String a, String b) {
        if (a == null && b == null) { // to-do: check and change later based on tester
            return "";
        } else if (a == null) {
            return b;
        } else if (b == null) {
            return a;
        }

        String mixedString = "";
        for (int i = 0; i < Math.min(a.length(), b.length()); i++) {
            mixedString += a.charAt(i);
            mixedString += b.charAt(i);
        }

        if (a.length() > b.length()) {
            mixedString += a.substring(b.length());
        } else if (a.length() < b.length()) {
            mixedString += b.substring(a.length());
        }

        return mixedString;

    }

    public static String repeatEnd(String str, int n) {
        if (str == null) {
            return ""; // to-do: check and change later based on tester
        }

        String repeated = "";
        for (int i = 0; i < n; i++) {
            repeated += str.substring(str.length() - n);
        }

        return repeated;
    }

    public static boolean endOther(String a, String b) {
        if (a == null || b == null) { // to-do: check and change later based on tester
            return false;
        }

        String lowerA = a.toLowerCase();
        String lowerB = b.toLowerCase();

        if (lowerA.length() > lowerB.length()
                && lowerA.substring(lowerA.length() - lowerB.length()).equals(lowerB)) {
            return true; // b at the end of a, a longer
        }
        if (lowerA.length() < lowerB.length()
                && lowerB.substring(lowerB.length() - lowerA.length()).equals(lowerA)) {
            return true; // a at the end of b, b longer
        }
        if (lowerA.equals(lowerB)) {
            return true; // a and b are same length, they're the same
        }

        return false;
    }

    public static int countCode(String str) {
        if (str == null) {
            return 0; // to-do: check and change later based on tester
        }

        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e') {
                count++;
            }
        }
        return count;
    }

    public static int countEvens(int[] nums) {
        if (nums == null) {
            return 0; // to-do: check and change later based on tester
        }

        int count = 0;
        for (int i : nums) {
            if (i % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static int bigDiff(int[] nums) {
        if (nums == null || nums.length < 2) {
            return -1; // to-do: check and change later based on tester
        }

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        for (int i : nums) {
            smallest = Math.min(smallest, i);
            largest = Math.max(largest, i);
        }

        return Math.abs(largest - smallest);
    }

    public static int sum13(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13 || (i > 0 && nums[i - 1] == 13)) {
                continue;
            }
            sum += nums[i];
        }
        return sum;
    }

    public static int[] fizzArray(int n) {
        if (n < 0) {
            return new int[0]; // to-do: check and change later based on tester
        }

        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = i;
        }

        return ans;
    }

    public static boolean haveThree(int[] nums) {
        if (nums.length < 0) {
            return false;
        }



        return false;

    }

    public static String[] fizzArray2(int n) {
        // to-do: implement this method
        return new String[0];
    }

    public static int[] zeroFront(int[] nums) {
        // to-do: implement this method
        return new int[0];
    }

    public static String[] wordsWithout(String[] words, String target) {
        // to-do: implement this method
        return new String[0];
    }

    public static int scoresAverage(int[] scores) {
        // to-do: implement this method
        return 0;
    }

    public static boolean scoresIncreasing(int[] scores) {
        // to-do: implement this method
        return false;
    }

    public static int scoresSpecial(int[] a, int[] b) {
        // to-do: implement this method
        return 0;
    }

    public static String firstTwo(String str) {
        // to-do: implement this method
        return "";
    }

    public static double divide(int a, int b) {
        // to-do: implement this method
        return 0.0;
    }
}
