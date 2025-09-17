public class StudentTester {
    public static void main(String[] args) {
        // test constructors
        Student silly = new Student("Cornelia", 9);
        Student annoying = new Student("Tyler", 11);
        Student quiet = new Student("N");
        Student dreamer = new Student("Wish");

        // test toString()
        System.out.println(silly.toString());
        System.out.println(annoying.toString());
        System.out.println(quiet.toString());
        System.out.println(dreamer.toString());

        // test getters
        silly.generateId();
        annoying.generateId();
        quiet.generateId();
        dreamer.generateId();

        System.out.println(silly.toString());
        System.out.println(annoying.toString());
        System.out.println(quiet.toString());
        System.out.println(dreamer.toString());

        // test setters
        silly.setGrade(10);
        annoying.setGrade(12);
        quiet.setGrade(11);
        dreamer.setGrade(11);

        System.out.println(silly.toString());
        System.out.println(annoying.toString());
        System.out.println(quiet.toString());
        System.out.println(dreamer.toString());

        // test equals()
        System.out.println("Are " + quiet.getName() + " and " + dreamer.getName() + " equal? "
                + quiet.equals(dreamer));

        // Stretch Challenge: test vibeCheck
        silly.setLatestOpp(annoying);
        dreamer.setLatestOpp(annoying);

        System.out.println(silly.toString());
        System.out.println(dreamer.toString());

        System.out.println(dreamer.vibeCheck(silly));
        System.out.println(
                dreamer.getName() + "'s newest friend: " + dreamer.getRecentFriend().getName());

    }
}
