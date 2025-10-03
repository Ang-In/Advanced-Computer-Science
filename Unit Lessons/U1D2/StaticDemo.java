public class StaticDemo {
    public static void main(String[] args) {

        // if you have no constructor, i'll make a default for you and assign all instance variables
        // to their null state
        StaticDemo object = new StaticDemo();
        object.firstIfTest();

        // you can print on the consle without creating a System object
        System.out.println(StaticDemo.secondIfTest());

        // static methods are sometimes called helper methods
        // classes with solely static methods are called helper classes

        Math.random();

        System.out.println(Utils.generateRandomNumBetween(55, 101));
    }

    // this method belongs object to the class
    public void firstIfTest() {
        int x = 4;
        int y = 3;
        int z = 4;

        if (x < y) {
            System.out.println("x is less than y");
        }
        if (x == z) {
            System.out.println("x is equal to z");
        }
    }

    // belongs to the class, no object required
    public static String secondIfTest() {
        int x = 4;
        int y = 3;
        int z = 4;

        if (x < y) {
            return "x is less than y";
        }
        if (x == z) {
            return "x is equal to z";
        }

        return "hello there";
    }
}
