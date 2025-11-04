import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is your full government name?");

        // String governmentName = keyboard.next(); // grabs up to the space or new line
        String governmentName = keyboard.nextLine(); // grabs up to the new line

        System.out.println("Hello, " + governmentName + ". Nice to meet you!");

        int age = keyboard.nextInt(); // grabs next integer
        if (age >= 18) {
            System.out.println("Congratulations, you can vote!");
        } else {
            System.out.println("Come back again soon!");
        }

        System.out.println("(T/F) You will vote to make mangos mandatory for breakfast every day?");
        boolean lovesMangoes = keyboard.nextBoolean(); // grabs next instance of true or false
        while (lovesMangoes == false) {
            System.out.println(
                    "Again, you will vote to make mangos mandatory for breakfast every day? (T/F)");
            lovesMangoes = keyboard.nextBoolean();
        }
        System.out.println("Great! Thank you for supporting Big Mango!");
        keyboard.close();
    }
}
