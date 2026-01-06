public class Course {
    // instance variables
    private String courseName;
    private StudentRecord[] enrolledStudents;

    // constructors
    public Course(String courseName, StudentRecord[] enrolledStudents) {
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
    }

    public Course(String courseName, int maxEnrollment) {
        this.courseName = courseName;
        this.enrolledStudents = new StudentRecord[maxEnrollment];
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

    public boolean isFull() {
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] == null) {
                return false;
            }
        }
        return true;
    }

    public void enrollStudent(StudentRecord student) {
        if (isFull()) {
            return;
        }

        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] == null) {
                enrolledStudents[i] = student;
                return;
            }
        }
    }

    public boolean dropStudent(StudentRecord student) {
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] == null) {
                continue;
            }
            if (enrolledStudents[i].getName().equals(student)) {
                enrolledStudents[i] = null;
                return true;
            }
        }
        return false;
    }

    public int countEnrolledStudents() {
        int count = 0;
        if (enrolledStudents != null && enrolledStudents.length != 0) {
            for (int i = 0; i < enrolledStudents.length; i++) {
                if (enrolledStudents[i] != null) {
                    count++;
                }
            }
        }

        return count;
    }

    public void increaseClassSizeBy(int sizeIncrease) {
        if (enrolledStudents == null) {
            StudentRecord[] expanded = new StudentRecord[sizeIncrease];
            return;
        }

        StudentRecord[] expanded = new StudentRecord[enrolledStudents.length + sizeIncrease];
        for (int i = 0; i < enrolledStudents.length; i++) {
            expanded[i] = enrolledStudents[i];
        }

        enrolledStudents = expanded;
        return;
    }

}
