public class Utils {
    public static String testerLabel(String method, String input) {
        return method + "(\"" + input + "\"): ";
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
}
