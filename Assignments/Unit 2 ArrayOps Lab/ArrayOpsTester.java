public class ArrayOpsTester {
    public static void main(String[] args) {

        // testing printStringArray()
        String[] stringArr1 = {"apple", "banana", "kiwi", "orange"};
        ArrayOps.printStringArray(stringArr1); // Output: [apple, banana, kiwi, orange]

        String[] stringArr2 = {"cat", "dog", "elephant", "lion"};
        ArrayOps.printStringArray(stringArr2); // Output: [cat, dog, elephant, lion]

        String[] stringArr3 = {"red", "green", "blue", "yellow"};
        ArrayOps.printStringArray(stringArr3); // Output: [red, green, blue, yellow]

        String[] stringArr4 = new String[4]; // null edge case
        ArrayOps.printStringArray(stringArr4); // Output: [null, null, null, null]

        // Testing if two arrays are equal
        String arrayString1 = ArrayOps.printStringArray(stringArr1);
        String arrayString2 = ArrayOps.printStringArray(stringArr2);
        System.out.println("Are the arrays the same? " + arrayString1.equals(arrayString2));

        // testing printIntegerArray()
        int[] intArr1 = {1, 2, 3, 4, 5};
        ArrayOps.printIntegerArray(intArr1); // Output: [1, 2, 3, 4, 5]

        int[] intArr2 = {10, 20, 30, 40, 50};
        ArrayOps.printIntegerArray(intArr2); // Output: [10, 20, 30, 40, 50]

        int[] intArr3 = {-1, -2, -3, -4, -5};
        ArrayOps.printIntegerArray(intArr3); // Output: [-1, -2, -3, -4, -5]

        int[] intArr4 = new int[5];
        ArrayOps.printIntegerArray(intArr4); // Output: [0, 0, 0, 0, 0]

        // testing findMax()
        int[] intArr5 = {5, 10, 3, 8, 2};
        System.out.println("Max: " + ArrayOps.findMax(intArr5)); // Output: Max: 10

        int[] intArr6 = {-1, -5, -3, -2, -8};
        System.out.println("Max: " + ArrayOps.findMax(intArr6)); // Output: Max: -1

        int[] intArr7 = {100, 200, 300, 400, 500};
        System.out.println("Max: " + ArrayOps.findMax(intArr7)); // Output: Max: 500

        int[] intArr8 = null;
        System.out.println("Max: " + ArrayOps.findMax(intArr8)); // Output: Max: NaN

        // testing findLongestString()
        System.out
                .println("Longest String in stringArr1: " + ArrayOps.findLongestString(stringArr1));
        // Output: banana

        System.out
                .println("Longest String in stringArr2: " + ArrayOps.findLongestString(stringArr2));
        // Output: elephant

        System.out
                .println("Longest String in stringArr3: " + ArrayOps.findLongestString(stringArr3));
        // Output: yellow

        System.out
                .println("Longest String in stringArr4: " + ArrayOps.findLongestString(stringArr4));
        // Output: an empty string (null edge case)

        // testing averageStringLength()
        System.out.println("Average String Length: " + ArrayOps.averageStringLength(stringArr1));
        // Output: Average String Length: 5.25

        System.out.println("Average String Length: " + ArrayOps.averageStringLength(stringArr2));
        // Output: Average String Length: 4.5

        System.out.println("Average String Length: " + ArrayOps.averageStringLength(stringArr3));
        // Output: Average String Length: 4.5

        System.out.println("Average String Length: " + ArrayOps.averageStringLength(stringArr4));
        // Output: Average String Length: 0 (null edge case)

        // testing countLetterFrequencies()
        String input1 = "Hello, World!";
        int[] frequencies1 = ArrayOps.countLetterFrequencies(input1);
        ArrayOps.printIntegerArray(frequencies1);
        // Letter: [A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W,
        // X, Y, Z]
        // Output: [0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 3, 0, 0, 2, 0, 0, 1, 0, 0, 0, 0, 1,
        // 0, 0, 0]

        String input2 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
        int[] frequencies2 = ArrayOps.countLetterFrequencies(input2);
        ArrayOps.printIntegerArray(frequencies2);
        // Letter: [A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W,
        // X, Y, Z]
        // Output: [2, 0, 3, 2, 5, 0, 1, 0, 6, 0, 0, 3, 3, 2, 4, 2, 0, 3, 4, 5, 2, 0, 0,
        // 0, 0, 0]

        String input3 = "The quick brown fox jumps over the lazy dog.";
        int[] frequencies3 = ArrayOps.countLetterFrequencies(input3);
        ArrayOps.printIntegerArray(frequencies3);
        // Output: [1, 1, 1, 1, 3, 1, 1, 2, 1, 1, 1, 1, 1, 1, 4, 1, 1, 2, 1, 2, 2, 1, 1,
        // 1, 1, 1]

        String input4 = ""; // blank string edge case
        int[] frequencies4 = ArrayOps.countLetterFrequencies(input4);
        ArrayOps.printIntegerArray(frequencies4);
        // Output: [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        String input5 = null; // null edge case
        int[] frequencies5 = ArrayOps.countLetterFrequencies(input5);
        ArrayOps.printIntegerArray(frequencies5);
        // Output: [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        // testing removeIntAndScoot()
        intArr1 = new int[] {1, 2, 3, 4, 5};
        int removedIndex1 = 2;
        int[] arr1Update = ArrayOps.removeIntAndScoot(intArr1, removedIndex1);
        ArrayOps.printIntegerArray(arr1Update);
        // Output: [1, 2, 4, 5, 0]

        intArr2 = new int[] {10, 20, 30, 40, 50, 60};
        int removedIndex2 = 4;
        int[] arr2Update = ArrayOps.removeIntAndScoot(intArr2, removedIndex2);
        ArrayOps.printIntegerArray(arr2Update);
        // Output: [10, 20, 30, 40, 60, 0]

        intArr3 = new int[] {100, 200, 300, 400};
        int removedIndex3 = 0;
        int[] arr3Update = ArrayOps.removeIntAndScoot(intArr3, removedIndex3);
        ArrayOps.printIntegerArray(arr3Update);
        // Output: [200, 300, 400, 0]

        intArr4 = null; // null edge case
        int removedIndex4 = 0;
        int[] arr4Update = ArrayOps.removeIntAndScoot(intArr4, removedIndex4);
        ArrayOps.printIntegerArray(arr4Update);
        // Output: [0, 0, 0, 0]

        // testing resizeIntArray()
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] resizedArr1 = ArrayOps.resizeIntArray(arr1);
        ArrayOps.printIntegerArray(resizedArr1);
        // Output: [1, 2, 3, 4, 5, 0, 0, 0, 0, 0]

        int[] arr2 = {10, 20, 30};
        int[] resizedArr2 = ArrayOps.resizeIntArray(arr2);
        ArrayOps.printIntegerArray(resizedArr2);
        // Output: [10, 20, 30, 0, 0, 0]

        int[] arr3 = {100};
        int[] resizedArr3 = ArrayOps.resizeIntArray(arr3);
        ArrayOps.printIntegerArray(resizedArr3);
        // Output: [100, 0]

        int[] arr4 = null; // null edge case
        int[] resizedArr4 = ArrayOps.resizeIntArray(arr4);
        ArrayOps.printIntegerArray(resizedArr4);
        // Output: []

        // testing addNumToStringArray()
        String[] arra1 = {"Hello", "my", "name", "is", "Larry"};
        String[] modifiedArr1 = ArrayOps.addNumToStringArray(arra1);
        ArrayOps.printStringArray(modifiedArr1);
        // Output: [#0 Hello, #1 my, #2 name, #3 is, #4 Larry]

        String[] arra2 = {"This", "is", "a", "test"};
        String[] modifiedArr2 = ArrayOps.addNumToStringArray(arra2);
        ArrayOps.printStringArray(modifiedArr2);
        // Output: [#0 This, #1 is, #2 a, #3 test]

        String[] arra3 = {"Java", "programming", "is", "fun"};
        String[] modifiedArr3 = ArrayOps.addNumToStringArray(arra3);
        ArrayOps.printStringArray(modifiedArr3);
        // Output: [#0 Java, #1 programming, #2 is, #3 fun]

        String[] arra4 = null; // null edge case
        String[] modifiedArr4 = ArrayOps.addNumToStringArray(arra4);
        ArrayOps.printStringArray(modifiedArr4);
        // Output: []

        String[] arra5 = {"This", "is", null, "test"}; // null element edge case
        String[] modifiedArr5 = ArrayOps.addNumToStringArray(arra5);
        ArrayOps.printStringArray(modifiedArr5);
        // Output: [#0 This, #1 is, null, #3 test]

        // testing reverseIntArray()
        int[] array1 = {1, 2, 3, 4, 5};
        int[] reversedArr1 = ArrayOps.reverseIntArray(array1);
        ArrayOps.printIntegerArray(reversedArr1);
        // Output: [5, 4, 3, 2, 1]

        int[] array2 = {10, 20, 30, 40};
        int[] reversedArr2 = ArrayOps.reverseIntArray(array2);
        ArrayOps.printIntegerArray(reversedArr2);
        // Output: [40, 30, 20, 10]

        int[] array3 = {-1, -2, -3, -4};
        int[] reversedArr3 = ArrayOps.reverseIntArray(array3);
        ArrayOps.printIntegerArray(reversedArr3);
        // Output: [-4, -3, -2, -1]

        int[] array4 = null; // null edge case
        int[] reversedArr4 = ArrayOps.reverseIntArray(array4);
        ArrayOps.printIntegerArray(reversedArr4);
        // Output: []
    }
}
