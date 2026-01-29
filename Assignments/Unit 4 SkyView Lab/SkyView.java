public class SkyView {
    // instance variables
    private double[][] view;

    // constructors
    public SkyView(int numberOfRows, int numberOfCols, double[] scanned) {
        if (numberOfRows < 0 || numberOfCols < 0) {
            throw new IllegalArgumentException("Cannot make a view with negative dimensions!");
        }
        if (numberOfRows * numberOfCols < scanned.length) {
            throw new IllegalArgumentException(
                    "Not enough space (rows x columns) to display all data!");
        }
        // to-do: decide what to do about length 0 arrays
        /*
         * if(scanned.length == 0){ System.out.println("Warning: No data provided"); }
         */

        view = new double[numberOfRows][numberOfCols];
        int scannedIndex = 0;
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfCols; j++) {
                if (scannedIndex >= scanned.length) {
                    view[i][j] = 0.0;
                }
                view[i][j] = scanned[scannedIndex];
                scannedIndex++;
            }
        }
    }

    // getters
    public double[][] getView() {
        return view;
    }

    // setters
    public void setView(double[][] view) {
        this.view = view;
    }

    // inherited methods
    public boolean equals(SkyView other) {
        if (this.view.length != other.view.length) {
            return false;
        }
        for (int i = 0; i < view.length; i++) {
            if (this.view[i].length != other.view[i].length) {
                return false;
            }

            for (int j = 0; j < view[i].length; j++) {
                if (this.view[i][j] != other.view[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }

    public String toString() {
        String viewString = "";
        for (int i = 0; i < view.length; i++) {
            int rowLength = view[i].length;
            for (int j = 0; j < rowLength; j++) {
                viewString += view[i][j] + " ";
            }
            viewString += "\n";
        }

        return viewString;
    }

    // methods
    public double getAverage(int startRow, int endRow, int startCol, int endCol){
        //0 <= startRow <= endRow < view.length, 0 <= startCol <= endCol < view[0].length
        if()

        double avg = 0.0;

        return avg;
    }

}
