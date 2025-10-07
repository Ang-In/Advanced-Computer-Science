public class PawesomeUtils {
    public static char generateDogChar(int dogId) {
        int conversion = dogId;
        int onesDigit = conversion % 10;
        conversion /= 10;
        int tensDigit = conversion % 10;
        int hundredsDigit = conversion /= 10;

        return (char) ('F' + ((onesDigit + tensDigit + hundredsDigit) % 10));
    }

    public static String generateDogTag(int dogId, char dogChar) {
        return "" + dogId + dogChar;
    }

    public static int validateDogId(int dogId) {
        if (dogId >= 100 && dogId <= 999) {
            return dogId;
        } else {
            int first = (int) ((Math.random() * 8) + 1);
            int second = (int) ((Math.random() * 9));
            int third = (int) ((Math.random() * 9));
            return (first * 100) + (second * 10) + third;
        }
    }

    public static boolean validateDogTag(Dog dog) {
        int dogId = dog.getDogId();
        dogId = validateDogId(dogId);
        char dogChar = generateDogChar(dogId);
        String newDogTag = generateDogTag(dogId, dogChar);
        if (dog.getDogTag().equals(newDogTag)) {
            return true;
        } else {
            return false;
        }
    }

    public static String pickup(Dog dog, String personName) {
        if (dog.getOwnerName().equals(personName)) {
            dog.setStillInFacility(false);
            return dog.getName() + " has been picked up by their owner " + personName + ".";
        } else {
            return "For " + dog.getName() + "'s safety, they'll remain in our care until "
                    + dog.getOwnerName() + " comes to pick them up. Apologies, " + personName + ".";
        }
    }

    public static void checkIn(Dog dog, String personName) {
        dog.setStillInFacility(true);
        dog.setOwnerName(personName);
    }
}
