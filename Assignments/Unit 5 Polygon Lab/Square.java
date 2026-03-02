public class Square extends Rectangle {
    // constructors
    public Square(double sideLength) {
        super(sideLength, sideLength);
    }

    public Square() {
        this(4);
    }

    // inherited methods
    public String toString() {
        return super.toString() + "\nIt is also a square.";
    }
}
