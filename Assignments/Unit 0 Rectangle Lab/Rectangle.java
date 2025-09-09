public class Rectangle {

    // instance vars
    int length;
    int width;

    // init functions
    public Rectangle() {
        length = 24;
        width = 12;
    }

    public Rectangle(int newLength, int newWidth) {
        length = newLength;
        width = newWidth;
    }

    // methods
    public String toString() {
        return "This rectangle has a length of " + length + " and a width of " + width
                + ".  It's area is " + (length * width) + ".";
    }

    public boolean equals(Rectangle other) {
        if (length == other.length && width == other.width) {
            return true;
        }

        return false;
    }

    public int calculateArea() {
        return length * width;
    }

    public int calculatePerimeter() {
        return (2 * length) + (2 * width);
    }

    public double calculateDiagonal() {
        return Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
    }

    // getters and setters

    public void setLength(int newLen) {
        length = newLen;
    }

    public void setWidth(int newWid) {
        width = newWid;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

}
