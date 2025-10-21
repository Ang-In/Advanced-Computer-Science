public class TriangleLoopsTester {
    public static void main(String[] args) {
        // to-do: create a separate tester class
        // to-do: invoke each method at least 2 times in the tester class

        // test createLetterTriangleUp():
        System.out.println(TriangleLoops.createLetterTriangleUp(3, 'A'));
        System.out.println(TriangleLoops.createLetterTriangleUp(15, 'B'));
        System.out.println(TriangleLoops.createLetterTriangleUp(-5, 'B')); // edge case

        // test createLetterTriangleDown():
        System.out.println(TriangleLoops.createLetterTriangleDown(3, 'A'));
        System.out.println(TriangleLoops.createLetterTriangleDown(15, 'B'));
        System.out.println(TriangleLoops.createLetterTriangleDown(-5, 'B')); // edge case

        // test createNumbersTriangle():
        System.out.println(TriangleLoops.createNumbersTriangle(3));
        System.out.println(TriangleLoops.createNumbersTriangle(15));
        System.out.println(TriangleLoops.createNumbersTriangle(-5)); // edge case

        // test createAlphabetTriangle():
        System.out.println(TriangleLoops.createAlphabetTriangle(3));
        System.out.println(TriangleLoops.createAlphabetTriangle(15));
        System.out.println(TriangleLoops.createAlphabetTriangle(-5)); // edge case
        System.out.println(TriangleLoops.createAlphabetTriangle(28)); // edge case 2

    }
}
