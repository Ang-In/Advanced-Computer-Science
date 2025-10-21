public class Loops {
    public static void main(String[] args) {
        int count = 0;

        // loop 1
        while (count < 10) {
            System.out.println(count);
            count++;
        }

        // loop 2
        boolean isRunning = true;
        while (isRunning) {
            count++;
            if (count == 100) {
                isRunning = false;
            }
        }

        // loop 3
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // for loops are best when you know the exact number of repetitions
        // for loop syntax is compact

        // while loops are best when you DON'T know the exact num of repetitions
        // while loop needs the iterator to be initialized outside the loop and updated in the loop

        // loop 4: do-while loop
        do {
            System.out.println("do this first");
            System.out.println("then check the condition");
        } while (isRunning);
        // a do-while loop runs the code once before checking the condition
        // a while loop checks first, then does the code if valid

        // loop 5: nested for loops
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("All work and no play makes Jack a dull boy.");
            }
        }
        // bad for time complexity: increases by a power
        // try to only have 2 loops nested in each other
    }

}
