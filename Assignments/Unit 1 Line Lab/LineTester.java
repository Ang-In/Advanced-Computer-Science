public class LineTester {
    public static void main(String[] args) {
        Point p1 = new Point(2, 7);
        Point p2 = new Point(1, 4);
        Point p3 = new Point(11, 18);
        Point p4 = new Point(4, 13);
        Line pointLine = new Line(p1, p2);

        // testing calculateSlope() & calculateSlopeFromPoints()
        System.out.println("Using calculateSlope(): " + pointLine.calculateSlope());
        System.out.println(
                "Using calculateSlopeFromPoints(): " + pointLine.calculateSlopeFromPoints());
        if (pointLine.calculateSlope() == pointLine.calculateSlopeFromPoints()) {
            System.out.println("The slopes produced are equal!");
        } else {
            System.out.println("The slopes produced are not equal!");
        }

        // testing isCoordinateOnLine()
        System.out.println("Is p1 on the line? " + pointLine.isCoordinateOnLine(p1)); // true
        System.out.println("Is p2 on the line? " + pointLine.isCoordinateOnLine(p2)); // true
        System.out.println("Is p3 on the line? " + pointLine.isCoordinateOnLine(p3)); // false
        System.out.println("Is p4 on the line? " + pointLine.isCoordinateOnLine(p4)); // true
    }
}
