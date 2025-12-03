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

        return false;
    }

    public static String mixString(String a, String b) {
        // to-do: implement this method
        return "";

    }

    public static String repeatEnd(String str, int n) {
        // to-do: implement this method
        return "";
    }

    public static boolean endOther(String a, String b) {
        // to-do: implement this method
        return false;
    }

    public static int countCode(String str) {
        // to-do: implement this method
        return 0;
    }

    public static int countEvens(int[] nums) {
        // to-do: implement this method
        return 0;
    }

    public static int bigDiff(int[] nums) {
        // to-do: implement this method
        return 0;
    }

    public static int sum13(int[] nums) {
        // to-do: implement this method
        return 0;
    }

    public static int[] fizzArray(int n) {
        // to-do: implement this method
        return new int[0];
    }

    public static boolean haveThree(int[] nums) {
        // to-do: implement this method
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
