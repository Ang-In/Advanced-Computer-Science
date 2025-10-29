public class PurrfectUtils {
    public static String determineCatMood(Cat cat) {
        if (cat.getMoodLevel() > 7 && cat.getMoodLevel() <= 10) {
            return "Currently, " + cat.getName() + " is in a great mood.\nPetting is appreciated.";
        } else if (cat.getMoodLevel() > 3 && cat.getMoodLevel() <= 7) {
            return "Currently, " + cat.getName()
                    + " is reminiscing of a past life.\nPetting is acceptable.";
        } else {
            return "Currently, " + cat.getName()
                    + " is plotting revengance.\nPetting is extremely risky.";
        }
    }

    public static int generateRandomNumber(int low, int high) {
        if (low > high) {
            int temp = high;
            high = low;
            low = temp;
        }

        return (int) ((Math.random() * (high - low)) + low);
    }

    public static char generateCatChar(String catId) {
        int sum = 0;
        for (int i = 0; i < catId.length(); i++) {
            String digit = "" + catId.charAt(i);
            sum += Integer.parseInt(digit);
        }
        return (char) ((sum % 26) + ((int) 'A'));
    }

    public static int validateMoodLevel(int moodLevel) {
        if (moodLevel < 0) {
            return 0;
        } else if (moodLevel > 10) {
            return 10;
        } else {
            return moodLevel;
        }
    }

    public static String validateCatId(String catId) {
        if (Integer.parseInt(catId) >= 1000 && Integer.parseInt(catId) <= 9999) {
            return catId;
        } else {
            return "" + generateRandomNumber(1, 10) + generateRandomNumber(0, 10)
                    + generateRandomNumber(0, 10) + generateRandomNumber(0, 10);
        }
    }

    public static void bootUp(Cat cat) {
        System.out.println(cat.toString());
    }

    public static void pet(Cat cat) {
        if (cat.getMoodLevel() >= 2 || (cat.getMoodLevel() < 2 && cat.isHungry() == false)) {
            cat.setMoodLevel(validateMoodLevel(cat.getMoodLevel() + 1));
            System.out.println("Petting successful!");
        } else {
            cat.setMoodLevel(validateMoodLevel(cat.getMoodLevel() - 1));
            System.out.println("Petting failed...");
        }
    }

    public static void trimClaws(Cat cat) {
        System.out.println("Attempting to trim claws...");
        int moodDecrease = generateRandomNumber(1, 3);
        cat.setMoodLevel(validateMoodLevel(cat.getMoodLevel() - moodDecrease));
        if (moodDecrease == 1) {
            System.out.println(cat.getName() + " did not like that...");
        } else if (moodDecrease == 2) {
            System.out.println(cat.getName() + " really hated that!");
        }
    }

    public static void cleanLitterBox(Cat cat) {
        cat.setMoodLevel(validateMoodLevel(cat.getMoodLevel() + 1));
        cat.setHungry(true);

        String cleaning = "Cleaning the litter box...\nDone!\n";
        String happy = cat.getName() + " appreciated that.";
        System.out.println(cleaning + happy);
    }

    public static void feed(Cat cat) {
        cat.setMoodLevel(validateMoodLevel(cat.getMoodLevel() + 2));
        cat.setHungry(false);

        String fillingBowl = "Filling up " + cat.getName() + "\'s bowl...\nDone!\n";
        String eating = cat.getName() + " is eating...\n" + cat.getName() + " is full!";
        System.out.println(fillingBowl + eating);
    }
}
