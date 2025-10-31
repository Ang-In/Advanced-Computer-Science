public class AutoUtils {

    public static String fixName(String name) {
        String trimmedName = name.trim();
        String firstName = trimmedName.substring(0, trimmedName.indexOf(" "));
        String lastName = trimmedName.substring(trimmedName.indexOf(" ")).trim();
        return firstName + " " + lastName;
    }

    public static String generateUsername(String name) {
        String firstName = name.substring(0, name.indexOf(" ")).toLowerCase();
        String lastName = name.substring(name.indexOf(" ")).trim().toLowerCase();
        int randNum = Utils.generateRandomNumber(1950, 2050);
        return "@" + firstName + "_" + lastName + "_" + randNum;
    }

    public static int validateCleanlinessLevel(int cleanlinessLevel) {
        if (cleanlinessLevel < 0) {
            cleanlinessLevel = 0;
        }
        if (cleanlinessLevel > 10) {
            cleanlinessLevel = 10;
        }
        return cleanlinessLevel;
    }

    public static void cleanCar(Car car) {
        car.setCleanlinessLevel(car.getCleanlinessLevel() + 2);
    }
}
