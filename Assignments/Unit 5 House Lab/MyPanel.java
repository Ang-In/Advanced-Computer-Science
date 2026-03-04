import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

public class MyPanel extends JPanel {

    public MyPanel() {
        this.setPreferredSize(new Dimension(500, 500));
        this.setSize(500, 500);
    }

    public void paint(Graphics g) {
        // to-do: draw the house!

        // Adds shapes to an ArrayList, converting them all to Polygons
        ArrayList<Shape> shapes = new ArrayList<Shape>();

        // building
        shapes.add(new Rectangle(125, 125, 250, 250));
        shapes.get(0).setFillColor(Color.blue);

        // chimney
        shapes.add(new Rectangle(125, 70, 60, 60));
        shapes.get(1).setFillColor(Color.blue);

        // door
        shapes.add(new Rectangle(175, 250, 50, 125));
        shapes.get(2).setFillColor(Color.orange);

        // roof
        shapes.add(new Triangle(new int[] {125, 250, 375}, new int[] {125, 75, 125}));
        shapes.get(3).setFillColor(Color.red);

        // window
        shapes.add(new Square(280, 175, 50));
        shapes.get(4).setFillColor(Color.gray);

        // sun
        shapes.add(new Circle(30, 30, 50));
        shapes.get(5).setFillColor(Color.yellow);


        // Draws all the shapes in the ArrayList using that shape's draw method
        for (Shape p : shapes) {
            p.draw(g);
        }


    }


}
