public class SkyViewTester {
    public static void main(String[] args) {
        System.out.println("Testing SkyView Class:");

        System.out.println(Utils.testerLabel("SkyView", ""));
        testConstructor();
        System.out.println();

        System.out.println(Utils.testerLabel("getView(); & setView", ""));
        testGetSetView();
        System.out.println();

        System.out.println(Utils.testerLabel("equals", ""));
        testEquals();
        System.out.println();

        System.out.println(Utils.testerLabel("toString", ""));
        testToString();
        System.out.println();

        System.out.println(Utils.testerLabel("getAverage", ""));
        testGetAverage();
        System.out.println();
    }

    public static void testConstructor() {

        try {
            new SkyView(-1, 2, new double[] {1.0, 2.0});
            System.out.println("Expected exception!");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The constructor threw an exception for negative rows, as expected");
        }

        try {
            new SkyView(2, -1, new double[] {1.0, 2.0});
            System.out.println("Expected exception!");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The constructor threw an exception for negative cols, as expected");
        }

        try {
            new SkyView(1, 2, new double[] {1.0, 2.0, 3.0});
            System.out.println("Expected exception!");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The constructor threw an exception when 2D array was too small, as expected");
        }

        try {
            SkyView testSkyView = new SkyView(2, 2, new double[] {1.0, 2.0, 3.0, 4.0});
            double[][] testView = testSkyView.getView();

            if (testView[0][0] == 1.0 && testView[0][1] == 2.0 && testView[1][0] == 3.0
                    && testView[1][1] == 4.0) {
                System.out.println(
                        "Constructor formatted scanned data into a 2D array, as expected");
            } else {
                System.out.println(
                        "Unexpected: Constructor did not size 2D array properly!");
            }

        } catch (Exception e) {
            System.out.println("Unexpected Exception!");
            System.out.println(e.toString());
        }

        try {
            SkyView testSkyView = new SkyView(2, 3, new double[] {10.0, 20.0});
            double[][] testView = testSkyView.getView();

            boolean ok = testView[0][0] == 10.0 && testView[0][1] == 20.0 && testView[0][2] == 0.0
                    && testView[1][0] == 0.0 && testView[1][1] == 0.0 && testView[1][2] == 0.0;

            if (ok) {
                System.out
                        .println("Constructor padded missing scanned values with 0.0, as expected");
            } else {
                System.out.println("Unexpected: Constructor did not pad missing values!");
            }

        } catch (Exception e) {
            System.out.println("Unexpected Exception!");
            System.out.println(e.toString());
        }
    }

    public static void testGetSetView() {
        try {
            SkyView testSkyView = new SkyView(1, 1, new double[] {5.0});
            double[][] newView = new double[][] {{42.0, 43.0}, {44.0, 45.0}};
            testSkyView.setView(newView);
            double[][] testView = testSkyView.getView();

            if (testView == newView) {
                System.out.println(
                        "setView and getView function as expected");
            } else {
                System.out.println(
                        "Unexpected: setView/getView did not return the same array value!");
            }

        } catch (Exception e) {
            System.out.println("Unexpected Exception!");
            System.out.println(e.toString());
        }
    }

    public static void testEquals() {
        try {
            SkyView a = new SkyView(2, 2, new double[] {1, 2, 3, 4});
            SkyView b = new SkyView(2, 2, new double[] {1, 2, 3, 4});
            SkyView c = new SkyView(2, 2, new double[] {1, 2, 3, 99});
            SkyView d = new SkyView(1, 4, new double[] {1, 2, 3, 4});

            System.out.println("Expected true: " + a.equals(b));
            System.out.println("Expected false: " + a.equals(c));
            System.out.println("Expected false: " + a.equals(d));

        } catch (Exception e) {
            System.out.println("Unexpected Exception!");
            System.out.println(e.toString());
        }
    }

    public static void testToString() {
        try {
            SkyView testSkyView = new SkyView(2, 3, new double[] {1, 2, 3, 4, 5, 6});
            System.out.println("toString output:");
            System.out.println(testSkyView.toString());
        } catch (Exception e) {
            System.out.println("Unexpected Exception!");
            System.out.println(e.toString());
        }
    }

    public static void testGetAverage() {
        SkyView testSkyView = new SkyView(3, 3, new double[] {1, 2, 3, 4, 5, 6, 7, 8, 9});

        try {
            double avg = testSkyView.getAverage(0, 2, 0, 2);
            System.out.println("Expected 5.0: " + avg);
        } catch (Exception e) {
            System.out.println("Unexpected Exception!");
            System.out.println(e.toString());
        }

        try {
            double avg = testSkyView.getAverage(0, 1, 0, 1);
            System.out.println("Expected 3.0: " + avg);
        } catch (Exception e) {
            System.out.println("Unexpected Exception!");
            System.out.println(e.toString());
        }

        try {
            testSkyView.getAverage(-1, 0, 0, 0);
            System.out.println("Expected exception!");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("getAverage threw an exception for negative indexes, as expected");
        }

        try {
            testSkyView.getAverage(2, 1, 0, 0);
            System.out.println("Expected exception!");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("getAverage threw an exception when startRow > endRow, as expected");
        }

        try {
            testSkyView.getAverage(0, 3, 0, 0);
            System.out.println("Expected exception!");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("getAverage threw an exception for row out of bounds, as expected");
        }

        try {
            testSkyView.getAverage(0, 0, 0, 3);
            System.out.println("Expected exception!");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("getAverage threw an exception for col out of bounds, as expected");
        }
    }
}
