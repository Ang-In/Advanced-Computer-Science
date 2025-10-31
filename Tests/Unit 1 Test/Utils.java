public class Utils {
    public static int generateRandomNumber(int low, int high) {
        if (low > high) {
            int temp = high;
            high = low;
            low = temp;
        }

        return (int) ((Math.random() * (high - low)) + low);
    }
}
