public class Course {
    // instance variables
    private String courseName;
    private StudentRecord[] enrolledStudents;

    // constructors
    public Course(String courseName, StudentRecord[] enrolledStudents) {
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
    }

    // getters
    public String getCourseName() {
        return courseName;
    }

    public StudentRecord[] getEnrolledStudents() {
        return enrolledStudents;
    }

    // setters
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setEnrolledStudents(StudentRecord[] enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    // inherited methods

    public String toString() {
        if (courseName == null || enrolledStudents == null) {
            return "null";
        }

        String header = "== " + courseName + " ==\n";
        String studentList = "";
        for (int i = 0; i < enrolledStudents.length; i++) {
            studentList += (i + 1) + ".) " + enrolledStudents[i].toString();
            if (i != enrolledStudents.length - 1) {
                studentList += "\n";
            }
        }
        String record = header + studentList;
        return record;
    }

    // methods

    public String findBestStudent() {
        String bestName = "";
        double curBest = Double.MIN_VALUE;
        if (enrolledStudents == null || enrolledStudents.length == 0) {
            return "N/A";
        }

        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] != null && curBest < enrolledStudents[i].getFinalAverage()) {
                curBest = enrolledStudents[i].getFinalAverage();
                bestName = enrolledStudents[i].getName();
            }
        }

        return bestName;
    }

    public double calculateTestAverage(int testNumber) {
        double classAvg = 0.0;
        int skipped = 0;
        if (enrolledStudents == null || testNumber < 0 || testNumber >= enrolledStudents.length) {
            return -1;
        }

        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] == null || enrolledStudents[i].getTestScore(testNumber) == -1) {
                skipped++;
                continue;
            }
            classAvg += enrolledStudents[i].getTestScore(testNumber);
        }

        return classAvg / (enrolledStudents.length - skipped);
    }

}
