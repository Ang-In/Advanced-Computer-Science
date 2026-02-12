import java.util.ArrayList;
import java.util.Arrays;

public class AnswerSheetTester {
    public static void main(String[] args) {
        System.out.println("== Testing StudentAnswerSheet Class ==\n");
        testStudentAnswerSheetClass();
        System.out.println();

        System.out.println("== Testing TestResults Class ==\n");
        testTestResultsClass();
        System.out.println();
    }

    private static void testStudentAnswerSheetClass() {
        testStudentAnswerSheet();
        System.out.println();
        testStudentAnswerSheetGettersAndSetters();
        System.out.println();
        testStudentAnswerSheetEquals();
        System.out.println();
        testStudentAnswerSheetToString();
        System.out.println();
        testGetGrade();
    }

    private static void testTestResultsClass() {
        testTestResults();
        System.out.println();
        testTestResultsGettersAndSetters();
        System.out.println();
        testTestResultsEquals();
        System.out.println();
        testTestResultsToString();
        System.out.println();
        testSubmit();
        System.out.println();
        testGradeTests();
        System.out.println();
        testHighestScoringStudent();
    }

    private static void testTestResults() {
        System.out.println("Testing TestResults()");
        ArrayList<String> testKey = new ArrayList<String>(
                Arrays.asList("A", "C", "D", "E", "B", "C", "E", "B", "B", "C"));
        ArrayList<StudentAnswerSheet> testSubmissions = new ArrayList<StudentAnswerSheet>();

        // Edge Case - key is null
        try {
            testKey = null;
            TestResults testResults = new TestResults(testKey, testSubmissions);
            System.out.println("Expected Exception!");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The constructor threw an exception when the key was null, as expected");
        }

        // Edge Case - testAnswers is null
        try {
            testKey = new ArrayList<String>(
                    Arrays.asList("A", "C", "D", "E", "B", "C", "E", "B", "B", "C"));
            testSubmissions = null;
            TestResults testResults = new TestResults(testKey, testSubmissions);
            System.out.println("Expected Exception!");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The constructor threw an exception when the submissions were null, as expected");
        }

        // Main Case - all values are correct
        testSubmissions = new ArrayList<StudentAnswerSheet>();
        TestResults testResults = new TestResults(testKey, testSubmissions);
        System.out.println(testResults);
        System.out.println("A new TestResults instance was made, as expected");
    }

    private static void testTestResultsGettersAndSetters() {
        System.out.println("Testing TestResults Getters & Setters");
        ArrayList<String> testKey = new ArrayList<String>(
                Arrays.asList("A", "C", "D", "E", "B", "C", "E", "B", "B", "C"));
        ArrayList<StudentAnswerSheet> testSubmissions = new ArrayList<StudentAnswerSheet>();
        TestResults testResults = new TestResults(testKey, testSubmissions);

        // Edge Case - set key to null
        try {
            testKey = null;
            testResults.setAnswerKey(testKey);
            System.out.println("Expected Exception!");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The setter threw an exception when the given key was null, as expected");
        }

        // Edge Case - set submissions to null
        try {
            testSubmissions = null;
            testResults.setSubmissions(testSubmissions);
            System.out.println("Expected Exception!");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The setter threw an exception when the given submissions were null, as expected");
        }

        // Main Case - all values are correct
        // Getters
        System.out.println(testResults.getAnswerKey()); // should be ["A", "C", "D", "E", "B", "C",
                                                        // "E", "B", "B", "C"]
        System.out.println(testResults.getSubmissions()); // should be empty
        if (!(testResults.getAnswerKey().equals(
                "[\"A\", \"C\", \"D\", \"E\", \"B\", \"C\", \"E\", \"B\", \"B\", \"C\"]"))) {
            System.out.println(
                    "Expected [\"A\", \"C\", \"D\", \"E\", \"B\", \"C\", \"E\", \"B\", \"B\", \"C\"]!");
        } else if (!(testResults.getSubmissions().isEmpty())) {
            System.out.println("Expected empty for submissions!");
        } else {
            System.out.println("The getters retrieved their respective values, as expected");
        }

        // Setters
        testKey = new ArrayList<String>(
                Arrays.asList("E", "D", "C", "B", "A", "E", "D", "C", "B", "A"));
        testSubmissions = new ArrayList<StudentAnswerSheet>();
        testSubmissions.add(createTestSheet());

        testResults.setAnswerKey(testKey);
        System.out.println(testResults.getAnswerKey()); // should be ["E", "D", "C", "B", "A", "E",
                                                        // "D", "C", "B", "A"]
        testResults.setSubmissions(testSubmissions);
        System.out.println(testResults.getSubmissions()); // should be [testSheet info]

        System.out.println("The setters changed their respective values, as expected");
    }

