public class Student implements Comparable {
    private int id;
    private String name;
    private String alphaID;

    public Student(String name, int id, String alphaID) {
        this.name = name;
        this.id = id;
        this.alphaID = alphaID;
    }

    public int getId() {
        return id;
    }

    public int compareTo(Object other) {
        if (other instanceof Student) {
            Student otherStudent = (Student) other;
            return id - otherStudent.getId();
        }

        throw new IllegalArgumentException(
                "Cannot compare a student with something that's not a student!");
    }
    public int compareTo(Student student) {
        return alphaID.compareTo(student.alphaID);
    }
}
