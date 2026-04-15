public class Tester {
    public static void main(String[] args) {
        Student Sarah = new Student("Sarah", 1001, "ABC");
        Student John = new Student("John", 1002, "123");
        Student Jennifer = new Student("Jennifer", 1003, "A1C");

        System.out.println(Sarah.compareTo((Object) Jennifer));
        System.out.println(Sarah.compareTo(Jennifer));
    }
}
