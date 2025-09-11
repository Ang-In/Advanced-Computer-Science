public class RectangleTester {
    public static void main(String[] args) {
        Rectangle custom = new Rectangle(50, 10);
        Rectangle standard = new Rectangle();

        // toString
        System.out.println(custom.toString());
        System.out.println(standard.toString());

        // set
        custom.setLength(10);
        custom.setWidth(20);

        standard.setLength(10);
        standard.setWidth(30);

        System.out.println(custom.toString());
        System.out.println(standard.toString());

        // equals
        System.out.println(
                "Are the rectangles custom and standard equal? " + custom.equals(standard));

        // diagonal
        System.out.println("Diagonal of Rectangle Custom: " + custom.calculateDiagonal());
        System.out.println("Diagonal of Rectangle Standard: " + standard.calculateDiagonal());
    }
}
