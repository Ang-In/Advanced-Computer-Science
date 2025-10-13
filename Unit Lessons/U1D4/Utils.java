public class Utils {
    public static void main(String[] args) {
        // a class that contains a list of characters to form words
        // it gives strings methods we can use!
        String x = "hello";
        String.valueOf("123"); // converts an integer String to int
        // it's the same as Integer.parseInt();

        // Integer Wrapper
        int y = 10; // primitive, does NOT have any methods
        Integer yWrapper = 10; // the value 10 has methods now!

        yWrapper.toString(); // converts yWrapper to a string
        Integer.parseInt("123"); // converts strings to integers!

        // Boolean Wrapper
        boolean isFalse = false; // primitive boolean
        Boolean isTrue = true; // wrapper boolean; class

        isTrue.toString();
        Boolean.parseBoolean("hello"); // converts "true" to true and anything else to "false"

        // Double Wrapper
        double decimal = 1.1; // primitive double
        Double decimalWrapper = 1.1; // wrapper double; has methods

        System.out.println(Double.parseDouble("13.76")); // converts string to double
    }

}
