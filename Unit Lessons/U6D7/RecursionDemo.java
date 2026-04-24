public class RecursionDemo {
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }

    public static int factorial(int value) {
        if (value == 0) {
            return 1;
        }
        return value * factorial(value - 1);
    }

}
