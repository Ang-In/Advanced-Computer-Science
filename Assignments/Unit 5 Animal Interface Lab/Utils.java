public class Utils {
    // inclusive of start number, exclusive of end number
    public static int generateRandomInt(int start, int end) {
        return (int) ((Math.random() * (end - start)) + start);
    }
}
