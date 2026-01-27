public class MatrixFunTester {
    public static void main(String[] args) {
        System.out.println("Testing constructors + toString()");
        testConstructorsAndToString();
        System.out.println();

        System.out.println("Testing equals(MatrixFun)");
        testEqualsMatrixFun();
        System.out.println();

        System.out.println("Testing equals(int[][])");
        testEqualsInt2D();
        System.out.println();

        System.out.println("Testing replaceAll(oldValue, newValue)");
        testReplaceAll();
        System.out.println();

        System.out.println("Testing swapRow(rowA, rowB)");
        testSwapRow();
        System.out.println();
    }

    public static void testConstructorsAndToString() {
        // Test Case - Main Case: starter matrix constructor
        int[][] starter = {{1, 1, 3}, {4, 5, 6}, {7, 8, 9}};
        MatrixFun m1 = new MatrixFun(starter);
        System.out.println("Expected matrix printed (3x3):");
        System.out.println(m1);

        // Test Case - Main Case: size constructor
        MatrixFun m2 = new MatrixFun(2, 4);
        System.out.println("Expected a 2x4 matrix printed (values 0-9):");
        System.out.println(m2);

        // Test Case - Edge Case: irregular (jagged) matrix (may break some methods)
        try {
            int[][] jagged = {{1, 2, 3}, {4, 5}, {6}};
            MatrixFun m3 = new MatrixFun(jagged);
            System.out
                    .println("Jagged matrix created. Printing (may error depending on your code):");
            System.out.println(m3);
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "Constructor/toString threw an exception for a jagged matrix, as expected.");
        }

        // Test Case - Edge Case: null starter matrix
        try {
            int[][] nullMatrix = null;
            MatrixFun m4 = new MatrixFun(nullMatrix);
            System.out.println("Expected exception: " + m4);
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("Constructor threw an exception for a null matrix, as expected.");
        }
    }

    public static void testEqualsMatrixFun() {
        int[][] a = {{1, 1, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] b = {{1, 1, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] c = {{1, 1, 3}, {4, 0, 6}, {7, 8, 9}};

        MatrixFun mA = new MatrixFun(a);
        MatrixFun mB = new MatrixFun(b);
        MatrixFun mC = new MatrixFun(c);

        // Test Case - Main Case: same values
        System.out.println("Expected true: " + mA.equals(mB));

        // Test Case - Main Case: different values
        System.out.println("Expected false: " + mA.equals(mC));

        // Test Case - Edge Case: null other
        try {
            MatrixFun mNull = null;
            System.out.println("Expected exception: " + mA.equals(mNull));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("equals(MatrixFun) threw an exception for null, as expected.");
        }
    }

    public static void testEqualsInt2D() {
        int[][] base = {{1, 1, 3}, {4, 5, 6}, {7, 8, 9}};
        MatrixFun mat = new MatrixFun(base);

        // Test Case - Main Case: identical 2D array
        int[][] same = {{1, 1, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Expected true: " + mat.equals(same));

        // Test Case - Main Case: different value
        int[][] diffVal = {{1, 1, 3}, {4, 5, 6}, {7, 8, 0}};
        System.out.println("Expected false: " + mat.equals(diffVal));

        // Test Case - Edge Case: different row count
        int[][] diffRows = {{1, 1, 3}, {4, 5, 6}};
        System.out.println("Expected false: " + mat.equals(diffRows));

        // Test Case - Edge Case: jagged other array
        int[][] jagged = {{1, 1, 3}, {4, 5}, {7, 8, 9}};
        System.out.println("Expected false: " + mat.equals(jagged));

        // Test Case - Edge Case: null other array
        try {
            int[][] nullOther = null;
            System.out.println("Expected exception: " + mat.equals(nullOther));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("equals(int[][]) threw an exception for null, as expected.");
        }
    }

    public static void testReplaceAll() {
        int[][] starter = {{1, 1, 3}, {4, 5, 6}, {7, 8, 9}};
        MatrixFun mat = new MatrixFun(starter);

        // Replace 1's with 9's
        mat.replaceAll(1, 9);

        int[][] expected = {{9, 9, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Expected true: " + mat.equals(expected));
        System.out.println("Expected updated matrix printed:");
        System.out.println(mat);

        // Edge Case: value not present (no changes)
        mat.replaceAll(0, 7);
        System.out.println("Expected true (unchanged): " + mat.equals(expected));
    }

    public static void testSwapRow() {
        int[][] starter = {{1, 1, 3}, {4, 5, 6}, {7, 8, 9}};
        MatrixFun mat = new MatrixFun(starter);

        // Test Case - Main Case: swap row 0 and 1 (assignment spec)
        // Expected:
        // 4 5 6
        // 1 1 3
        // 7 8 9
        mat.swapRow(0, 1);

        int[][] expected = {{4, 5, 6}, {1, 1, 3}, {7, 8, 9}};
        System.out.println("Expected true: " + mat.equals(expected));
        System.out.println("Expected swapped matrix printed:");
        System.out.println(mat);

        // Test Case - Edge Case: same row swap (should keep matrix the same)
        mat.swapRow(1, 1);
        System.out.println("Expected true (unchanged): " + mat.equals(expected));

        // Test Case - Edge Case: out of bounds (negative)
        try {
            mat.swapRow(-1, 1);
            System.out.println("Expected exception (but none was thrown).");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("swapRow threw an exception for negative index, as expected.");
        }

        // Test Case - Edge Case: out of bounds (too large)
        try {
            mat.swapRow(0, 3); // for 3x3 rows are 0,1,2
            System.out.println("Expected exception (but none was thrown).");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("swapRow threw an exception for out-of-range index, as expected.");
        }
    }
}
