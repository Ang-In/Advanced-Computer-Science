public class TriangleLoops {
    /*
     * The method returns a String by creating rows of letters. Each row prints a number of letters
     * equal to the row number. The total number of rows printed is determined by numberOfRows.
     * 
     * @param numberOfRows the number of rows in the triangle
     * 
     * @param letter the letter to be printed
     * 
     * @return a String of letters in the shape of a triangle
     */

    // to-do: implement createLetterTriangleUp
    public static String createLetterTriangleUp(int numberOfRows, char letter) {
        String triangle = "";

        if (numberOfRows < 0) {
            numberOfRows = 0;
        }

        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j <= i; j++) {
                triangle += letter;
            }
            if (i != numberOfRows - 1) {
                triangle += "\n";
            }
        }
        return triangle;
    }

    /*
     * The method returns a String by creating rows of letters. Each row prints a number of letters
     * equal to the total number of rows, descending downward. The total number of rows printed is
     * determined by numberOfRows.
     * 
     * @param numberOfRows the number of rows in the triangle
     * 
     * @param letter the letter to be printed
     * 
     * @return a String of letters in the shape of a triangle
     */
    // to-do: implement createLetterTriangleDown
    public static String createLetterTriangleDown(int numberOfRows, char letter) {
        String triangle = "";

        if (numberOfRows < 0) {
            numberOfRows = 0;
        }

        for (int i = 0; i < numberOfRows; i++) {
            for (int j = numberOfRows - i; j > 0; j--) {
                triangle += letter;
            }

            if (i != numberOfRows - 1) {
                triangle += "\n";
            }
        }
        return triangle;
    }

    /*
     * This method returns a String of a number triangle. The number of rows in the triangle is
     * determined by the numberOfRows, and the number used in each row is determined by the row
     * number.
     * 
     * @param numberOfRows the number of rows in the triangle
     * 
     * @return a String of numbers in the shape of a triangle
     */
    // to-do: implement createNumbersTriangle
    public static String createNumbersTriangle(int numberOfRows) {
        String triangle = "";

        if (numberOfRows < 0) {
            numberOfRows = 0;
        }

        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = 0; j < i; j++) {
                triangle += i;
                triangle += " ";
            }
            if (i != numberOfRows) {
                triangle += "\n";
            }
        }
        return triangle;
    }

    /*
     * The method returns a String by creating a pyramid pattern using the alphabet. The method
     * determines the height of the pyramid by using the int numberOfRows.
     * 
     * @param numberOfRows the number of rows in the triangle
     * 
     * @return a String of letters in the shape of a pyramid
     */
    // to-do: implement createAlphabetTriangle
    public static String createAlphabetTriangle(int numberOfRows) {
        String triangle = "";
        int convertToChar = 64;

        if (numberOfRows > 26) {
            numberOfRows = 26;
        }

        for (int i = 1; i <= numberOfRows; i++) {
            boolean lineSpaced = false;
            int j = numberOfRows - 1;

            // adding spaces
            while (j > 0 && lineSpaced == false) {
                triangle += " ";
                lineSpaced = !lineSpaced;
            }

            // adding chars to the triangle
            for (int k = 0; k < i; k++) {
                if (i == 1) {
                    triangle += (char) (i + convertToChar);
                } else {
                    String prevLayer = triangle.substring(-1 - ((i - 1) * 2), -1);
                    String firstHalf = prevLayer.substring(0, prevLayer.length() / 2);
                }

                triangle += (char) (i + convertToChar);
                triangle += reverse;
                reverse = ((char) (i + convertToChar)) + reverse;
            }

            if (i != numberOfRows) {
                triangle += "\n";
            }
        }
        return triangle;
    }
}
