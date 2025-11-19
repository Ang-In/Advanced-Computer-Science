public class CourseTester {
    public static void main(String[] args) {
        // testing StudentRecord() and Course() (constructors)
        int[] nellieScores = {50, 60, 70, 85, 99};
        int[] wishScores = {90, 92, 89, 95};
        StudentRecord improved = new StudentRecord("Nellie", nellieScores);
        StudentRecord notImproved = new StudentRecord("Wish", wishScores);
        StudentRecord blank = new StudentRecord(null, null); // edge case for future tests

        StudentRecord[] studentList = {improved, notImproved, blank};
        Course precalc = new Course("Precalculus", studentList);
        Course empty = new Course(null, null); // edge case for future tests

        // Testing toString() (both classes)
        System.out.println("StudentRecord toString() functioning: "
                + improved.toString().equals("Nellie's scores: [50, 60, 70, 85, 99]"));
        // Output: true

        System.out.println(precalc.toString());
        System.out.println("Course toString() functioning: " + precalc.toString().equals(
                "== Precalculus ==\n1.) Nellie's scores: [50, 60, 70, 85, 99]\n2.) Wish's scores: [90, 92, 89, 95]\n3.) null's scores: null"));
        // Output: true

        // testing getAverage()
        double nellieAvg = improved.getAverage(0, 2);
        System.out.println(
                "StudentRecord getAverage() functioning: " + ((nellieAvg == 60) ? true : false));
        // Output: true
        // Math: 50 + 60 + 70 = 120, 120/3 = 60

        // testing getTestScore()
        System.out.println("StudentRecord getTestScore() functioning: " + );
    }
}
