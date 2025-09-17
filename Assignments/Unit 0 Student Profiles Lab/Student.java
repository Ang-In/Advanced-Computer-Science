public class Student {
    // instance variables

    private String name;
    private String id = "";
    private int grade;
    // private Student latestOpp, recentFriend;

    // constructors

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.id = generateId();
        // this.latestOpp = null;
    }

    public Student(String name) {
        this.name = name;
        grade = 10;
        this.id = generateId();
        // latestOpp = null;
    }

    // getters

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public String getId() {
        return id;
    }

    /*
     * public Student getLatestOpp() { return latestOpp; }
     * 
     * public Student getRecentFriend() { return recentFriend; }
     */

    // setters

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setId(String id) {
        this.id = id;
    }

    /*
     * public void setLatestOpp(Student latestOpp) { this.latestOpp = latestOpp; }
     * 
     * public void setRecentFriend(Student recentFriend) { this.recentFriend = recentFriend; }
     */

    // methods

    /*
     * public String vibeCheck(Student other) { if (this.latestOpp.equals(other.latestOpp)) {
     * recentFriend = other; return this.name + " and " + other.name +
     * " are now friends! They both dislike " + this.latestOpp.name + "."; }
     * 
     * return this.name + " and " + other.name + " are not friends, they dislike different people.";
     * }
     */

    public String generateId() {
        for (int i = 0; i < 8; i++) {
            if (id.length() == 3) {
                id += "-";
            } else if (id == "") {
                id += (int) ((Math.random() * 8) + 1);
            } else {
                id += (int) (Math.random() * 10);
            }
        }

        return id;

    }

    public boolean equals(Student other) {
        return this.name.equals(other.name) && this.grade == other.grade
                && this.id.equals(other.id);
    }

    public String toString() {
        return name + " is a " + grade + "th grade student. Their id is " + id + ".";
        // , who likes " + recentFriend.name + " and dislikes " + latestOpp.name + "
    }
}
