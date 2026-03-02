public class Rectangle extends Polygon {
    // instance variables
    protected double length;
    protected double width;

    // constructors
    public Rectangle(double width, double length) {
        super(4);
        if (width < 0 || length < 0) {
            throw new IllegalArgumentException(
                    "Cannot make a rectangle with impossible dimensions!");
        }
        this.width = width;
        this.length = length;
    }

    public Rectangle() {
        this(3, 4);
    }

    // getters
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    // setters
    public void setLength(double length) {
        if (length < 0) {
            throw new IllegalArgumentException("Cannot make a rectangle with a negative length!");
        }
        this.length = length;
    }

    public void setWidth(double width) {
        if (width < 0) {
            throw new IllegalArgumentException("Cannot make a rectangle with a negative width!");
        }
        this.width = width;
    }

    // inherited methods
    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public String toString() {
        String rectangleDetails = "\nIt is a rectangle with a length of " + length
                + " and width of " + width + ". Its area is " + getArea() + ".";
        return super.toString() + rectangleDetails;
    }
}
