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
        System.out.println(custom.equals(standard));

        // diagonal
        System.out.println(custom.calculateDiagonal());
        System.out.println(standard.calculateDiagonal());
    }
}
