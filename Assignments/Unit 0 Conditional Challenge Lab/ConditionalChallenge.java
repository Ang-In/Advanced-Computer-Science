public class ConditionalChallenge {
    public static void main(String[] args) {
        // Your code will go here

        // Part 1: Temperature Converter
        System.out.println("--- Part 1: Temperature Converter ---");
        double temp = 10;
        boolean isCold = false;
        if (isCold) {
            temp -= 15;
            System.out.printf("It is cold! The temperature is %.2f./n", temp);
        } else {
            temp += 10;
            System.out.printf("It's not so cold! The temperature is %.2f./n", temp);
        }


        // Part 2: Grade Calculator
        System.out.println("--- Part 2: Grade Calculator ---");
        int score = 70;
        if (score >= 70) {
            System.out.println("Passed");
            System.out.println("You got a " + score + ". You Passed!");
        } else {
            System.out.println("You got a " + score + ". You Failed.");
        }

        // Part 3: Season Determiner
        System.out.println("--- Part 3: Season Determiner ---");
        int temperature = 50;

        if (temperature >= 80) {
            // System.out.printf("It's Summer! It's also %.2f degrees outside./n", temperature);
            System.out.println("It's Summer! It's also " + temperature + " degrees outside.");
        } else if (temperature >= 60 && temperature < 80) {
            // System.out.printf("It's Spring! It's also %.2f degrees outside./n", temperature);
            System.out.println("It's Spring! It's also " + temperature + " degrees outside.");
        } else if (temperature >= 40 && temperature < 60) {
            // System.out.printf("It's Autumn! It's also %.2f degrees outside./n", temperature);
            System.out.println("It's Autumn! It's also " + temperature + " degrees outside.");
        } else {
            // System.out.printf("It's Winter! It's also %.2f degrees outside./n", temperature);
            System.out.println("It's Winter! It's also " + temperature + " degrees outside.");
        }

        // Part 4: Number Classifier
        System.out.println("--- Part 4: Number Classifier ---");
        int number = 0;
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        if (number > 100) {
            System.out.println("Large");
        } else if (number < -100) {
            System.out.println("Very Negative");
        }
    }
}
