import java.util.ArrayList;
import java.util.Arrays;

public class AnswerSheetTester {
    public static void main(String[] args) {
        System.out.println("Testing StudentAnswerSheet Class");
        testStudentAnswerSheet();
        System.out.println();

        System.out.println("Testing TestResults Class");
        testTestResults();
        System.out.println();
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

        }
    }

    private static void testTestResults() {

    }
}
