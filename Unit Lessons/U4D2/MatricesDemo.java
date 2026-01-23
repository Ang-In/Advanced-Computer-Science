public class MatricesDemo {
    // in other words: a list of lists
    public static void main(String[] args) {
        int[][] table = new int[3][4]; // three rows, four columns
        table[1][2] = 50;

        // nested for loops are the only way to see every element in a matrix
        for (int[] row : table) {
            for (int cell : row) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }

        // irregular matrix: the rows are not the same length, so be careful accessing their values!
        int[][] fun = {{1, 2, 3}, {4, 5}, {6, 7, 8,}};
        // System.out.println(fun[1][2]); // <- throws an exception

        // you can make matrices in more than two dimensions!
        int[][][] funToTheMax = new int[3][3][3];
    }
}