    private static void testTestResultsEquals() {
        System.out.println("Testing equals()");
        ArrayList<String> testKey = new ArrayList<String>(
                Arrays.asList("A", "C", "D", "E", "B", "C", "E", "B", "B", "C"));
        ArrayList<StudentAnswerSheet> testSubmissions = new ArrayList<StudentAnswerSheet>();
        TestResults testResults = new TestResults(testKey, testSubmissions);
        TestResults dupeTestResults = new TestResults(testKey, testSubmissions);

        ArrayList<String> diffTestKey = new ArrayList<String>(
                Arrays.asList("E", "D", "C", "B", "A", "E", "D", "C", "B", "A"));
        ArrayList<StudentAnswerSheet> diffTestSubmissions = new ArrayList<StudentAnswerSheet>();
        diffTestSubmissions.add(createTestSheet());
        TestResults diffResults = new TestResults(diffTestKey, diffTestSubmissions);

        // Edge Case - other results are null
        testResults.equals(null); // should be "false"
        if (testResults.equals(null)) {
            System.out.println("Expected false!");
        } else {
            System.out
                    .println("The method returned false when the other test was null, as expected");
        }

        // Main Case - results ARE equal
        System.out.println(testResults.equals(dupeTestResults)); // should be "true"
        if (testResults.equals(dupeTestResults)) {
            System.out.println("The two tests were equal, as expected");
        } else {
            System.out.println("Expected true!");
        }

        // Main Case - results are NOT equal
        System.out.println(testResults.equals(diffResults)); // should be "false"
        if (testResults.equals(diffResults)) {
            System.out.println("Expected false!");
        } else {
            System.out.println("The two tests were NOT equal, as expected");
        }
    }

    private static void testTestResultsToString() {
        System.out.println("Testing toString()");
        ArrayList<String> testKey = new ArrayList<String>(
                Arrays.asList("A", "C", "D", "E", "B", "C", "E", "B", "B", "C"));
        ArrayList<StudentAnswerSheet> testSubmissions = new ArrayList<StudentAnswerSheet>();
        testSubmissions.add(createTestSheet());
        TestResults testResults = new TestResults(testKey, testSubmissions);

        // Main Case - prints in correct format
        System.out.println(testResults.toString());
        // Should be "Answer Key: [A, C, D, E, B, C, E, B, B, C]\n"
        // + "1. Alice's test answers: [A B D E A C ? B D C] (Total Grade: 0.0)"
        if (testResults.toString().equals("Answer Key: [A, C, D, E, B, C, E, B, B, C]\n"
                + "1. Alice's test answers: [A B D E A C ? B D C] (Total Grade: 0.0)")) {
            System.out.println(
                    "The toString method printed the StudentAnswerSheet in the correct format, as expected");
        } else {
            System.out.println("Expected \"\"Answer Key: [A, C, D, E, B, C, E, B, B, C]\n"
                    + "1. Alice's test answers: [A B D E A C ? B D C] (Total Grade: 0.0)\"!");
        }
    }

    private static void testSubmit() {
        System.out.println("Testing submit()");
        ArrayList<String> testKey = new ArrayList<String>(
                Arrays.asList("A", "C", "D", "E", "B", "C", "E", "B", "B", "C"));
        ArrayList<StudentAnswerSheet> testSubmissions = new ArrayList<StudentAnswerSheet>();
        TestResults testResults = new TestResults(testKey, testSubmissions);

        // Edge Case - submitting null
        try {
            testResults.submit(null);
            System.out.println("Expected exception!");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exception when submitting a null test, as expected");
        }

        // Main Case - submitting a valid test
        StudentAnswerSheet testSheet = createTestSheet();
        testResults.submit(testSheet);
        System.out.println(testResults.getSubmissions()); // should include testSheet
        if (testResults.getSubmissions().size() == 0) {
            System.out.println("Failed to submit the test!");
        } else {
            System.out.println("The method submitted the test as expected");
        }
    }

    private static void testGradeTests() {
        System.out.println("Testing gradeTests()");
        ArrayList<String> testKey = new ArrayList<String>(
                Arrays.asList("A", "C", "D", "E", "B", "C", "E", "B", "B", "C"));
        ArrayList<StudentAnswerSheet> testSubmissions = new ArrayList<StudentAnswerSheet>();
        TestResults testResults = new TestResults(testKey, testSubmissions);
        testResults.submit(createTestSheet());

        // Edge Case - key length not equal to test results length
        try {
            testKey = new ArrayList<String>();
            testResults.setAnswerKey(testKey);
            testResults.gradeTests();
            System.out.println("Expected exception!");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exception when the key and answer lengths differed, as expected");
        }

        // Main Case - All requirements valid
        testKey = new ArrayList<String>(
                Arrays.asList("A", "C", "D", "E", "B", "C", "E", "B", "B", "C"));
        testResults.setAnswerKey(testKey);
        testResults.gradeTests();
        System.out.println(testResults.getSubmissions()); // should include 5.25 in grade
        if (testResults.getSubmissions().get(0).getTestScore() == 5.25) {
            System.out
                    .println("The method graded the submissions with the answer key, as expected");
        } else {
            System.out.println("Failed to grade submissions properly!");
        }
    }

