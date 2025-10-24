public class Line {
    // instance variables
    private int a;
    private int b;
    private int c;
    private Point p1;
    private Point p2;

    // init methods
    public Line(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;

        // a = - (y2 - y1)
        this.a = -(p2.getY() - p1.getY());

        // b = x2 - x1
        this.b = p2.getX() - p1.getX();

        // c = - (a * x1 + b * y1)
        this.c = -(this.a * p1.getX() + p1.getY() * this.b);
    }

    // stretch challenge
    public Line() {
        int rand = randomNumGen();
        while (rand == 0) {
            rand = randomNumGen();
        }

        a = rand;

        rand = randomNumGen();
        while (rand == 0) {
            rand = randomNumGen();
        }

        b = rand;

        rand = randomNumGen();
        c = rand;

    }

    // getters

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    // setters

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    // methods

    public double calculateSlope() {
        return -((double) a / (double) b);
    }

    public double calculateSlopeFromPoints() {
        return (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
    }

    public String generatePointSlopeFormula() {
        String pointX = String.valueOf(p1.getX());
        String pointY = String.valueOf(p1.getY());
        return "(y - " + pointY + ") = " + calculateSlopeFromPoints() + "(x - " + pointX + ")";
    }

    public boolean isCoordinateOnLine(Point p) {
        return (a * p.getX() + b * p.getY() + c) == 0;
    }

    public String toString() {
        return a + "x + " + b + "y + " + c + " = 0";
    }

    private int randomNumGen() {
        return (int) (Math.random() * 9);
    }
}
