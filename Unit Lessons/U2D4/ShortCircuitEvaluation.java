public class ShortCircuitEvaluation {
    public static void main(String[] args) {

        String[] names = {"Wish", "Cornelia", "Allieae", "Allium", "Jim", null, "Alan", "Eleanor"};

        // count how many students are in the list

        int count = 0;
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null && names[i].length() > 0) { // short circuit evaluation
                count++; // must check null first, then length, or else an error appears!
            }

            // if(!(names[i] == null || names[i].length <= 0)) does the same as the if above
            // NB: java reads the left case first, and if it's false, the whole thing's thrown out

            // short circuit evaluation:
            // T && T -> true
            // F && ?? -> false (skips second condition)

            // T || ?? -> true (skips second condition)
            // F || F -> false
        }

        System.out.println(count);

    }
}
