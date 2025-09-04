// Solution: Unit 0 Exercises
public class Unit0Exercises {

    public static void main(String[] args) {
        Unit0Exercises obj = new Unit0Exercises();
        System.out.println();

        // testing sleepIn() method
        System.out.println(obj.sleepIn(false, false)); // output: true
        System.out.println(obj.sleepIn(true, false)); // -> false
        System.out.println(obj.sleepIn(false, true)); // -> true

        // testing diff21() method
        System.out.println(obj.diff21(19)); // output: 2
        System.out.println(obj.diff21(10)); // -> 11
        System.out.println(obj.diff21(21)); // -> 0

        // testing flooringCalculator() method
        System.out.println(obj.flooringCalculator(500, 2.5)); // output: 1250.0
        System.out.println(obj.flooringCalculator(0, 3.0)); // -> 0.0
        System.out.println(obj.flooringCalculator(100, -1.5)); // -> 0.0

    }

    public boolean sleepIn(boolean weekday, boolean vacation) {

        // if-elif solution
        /*
         * if (vacation) { return true; } else if (!weekday) { return true; }
         */

        // one-if solution
        if (vacation || !weekday) {
            return true;
        }

        return false;
    }

    public int diff21(int n) {
        int sol;

        // if case by case solution
        /*
         * if (n > 21) { sol = 2 * (n - 21); } else if (n > 0 & n <= 21) { sol = 21 - n; } else if
         * (n <= 0 && n > -21) { n = -n; sol = 21 - n; } else { n = -n; sol = n - 21; }
         */

        // Math.abs solution
        if (n > 21) {
            sol = 2 * Math.abs(n - 21);
        } else {
            sol = Math.abs(n - 21);
        }

        return sol;
    }

    public double flooringCalculator(int sqft, double pricePerSqft) {

        if (sqft > 0 && pricePerSqft > 0) {
            return sqft * pricePerSqft;
        }

        return 0.0;
    }

}
