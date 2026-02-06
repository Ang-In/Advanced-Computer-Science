import java.util.ArrayList;

public class TestResults {
    // instance variables
    ArrayList<String> answerKey;
    ArrayList<StudentAnswerSheet> submissions;

    // constructors
    public TestResults(ArrayList<String> key, ArrayList<StudentAnswerSheet> submissions) {
        if (key == null) {
            throw new IllegalArgumentException("Cannot add a nonexistent answer key!");
        }
        if (submissions == null) {
            throw new IllegalArgumentException("Cannot add nonexistent submissions!");
        }

        this.answerKey = key;
        this.submissions = submissions;
    }

    // getters
    public ArrayList<String> getAnswerKey() {
        return answerKey;
    }

    public ArrayList<StudentAnswerSheet> getSubmissions() {
        return submissions;
    }

    // setters
    public void setAnswerKey(ArrayList<String> answerKey) {
        if (answerKey == null) {
            throw new IllegalArgumentException("Cannot use a nonexistent answer key!");
        }
        this.answerKey = answerKey;
    }

    public void setSubmissions(ArrayList<StudentAnswerSheet> submissions) {
        if (submissions == null) {
            throw new IllegalArgumentException("Cannot use nonexistent submissions!");
        }
        this.submissions = submissions;
    }

    // inherited methods
    // to-do: override/create toString() and equals() methods

    // methods
    public void submit(StudentAnswerSheet student) {
        if (student == null) {
            throw new IllegalArgumentException("Cannot submit a nonexistent test!");
        }
        submissions.add(student);
    }

    public void gradeTests() {
        for (StudentAnswerSheet student : submissions) {
            if (answerKey.size() != student.getAnswers().size()) {
                throw new IllegalArgumentException(
                        "Answer key length should equal the number of questions in the test!");
            }

            student.getGrade(answerKey);
        }
    }

    public String highestScoringStudent() {
        if (submissions.size() == 0) {
            return "";
        }

        String highestScoringStudent = "";
        double highestGrade = Integer.MIN_VALUE;
        for (StudentAnswerSheet student : submissions) {
            if (student.getGrade(answerKey) > highestGrade) {
                highestGrade = student.getGrade(answerKey);
                highestScoringStudent = student.getName();
            }
        }

        return highestScoringStudent;
    }
}
