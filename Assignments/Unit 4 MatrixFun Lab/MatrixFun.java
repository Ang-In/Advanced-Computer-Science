public class MatrixFun {
    // instance variables
    private int[][] matrix;

    // constructors
    public MatrixFun(int numberOfRows, int numberOfCols) {
        matrix = new int[numberOfRows][numberOfCols];
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfCols; j++) {
                matrix[i][j] = Utils.generateDigit();
            }
        }
    }

    public MatrixFun(int[][] starterMatrix) {
        // to-do: edit to handle irregular matrix exceptions
        matrix = starterMatrix;
    }

    public MatrixFun() {
        // to-do: compress into one line of code
        matrix = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = Utils.generateDigit();
            }
        }
    }

    // getters
    public int[][] getMatrix() {
        return matrix;
    }

    // setters
    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    // methods
    public String toString() {
        String result = "=".repeat(matrix[0].length);
        result += "\n";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                result += matrix[i][j] + " ";

            }
            result += "\n";
        }
        result += "=".repeat(matrix[0].length);

        return result;
    }

    public boolean equals(MatrixFun other) {
        if (this.toString().equals(other.toString())) {
            return true;
        }
        return false;
    }

    public boolean equals(int[][] other) {
        if (this.matrix.length != other.length) {
            return false;
        }

        for (int i = 0; i < matrix.length; i++) {
            int thisColCountInRow = matrix[i].length;
            int otherColCountInRow = other[i].length;
            if (thisColCountInRow != otherColCountInRow) {
                return false;
            }

            for (int j = 0; j < thisColCountInRow; j++) {
                if (matrix[i][j] != other[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public void replaceAll(int oldValue, int newValue) {
        for (int i = 0; i < matrix.length; i++) {
            int colCountInRow = matrix[i].length;
            for (int j = 0; j < colCountInRow; j++) {
                if (matrix[i][j] == oldValue) {
                    matrix[i][j] = newValue;
                }
            }
        }
    }

    public void swapRow(int rowA, int rowB) {
        if (rowA < 0 || rowA > matrix.length || rowB < 0 || rowB > matrix.length) {
            throw new IllegalArgumentException(
                    "Your row selection must be in the range of the matrix!");
        }

        int[] temp = matrix[rowA];
        matrix[rowA] = matrix[rowB];
        matrix[rowB] = temp;
    }
}
