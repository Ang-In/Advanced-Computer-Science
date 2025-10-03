public class Utils {
    public static int generateRandomNumBetween(int low, int high) {
        return (int) (Math.random() * (high - low)) + low;
    }
}
