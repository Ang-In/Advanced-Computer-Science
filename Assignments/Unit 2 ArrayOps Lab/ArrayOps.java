public class ArrayOps {

    /**
     * Prints the contents of a string array, separating each element with a comma and enclosing the
     * output in square brackets [].
     *
     * @param array The String array to be printed.
     * @return The constructed string representation of the array.
     */
    public static String printStringArray(String[] array) {
        // to-do: come back to null-proof this method
        String arrayDesc = "[";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                arrayDesc = arrayDesc + array[i];
            } else {
                arrayDesc = arrayDesc + array[i] + ", ";
            }
        }
        arrayDesc = arrayDesc + "]";

        System.out.println(arrayDesc);
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

        System.out.println(arrayDesc);
        return arrayDesc;
    }

    /**
     * The method finds the largest integer in the array.
     *
     * @param array The int array to find the maximum value from.
     * @return The largest integer in the array.
     */
    public static int findMax(int[] array) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            largest = Math.max(largest, array[i]);
        }

        return largest;
    }

    /**
     * The method returns the longest String in the array. If two Strings share the longest length,
     * the method will return the one that appears first in the array.
     *
     * @param array The String array to find the longest String from.
     * @return The longest String in the array.
     */
    public static String findLongestString(String[] array) {
        // to-do: come back to null-proof this method

        String longest = "";
        for (int i = 0; i < array.length; i++) {
            if (longest.length() < array[i].length()) {
                longest = array[i];
            }
        }

        return longest;
    }

    /**
     * Calculates the average length of all the Strings in the array.
     *
     * @param array The String array to find the average string length from.
     * @return The average length of all the Strings in the array.
     */
    public static double averageStringLength(String[] array) {
        double avg = 0.0;
        int skipped = 0;

        for (String str : array) {
            if (str == null) {
                skipped++;
                continue;
            }
            avg += str.length();
        }

        avg /= (array.length - skipped);

        return avg;
    }

    /**
     * Counts the number of times each letter appears in the given String. The method creates an
     * array of integers length 26, where each element represents the frequency of a letter in the
     * alphabet. The first element (index 0) represents the frequency of the letter 'a', the second
     * element (index 1) represents the frequency of the letter 'b', and so on.
     *
     * @param input The input string to count letter frequencies from.
     * @return An int array representing the frequency of each letter in the input string.
     */
    public static int[] countLetterFrequencies(String input) {
        int[] frequency = new int[26];

        if (input != null) {
            for (int i = 0; i < frequency.length; i++) {
                char curChar = (char) ('a' + i);
                int count = 0;
                for (int j = 0; j < input.length(); j++) {
                    if (input.charAt(j) == curChar || input.charAt(j) == (char) (curChar + 32)) {
                        count++;
                    }
                }
                frequency[i] = count;
            }
        }

        return frequency;
    }

    /**
     * Removes the indicated element, shifts the index of all the elements down by one, and assigns
     * a value of zero to the last element in the array.
     *
     * @param array The array of int values
     * @param index The index of the element to be removed
     * @return The updated array
     */
    public static int[] removeIntAndScoot(int[] array, int index) {
        int[] shiftedArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (i == (array.length - 1)) {
                shiftedArray[i] = 0;
            } else if (i >= index) {
                shiftedArray[i] = array[i + 1];
            } else {
                shiftedArray[i] = array[i];
            }

        }
        return shiftedArray;
    }

    /**
     * Resizes the input array to twice its size.
     *
     * @param array The input array of integers
     * @return The resized array
     */
    public static int[] resizeIntArray(int[] array) {
        return new int[0];
    }

    /**
     * Adds the number symbol (#) and the element number (index) to the beginning of each String in
     * the array. For example, if the array contained: {"Hello", "my", "name", "is", "Larry"}, then
     * this method would return an array with the contents: {"#0 Hello", "#1 my", "#2 name", "#3
     * is", "#4 Larry"}.
     *
     * @param array The array of Strings to modify
     * @return The modified array with the number symbol and element number added to each String
     */
    public static String[] addNumToStringArray(String[] array) {
        return new String[0];
    }

    /**
     * Reverses the order of the elements in the given integer array.
     *
     * @param array The array to be reversed
     * @return The reversed array
     */
    public static int[] reverseIntArray(int[] array) {
        return new int[0];
    }

}
