public class SquidTester {
    public static void main(String[] args) {
        Squid larry = new Squid();

        System.out.println(larry.getTentacleCount());
        System.out.println(larry.toString());

        String s1 = "hello";
        String s2 = "h";
        String s3 = s2 + "ello";

        System.out.println(s1 == s3);

        // == compares the "id", or the "reference address, == does not compare content"
        // to compare non-primitive content use equals()

        System.out.println(s1.equals(s3));

        // Math Functions
        System.out.println(Math.sqrt(9)); // returns a double
        System.out.println(Math.max(5, 9)); // returns max val of inputs
        System.out.println(Math.min(5, 9)); // returns min val of inputs
        System.out.println(Math.abs(-9)); // returns abs val, int or double

        // Math.sin(0); Math.cos(0); Math.tan(0) (Those three in Radians);
        // Math.PI approx. 3.14159

        Math.toRadians(180); // returns radians from degree input

    }

}
