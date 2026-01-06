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

        int catCount = 0;
        int dogCount = 0;
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
            return 0; // to-do: check and change later based on tester
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
        if (nums == null || nums.length < 5) {
            return false;
        }

        int threeCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (threeCount > 3) {
                return false;
            }

            if (nums[i] == 3) {
                threeCount++;
            }

            if (i != nums.length - 1 && nums[i] == nums[i + 1] && nums[i] == 3) {
                return false;
            }
        }

        if (threeCount < 3) {
            return false;
        }

        return true;

    }

    public static String[] fizzArray2(int n) {
        if (n <= 0) {
            return new String[0];
        }

        String[] arr = new String[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = String.valueOf(i);
        }

        return arr;
    }

    public static int[] zeroFront(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }

        int[] zf = new int[nums.length];
        int zfi = 0;
        for (int i = 0; i < zf.length; i++) {
            if (nums[i] == 0) {
                zf[zfi] = 0;
                zfi++;
            }
        }

        for (int i = 0; i < zf.length; i++) {
            if (nums[i] != 0) {
                zf[zfi] = nums[i];
                zfi++;
            }
        }

        return zf;
    }

    public static String[] wordsWithout(String[] words, String target) {
        if (words == null || words.length == 0) {
            return new String[0];
        }

        boolean targetIsNull = false;
        int count = 0;

        if (target == null) {
            targetIsNull = true;
        }

        for (int i = 0; i < words.length; i++) {
            if (targetIsNull && words[i] == null) {
                count++;
                continue;
            }

            if (words[i] == null) {
                continue;
            }

            if (words[i].equals(target)) {
                count++;
                continue;
            }
        }

        String[] sorted = new String[count];
        int sortedi = 0;

        for (int i = 0; i < words.length; i++) {
            if (targetIsNull && words[i] == null) {
                continue;
            }

            if (words[i] == null) {
                sorted[sortedi] = words[i];
                sortedi++;
                continue;
            }

            if (words[i].equals(target)) {
                continue;
            }

            sorted[sortedi] = words[i];
            sortedi++;
            continue;
        }

        return sorted;
    }

    public static int scoresAverage(int[] scores) {
        if (scores == null || scores.length == 0) {
            return 0;
        }

        int scoresAverage = (average(scores, 0, (scores.length / 2))
                + average(scores, (scores.length / 2), scores.length)) / 2;

        return scoresAverage;
    }

    public static boolean scoresIncreasing(int[] scores) {
        int prevScore = Integer.MIN_VALUE;

        for (int i = 0; i < scores.length; i++) {
            if (prevScore > scores[i]) {
                return false;
            }

            prevScore = scores[i];
        }
        return true;
    }

    public static int scoresSpecial(int[] a, int[] b) {
        if (a == null && b == null) {
            return 0;
        } else if (a == null) {
            return special(b);
        } else if (b == null) {
            return special(a);
        }

        return special(a) + special(b);
    }

    private static int special(int[] scores) {
        int largest = 0;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > largest && scores[i] % 10 == 0) {
                largest = scores[i];
            }
        }

        return largest;
    }

    public static String firstTwo(String str) {
        if (str == null || str.length() == 0) {
            return "**";
        } else if (str.length() == 1) {
            return str += "*";
        }

        return "" + str.charAt(0) + str.charAt(1);
    }

    public static double divide(int a, int b) {
        if (Math.min(a, b) == 0) {
            return 0.0;
        }
        return (double) Math.max(a, b) / Math.min(a, b);
    }

    // helper classes
    private static int average(int[] scores, int start, int end) {
        int avg = 0;

        for (int i = start; i < end; i++) {
            avg += scores[i];
        }

        avg /= (end - start - 1);

        return avg;
    }
}
