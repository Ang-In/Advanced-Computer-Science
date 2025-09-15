public class CastingDemo {
    public static void main(String[] args) {

        // implicit casting: storing a smaller data type in a larger one, happens automatically
        int smallNum = 100;
        long bigNum = smallNum; // int to long
        float decimalNum = bigNum; // long to decimal (100 -> 100.0)
        double largeDecimal = decimalNum; // float to double

        System.out.println(largeDecimal);

        // explicit casting: manually converting a datatype to a different data type, may incur data
        // loss
        double pi = 3.14159;
        int engineerPi = (int) pi; // truncation: losing all decimals
        System.out.println(engineerPi);

        pi = engineerPi;
        System.out.println(pi);

        long population = 2147483648L;
        int limitedPopulation = (int) population;
        System.out.println("Population: " + limitedPopulation); // integer overflow; modding

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        int letterA = 'a';
        System.out.println(letterA + 3);

        // there is no implicit or explicit casting between booleans and integers
        // casting object classes is different and a whole unit in itself
    }
}
