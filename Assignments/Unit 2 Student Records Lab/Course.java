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

    // to-do: implement toString

    // methods

    /*
     * Iterates through the enrolledStudents array and returns the name of the student with the best
     * final average.
     * 
     * @return the name of the student with the best final average
     */
    // to-do: implement findBestStudent

    /*
     * Iterates through the enrolledStudents array and returns the average of the specified test
     * number.
     * 
     * @return a double representing the average of the specified test number
     */
    // to-do: implement calculateTestAverage

}
