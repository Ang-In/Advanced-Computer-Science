public class Triangle extends Polygon {
    // instance variables
    protected double base;
    protected double height;

    // constructors
    public Triangle(double base, double height) {
        super(3);

        if (base < 0 || height < 0) {
            throw new IllegalArgumentException(
                    "Cannot make a triangle with impossible dimensions!");
        }

        this.base = base;
        this.height = height;
    }

    public Triangle() {
        this(3, 4);
    }

    // getters
    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    // setters
    public void setBase(double base) {
        if (base < 0) {
            throw new IllegalArgumentException("Cannot make a triangle with a negative base!");
        }
        this.base = base;
    }

    public void setHeight(double height) {
        if (height < 0) {
            throw new IllegalArgumentException("Cannot make a triangle with a negative height!");
        }
        this.height = height;
    }

    // inherited methods
    @Override
    public double getArea() {
        return 0.5 * (base * height);
    }

    @Override
    public String toString() {
        String TriangleDetails = "\nIt is a triangle with a base of " + base + " and height of "
                + height + ". Its area is " + getArea() + ".";
        return super.toString() + TriangleDetails;
    }
}