    private static void testHighestScoringStudent() {
        System.out.println("Testing highestScoringStudent()");
        ArrayList<String> testKey = new ArrayList<String>(
                Arrays.asList("A", "C", "D", "E", "B", "C", "E", "B", "B", "C"));
        ArrayList<StudentAnswerSheet> testSubmissions = new ArrayList<StudentAnswerSheet>();
        TestResults testResults = new TestResults(testKey, testSubmissions);

        // Edge Case - Empty Submissions/No Submissions
        System.out.println(testResults.highestScoringStudent()); // should be an empty string
        if (testResults.highestScoringStudent().equals("")) {
            System.out.println(
                    "The method returned an empty string when submissions were empty, as expected");
        } else {
            System.out.println("Failed to return empty string with empty submissions!");
        }

        // Main Case - All requirements valid
        StudentAnswerSheet testStudent1 = createTestSheet();
        testResults.submit(testStudent1);
        StudentAnswerSheet testStudent2 = createTestSheet();
        testStudent2.setName("Bob");
        testResults.submit(testStudent2);

        System.out.println(testResults.highestScoringStudent()); // should be "Alice"
        if (testResults.highestScoringStudent().equals("Alice")) {
            System.out.println("The method found the highest scoring student, as expected");
        } else {
            System.out.println("Failed to find the highest scoring student!");
        }
    }

    private static void testStudentAnswerSheet() {
        System.out.println("Testing StudentAnswerSheet()");
        String testName = "Alice";
        ArrayList<String> testAnswers = new ArrayList<String>(
                Arrays.asList("A", "B", "D", "E", "A", "C", "?", "B", "D", "C"));

        // Edge Case - name is null
        try {
            testName = null;
            StudentAnswerSheet testSheet = new StudentAnswerSheet(testName, testAnswers);
            System.out.println("Expected Exception!");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The constructor threw an exception when the name was null, as expected");
        }

        // Edge Case - testAnswers is null
        try {
            testName = "Alice";
            testAnswers = null;
            StudentAnswerSheet testSheet = new StudentAnswerSheet(testName, testAnswers);
            System.out.println("Expected Exception!");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The constructor threw an exception when the answers were null, as expected");
        }

        // Main Case - all values are correct
        testAnswers = new ArrayList<String>(
                Arrays.asList("A", "B", "D", "E", "A", "C", "?", "B", "D", "C"));
        StudentAnswerSheet testSheet = new StudentAnswerSheet(testName, testAnswers);
        System.out.println(testSheet);
        System.out.println("A new StudentAnswerSheet was made, as expected");
    }

    private static void testStudentAnswerSheetGettersAndSetters() {
        System.out.println("Testing StudentAnswerSheet Getters & Setters");
        String testName = "Alice";
        ArrayList<String> testAnswers = new ArrayList<String>(
                Arrays.asList("A", "B", "D", "E", "A", "C", "?", "B", "D", "C"));
        StudentAnswerSheet testSheet = new StudentAnswerSheet(testName, testAnswers);

        // Edge Case - set name to null
        try {
            testName = null;
            testSheet.setName(testName);
            System.out.println("Expected Exception!");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The setter threw an exception when the given name waas null, as expected");
        }

        // Edge Case - set answers to null
        try {
            testAnswers = null;
            testSheet.setAnswers(testAnswers);
            System.out.println("Expected Exception!");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The setter threw an exception when the given answer sheet was null, as expected");
        }

        // Main Case - all values are correct
        // Getters
        System.out.println(testSheet.getName()); // should be "Alice"
        System.out.println(testSheet.getTestScore()); // should be 0.0
        System.out.println(testSheet.getAnswers());
        // should be ["A", "B", "D", "E", "A", "C", "?", "B", "D", "C"]
        if (!(testSheet.getName().equals("Alice"))) {
            System.out.println("Expected Alice for name!");
        } else if (testSheet.getTestScore() != 0.0) {
            System.out.println("Expected 0.0 for testScore!");
        } else if (!(testSheet.getAnswers().equals(
                "[\"A\", \"B\", \"D\", \"E\", \"A\", \"C\", \"?\", \"B\", \"D\", \"C\"]"))) {
            System.out.println(
                    "Expected [\"A\", \"B\", \"D\", \"E\", \"A\", \"C\", \"?\", \"B\", \"D\", \"C\"]!");
        } else {
            System.out.println("The getters retrieved their respective values, as expected");
        }

        // Setters
        double testScore = 5.0;
        testName = "Bob";
        testAnswers = new ArrayList<String>(
                Arrays.asList("A", "B", "C", "D", "E", "A", "B", "C", "D", "E"));

        testSheet.setName(testName);
        System.out.println(testSheet.getName()); // should be "Bob"
        testSheet.setTestScore(testScore);
        System.out.println(testSheet.getTestScore()); // should be 5.0
        testSheet.setAnswers(testAnswers);
        System.out.println(testSheet.getAnswers());
        // should be ["A", "B", "C", "D", "E", "A", "B", "C", "D", "E"]
        System.out.println("The setters changed their respective values, as expected");
    }

