public class ForLoopDemo {
    public static void main(String[] args) {
        // tedious, not good
        /*
         * System.out.println(1); System.out.println(2); System.out.println(3);
         * System.out.println(4); System.out.println(5); System.out.println(6);
         * System.out.println(7); System.out.println(8); System.out.println(9);
         * System.out.println(10);
         */

        // a logic condition allowing you to repeat code
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        // for loop anatomy
        // 1. initialize the count
        // 2. boolean condition to determine when to stop/continue
        // 3. iterator -> update count for the next loop
        // 4. do statements 

        // infinte loops happen when the iterator will never reach the end condition
        // it's very rare for for loops!
        for (int i = 1; i < 10; i/=3) {
            System.out.println(i);
        }
    }
}
