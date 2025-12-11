public class DecompositionSolution {
    public static void run() {
        int[] hours = hoursArray();
        int[] steps = stepsArray();
        int[] activeMinutes = activeMinutesArray();

        // Validator
        if (!lengthValidator(hours, steps, activeMinutes)) {
            System.out.println("Invalid input: arrays must be the same length.");
        }
    }

    public static int[] hoursArray() {
        return new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    }

    public static int[] stepsArray() {
        return new int[] {120, 90, 60, 50, 80, 300, 1200, 2200, 2800, 2500, 1800, 900};
    }

    public static int[] activeMinutesArray() {
        return new int[] {2, 1, 0, 0, 1, 10, 35, 50, 55, 48, 32, 15};
    }

    // methods have to have a single purpose

    public static boolean lengthValidator(int[] arr1, int[] arr2, int[] arr3) {
        return arr1.length == arr2.length && arr2.length == arr3.length;
    }

    public static int sum(int[] arr) {
        // to-do: null-proof this method
        int sumTotal = 0;
        for (int i = 0; i < arr.length; i++) {
            sumTotal += arr[i];
        }

        return sumTotal;
    }

    public static double average(int[] arr) {
        int sum = sum(arr);
        return sum / (double) arr.length;
    }

    public static int thresholdChecker(int[] arr, int threshold) {
        // to-do: null-proof this method
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= threshold) {
                count++;
            }
        }
        return count;
    }

    public static double[] averageDailyReport(int[] steps) {
        double avgMorning = average(subArray(steps, 0, 4));
        double avgMidday = average(subArray(steps, 4, 8));
        double avgAfternoon = average(subArray(steps, 8, 12));

        double[] dailyAverage = {avgMorning, avgMidday, avgAfternoon};
        return dailyAverage;
    }

    public static String printReport(int[] hours, int[] steps, int[] activeMinutes) {
        // Total Steps
        int totalSteps = sum(steps);

        // Average Steps
        double averageSteps = average(steps);

        // Total Active Minutes
        int totalActiveMinutes = sum(activeMinutes);
        double averageActiveMinutes = average(activeMinutes);
        int activeHalfHourCount = thresholdChecker(activeMinutes, 30);

        // Morning vs Midday vs Afternoon averages
        // Morning: 0-3, Midday: 4-7, Afternoon: 8-11
        double[] dailyAverage = averageDailyReport(steps);

        String report = "=== Daily Steps Report (Decomposed) ===";
        report += "Hours recorded: " + hours.length;
        report += "Total steps: " + totalSteps;
        report += "Average steps/hour: " + round2(averageSteps);

        return report;
    }


    // helper to round to 2 decimals without external libs
    private static double round2(double x) {
        return Math.round(x * 100.0) / 100.0;
    }

    // helper to make sub-arrays of a given array
    private static int[] subArray(int[] arr, int start, int end) {
        // start included, end not included index-wise
        int[] subArr = new int[end - start];
        for (int i = 0; i < subArr.length; i++) {
            subArr[i] = arr[start + i];
        }
        return subArr;
    }
}
