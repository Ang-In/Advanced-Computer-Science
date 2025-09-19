public class Line {
    // instance variables
    int a;
    int b;
    int c;

    // init method
    public Line(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
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

    // methods

    public double calculateSlope() {
        return -((double) a / (double) b);
    }

    public boolean isCoordinateOnLine(int x, int y) {
        return (a * x + b * y + c) == 0;
    }

    public String toString() {
        return a + "x + " + b + "y + " + c + " = 0";
    }

    private int randomNumGen() {
        return (int) (Math.random() * 9);
    }
}