    private static void testStudentAnswerSheetEquals() {
        System.out.println("Testing equals()");
        String testName = "Alice";
        ArrayList<String> testAnswers = new ArrayList<String>(
                Arrays.asList("A", "B", "D", "E", "A", "C", "?", "B", "D", "C"));
        StudentAnswerSheet testSheet = new StudentAnswerSheet(testName, testAnswers);
        StudentAnswerSheet dupeTestSheet = new StudentAnswerSheet(testName, testAnswers);
        StudentAnswerSheet diffSheet = new StudentAnswerSheet("Bob", testAnswers);

        // Edge Case - other test is null
        testSheet.equals(null); // should be "false"
        if (testSheet.equals(null)) {
            System.out.println("Expected false!");
        } else {
            System.out
                    .println("The method returned false when the other test was null, as expected");
        }

        // Main Case - answer sheets ARE equal
        System.out.println(testSheet.equals(dupeTestSheet)); // should be "true"
        if (testSheet.equals(dupeTestSheet)) {
            System.out.println("The two tests were equal, as expected");
        } else {
            System.out.println("Expected true!");
        }

        // Main Case - answer sheets are NOT equal
        System.out.println(testSheet.equals(diffSheet)); // should be "false"
        if (testSheet.equals(diffSheet)) {
            System.out.println("Expected false!");
        } else {
            System.out.println("The two tests were NOT equal, as expected");
        }
    }

    private static void testStudentAnswerSheetToString() {
        System.out.println("Testing toString()");
        String testName = "Alice";
        ArrayList<String> testAnswers = new ArrayList<String>(
                Arrays.asList("A", "B", "D", "E", "A", "C", "?", "B", "D", "C"));
        StudentAnswerSheet testSheet = new StudentAnswerSheet(testName, testAnswers);

        // Main Case - prints in correct format
        System.out.println(testSheet.toString());
        // Should be "Alice's test answers: [A B D E A C ? B D C] (Total Grade: 0.0)"
        if (testSheet.toString()
                .equals("Alice's test answers: [A B D E A C ? B D C] (Total Grade: 0.0)")) {
            System.out.println(
                    "The toString method printed the StudentAnswerSheet in the correct format, as expected");
        } else {
            System.out.println("Expected \"Alice's test answers: [A B D E A C ? B D C]\"!");
        }
    }

    private static void testGetGrade() {
        System.out.println("Testing getGrade()");
        String testName = "Alice";
        ArrayList<String> testAnswers = new ArrayList<String>(
                Arrays.asList("A", "B", "D", "E", "A", "C", "?", "B", "D", "C"));
        StudentAnswerSheet testSheet = new StudentAnswerSheet(testName, testAnswers);
        ArrayList<String> testKey = new ArrayList<String>(
                Arrays.asList("A", "C", "D", "E", "B", "C", "E", "B", "B", "C"));

        // Edge Case - key is null
        try {
            testSheet.getGrade(null);
            System.out.println("Expected Exception!");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("The method threw an exception when the key was null, as expected");
        }

        // Edge Case - key is different length than answers
        try {
            testSheet.getGrade(new ArrayList<String>());
            System.out.println("Expected Exception!");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(
                    "The method threw an exception when the key was a different length than the answers, as expected");
        }

        // Main Case - all values are valid
        System.out.println(testSheet.getGrade(testKey)); // should be 5.25
        if (testSheet.getGrade(testKey) == 5.25) {
            System.out.println("The method calculated the student's grade as expected");
        } else {
            System.out.println("Expected 5.25!");
        }
    }

    // Helper method
    private static StudentAnswerSheet createTestSheet() {
        String testName = "Alice";
        ArrayList<String> testAnswers = new ArrayList<String>(
                Arrays.asList("A", "B", "D", "E", "A", "C", "?", "B", "D", "C"));
        StudentAnswerSheet testSheet = new StudentAnswerSheet(testName, testAnswers);

        return testSheet;
    }
}
