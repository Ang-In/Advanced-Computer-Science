public class Utils {
    /**
     * Prints the contents of a String array, separating each element with a comma and enclosing the
     * output in square brackets [].
     *
     * @param array The String array to be printed.
     * @return The String representation of the array.
     */

    public static String printStringArray(String[] array) {
        String arrayDesc = "[";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                arrayDesc = arrayDesc + array[i];
            } else {
                arrayDesc = arrayDesc + array[i] + ", ";
            }
        }
        arrayDesc = arrayDesc + "]";

        // System.out.println(arrayDesc);
        return arrayDesc;
    }

    /**
     * Prints the contents of an int array, separating each element with a comma and enclosing the
     * output in square brackets [].
     *
     * @param array The int array to be printed.
     * @return The String representation of the array.
     */

    public static String printIntegerArray(int[] array) {
        String arrayDesc = "[";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                arrayDesc = arrayDesc + array[i];
            } else {
                arrayDesc = arrayDesc + array[i] + ", ";
            }
        }
        arrayDesc = arrayDesc + "]";

        // System.out.println(arrayDesc);
        return arrayDesc;
    }
}
