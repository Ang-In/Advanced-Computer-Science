import java.util.ArrayList;

public class StudentAnswerSheet {
    // instance variables
    String name;
    double testScore;
    ArrayList<String> answers;

    // constructors
    public StudentAnswerSheet(String name, ArrayList<String> answers) {
        if (name == null) {
            throw new IllegalArgumentException("Cannot add a nameless test!");
        }
        if (answers == null) {
            throw new IllegalArgumentException("Cannot add a nonexistent test!");
        }

        this.name = name;
        this.testScore = 0.0;
        this.answers = answers;
    }

    // getters
    public String getName() {
        return name;
    }

    public double getTestScore() {
        return testScore;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    // setters
    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Cannot use a nonexistent name!");
        }
        this.name = name;
    }

    public void setTestScore(double testScore) {
        this.testScore = testScore;
    }

    public void setAnswers(ArrayList<String> answers) {
        if (answers == null) {
            throw new IllegalArgumentException("Cannot use a nonexistent test!");
        }
        this.answers = answers;
    }

    // inherited methods
    public boolean equals(StudentAnswerSheet other) {
        if (!(this.name.equals(other.name))) {
            return false;
        }
        if (this.testScore != other.testScore) {
            return false;
        }
        if (!(this.answers.equals(other.answers))) {
            return false;
        }

        return true;
    }

    public String toString() {
        String message = name + "'s test answers: [";
        for (int i = 0; i < answers.size(); i++) {
            message += answers.get(i);
            if(i != answers.size() - 1){
                message += " ";
            }
        }
        message += "]";
        return message;
    }

    // methods
    public double getGrade(ArrayList<String> key) {
        if (key == null) {
            throw new IllegalArgumentException("Cannot use a nonexistent answer key!");
        }
        if (key.size() != answers.size()) {
            throw new IllegalArgumentException(
                    "Answer key length should equal the number of questions in the test!");
        }

        double grade = 0.0;
        for (int i = 0; i < key.size(); i++) {
            if (answers.get(i) == null || answers.get(i).equals("?")) {
                continue;
            }
            if (answers.get(i).equals(key.get(i))) {
                grade += 1;
            } else {
                grade -= 0.25;
            }
        }

        return grade;
    }
}
