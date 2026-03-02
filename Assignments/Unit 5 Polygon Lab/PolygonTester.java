public class PolygonTester {
    public static void main(String[] args) {
        System.out.println(" == Testing Triangle == ");
        triangleTester();
        System.out.println();

        // System.out.println(" == Testing Rectangle == ");
        // rectangleTester();
        // System.out.println();

        // System.out.println(" == Testing Square == ");
        // squareTester();
        // System.out.println();
    }

    private static void triangleTester() {
        System.out.println("Testing Constructors:");
        testTriangleConstructors();

        System.out.println("Testing Getters & Setters:");
        testTriangleGettersAndSetters();

        System.out.println("Testing getArea():");
        testTriangleGetArea();

        System.out.println("Testing toString():");
        testTriangleToString();
    }

    private static void testTriangleConstructors() {
        // Edge Case: Impossible Dimensions
        try {
            Triangle test = new Triangle(-1, -1);
            System.out.println("Expected exception!");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The constructor threw an exception when the dimensions were invalid, as expected");
        }

        // Main Case: Valid Dimensions
        Triangle test1 = new Triangle(2, 5);
        if (test1.getBase() == 2 && test1.getHeight() == 5) {
            System.out.println(
                    "The constructor created a triangle with base 2 and height 5, as expected");
        } else {
            System.out.println("ERROR: Constructor failed to create the expected triangle!");
        }

        // Main Case: No dimensions given
        Triangle test2 = new Triangle();
        if (test2.getBase() == 3 && test2.getHeight() == 4) {
            System.out.println(
                    "The constructor created a triangle with base 3 and height 4, as expected");
        } else {
            System.out.println("ERROR: Constructor failed to create the expected triangle!");
        }
    }

    private static void testTriangleGettersAndSetters() {
        // Edge Case: Setting a Negative Base
        try {
            Triangle test = new Triangle();
            test.setBase(-1);
            System.out.println("Expected exception!");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The setter threw an exception when setting the base to a negative number, as expected");
        }

        // Edge Case: Setting a Negative Height
        try {
            Triangle test = new Triangle();
            test.setHeight(-1);
            System.out.println("Expected exception!");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The setter threw an exception when setting the height to a negative number, as expected");
        }

        // Main Case: Get valid base and height
        Triangle test1 = new Triangle();
        if (test1.getBase() == 3 && test1.getHeight() == 4) {
            System.out.println(
                    "The getters obtained the width and height of the triangle, as expected");
        } else {
            System.out.println("ERROR: Getters failed to obtain the expected values!");
        }

        // Main Case: Set valid base and height
        Triangle test2 = new Triangle();
        test2.setBase(2.5);
        test2.setHeight(7.5);
        if (test2.getBase() == 2.5 && test2.getHeight() == 7.5) {
            System.out.println(
                    "The setters set the base and height of the triangle to the given values, as expected");
        } else {
            System.out.println("ERROR: Setters failed to set the expected base and height!");
        }
    }

    private static void testTriangleGetArea() {
        // Main Case: Area = (1/2)(Base * Height)
        Triangle test = new Triangle(); // Area = 0.5 * 3 * 4 = 6
        System.out.println("Triangle Dimensions: Base = 3, Height = 4");

        if (test.getArea() == 6) {
            System.out.println(
                    "getArea() obtained the correct area for the triangle (Area = 6), as expected");
        } else {
            System.out.println("ERROR: getArea() failed to obtain the intended area!");
            System.out.println("Intended: 6 | getArea(): " + test.getArea());
        }
    }

    private static void testTriangleToString() {
        // Main Case: Printing Correct Format
        Triangle test = new Triangle();
        String intended =
                "This is a Polygon.\nIt is a triangle with a base of 3.0 and a height of 4.0. Its area is 6.0.";
        System.out.println(test);

        if (test.toString().equals(intended)) {
            System.out.println("The toString() method returns the correct format, as expected");
        } else {
            System.out.println("ERROR: Incorrect toString formatting!");
        }
    }

}
