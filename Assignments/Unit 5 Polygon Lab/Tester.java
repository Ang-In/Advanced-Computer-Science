public class Tester {
    public static void main(String[] args) {
        System.out.println(" == Testing Triangle == ");
        triangleTester();
        System.out.println();

        System.out.println(" == Testing Rectangle == ");
        rectangleTester();
        System.out.println();

        System.out.println(" == Testing Square == ");
        squareTester();
        System.out.println();
    }

    private static void squareTester() {
        System.out.println("Testing Constructors:");
        testSquareConstructors();

        System.out.println(
                "Square getters and setters are the same as Rectangle getters and setters; no need to test twice");

        System.out.println("Testing toString():");
        testSquareToString();
    }

    private static void testSquareConstructors() {
        // Edge Case: Impossible Dimensions
        try {
            Square test = new Square(-1);
            System.out.println("Expected exception!");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The constructor threw an exception when the dimensions were invalid, as expected");
        }

        // Main Case: Valid Dimensions
        Square test1 = new Square(5);
        if (test1.getWidth() == 5 && test1.getLength() == 5) {
            System.out.println("The constructor created a square with sidelength 5, as expected");
        } else {
            System.out.println("ERROR: Constructor failed to create the expected square!");
        }

        // Main Case: No dimensions given
        Square test2 = new Square();
        if (test2.getWidth() == 4 && test2.getLength() == 4) {
            System.out.println("The constructor created a square with sidelength 4, as expected");
        } else {
            System.out.println("ERROR: Constructor failed to create the expected square!");
        }
    }

    private static void testSquareToString() {
        // Main Case: Printing Correct Format
        Square test = new Square();
        String intended = "This is a Polygon." + "\nIt is a rectangle with a length of "
                + test.getLength() + " and width of " + test.getWidth() + ". Its area is "
                + test.getArea() + "." + "\nIt is also a square.";
        System.out.println(test.toString());

        if (test.toString().equals(intended)) {
            System.out.println("The toString() method returns the correct format, as expected");
        } else {
            System.out.println("ERROR: Incorrect toString formatting!");
        }
    }

    private static void rectangleTester() {
        System.out.println("Testing Constructors:");
        testRectangleConstructors();

        System.out.println("Testing Getters & Setters:");
        testRectangleGettersAndSetters();

        System.out.println("Testing getArea():");
        testRectangleGetArea();

        System.out.println("Testing toString():");
        testRectangleToString();
    }

    private static void testRectangleConstructors() {
        // Edge Case: Impossible Dimensions
        try {
            Rectangle test = new Rectangle(-1, -1);
            System.out.println("Expected exception!");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The constructor threw an exception when the dimensions were invalid, as expected");
        }

        // Main Case: Valid Dimensions
        Rectangle test1 = new Rectangle(2, 5);
        if (test1.getWidth() == 2 && test1.getLength() == 5) {
            System.out.println(
                    "The constructor created a rectangle with width 2 and length 5, as expected");
        } else {
            System.out.println("ERROR: Constructor failed to create the expected rectangle!");
        }

        // Main Case: No dimensions given
        Rectangle test2 = new Rectangle();
        if (test2.getWidth() == 3 && test2.getLength() == 4) {
            System.out.println(
                    "The constructor created a rectangle with width 3 and length 4, as expected");
        } else {
            System.out.println("ERROR: Constructor failed to create the expected rectangle!");
        }
    }

    private static void testRectangleGettersAndSetters() {
        // Edge Case: Setting a Negative Length
        try {
            Rectangle test = new Rectangle();
            test.setLength(-1);
            System.out.println("Expected exception!");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The setter threw an exception when setting the length to a negative number, as expected");
        }

        // Edge Case: Setting a Negative Width
        try {
            Rectangle test = new Rectangle();
            test.setWidth(-1);
            System.out.println("Expected exception!");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The setter threw an exception when setting the width to a negative number, as expected");
        }

        // Main Case: Get valid base and height
        Rectangle test1 = new Rectangle();
        if (test1.getWidth() == 3 && test1.getLength() == 4) {
            System.out.println(
                    "The getters obtained the width and height of the rectangle, as expected");
        } else {
            System.out.println("ERROR: Getters failed to obtain the expected values!");
        }

        // Main Case: Set valid base and height
        Rectangle test2 = new Rectangle();
        test2.setWidth(2.5);
        test2.setLength(7.5);
        if (test2.getWidth() == 2.5 && test2.getLength() == 7.5) {
            System.out.println(
                    "The setters set the length and width of the rectangle to the given values, as expected");
        } else {
            System.out.println("ERROR: Setters failed to set the expected length and width!");
        }
    }

    private static void testRectangleGetArea() {
        // Main Case: Area = (1/2)(Base * Height)
        Rectangle test = new Rectangle(); // Area = 3 * 4 = 12
        System.out.println("Rectangle Dimensions: Width = 3, Length = 4");

        if (test.getArea() == 12) {
            System.out.println(
                    "getArea() obtained the correct area for the rectangle (Area = 12), as expected");
        } else {
            System.out.println("ERROR: getArea() failed to obtain the intended area!");
            System.out.println("Intended: 12 | getArea(): " + test.getArea());
        }
    }

    private static void testRectangleToString() {
        // Main Case: Printing Correct Format
        Rectangle test = new Rectangle();
        String intended = "This is a Polygon." + "\nIt is a rectangle with a length of "
                + test.getLength() + " and width of " + test.getWidth() + ". Its area is "
                + test.getArea() + ".";
        System.out.println(test.toString());

        if (test.toString().equals(intended)) {
            System.out.println("The toString() method returns the correct format, as expected");
        } else {
            System.out.println("ERROR: Incorrect toString formatting!");
        }
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
        String intended = "This is a Polygon." + "\nIt is a triangle with a base of "
                + test.getBase() + " and height of " + test.getHeight() + ". Its area is "
                + test.getArea() + ".";
        System.out.println(test.toString());

        if (test.toString().equals(intended)) {
            System.out.println("The toString() method returns the correct format, as expected");
        } else {
            System.out.println("ERROR: Incorrect toString formatting!");
        }
    }

}
