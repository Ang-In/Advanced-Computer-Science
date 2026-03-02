import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Circle extends Shape {
    // instance variables
    private int radius;

    // constructors
    public Circle(int xCoord, int yCoord, int radius) {
        super(xCoord, yCoord);
        this.radius = radius;
    }

    public Circle(int radius) {
        this(0, 0, radius);
    }

    // getters
    public int getRadius() {
        return radius;
    }

    // setters
    public void setRadius(int radius) {
        this.radius = radius;
    }

    // inherited methods
    public double getArea() {
        // to-do: add exception for when radius < 0
        return Math.PI * (radius ^ 2);
    }

    public void draw(Graphics g) {
        Graphics2D g2D = (Graphics2D) g; // initializes a 2D graphics component
        g2D.setPaint(Color.blue); // sets the paint color to blue
        g2D.fillOval(xCoord, yCoord, radius, radius); // draws a rectangle (filled in with blue)

        g2D.setPaint(Color.orange); // sets the paint color to yellow
        g2D.setStroke(new BasicStroke(5)); // changes the line stroke width to 5
        g2D.drawOval(xCoord, yCoord, radius, radius); // draws a circle outline
    }

    public String toString() {
        String circleDetails =
                "\nIt is a circle with a radius of " + radius + ". It's area is " + getArea() + ".";
        return super.toString() + circleDetails;
    }

}
