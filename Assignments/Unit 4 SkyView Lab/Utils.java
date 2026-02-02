public class Utils {
    public static String testerLabel(String method, String input) {
        return method + "(" + input + "): ";
    }

    public static String printIntArr(int[] arr) {
        String s = "[";
        for (int i = 0; i < arr.length; i++) {
            s += Integer.toString(arr[i]);
            if (i != arr.length - 1) {
                s += ", ";
            }
        }
        return s + "]";
    }

    // trying something new... similar method to previous CodeGrade testers
    // might start doing this tester style more often to give myself feedback
    public static void assertTrue(boolean condition, String successMsg, String failMsg) {
        if (condition) {
            System.out.println("PASS: " + successMsg);
        } else {
            System.out.println("FAIL: " + failMsg);
        }
    }
}
