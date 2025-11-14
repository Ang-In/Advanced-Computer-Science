public class RobotTester {
    public static void main(String[] args) {
        int[] hall = {0, 1, 2, 3};
        Robot robby = new Robot(hall, 1);
        robby.setFacingRight(false);

        // testing clearHall() for a 9-move scenario
        int moveCount = robby.clearHall();
        System.out.println("The total number of moves to clear this hall: " + moveCount);
        System.out.println("Did the robot complete the hall with exactly 9 moves? "
                + (moveCount == 9 ? "Yes." : "No."));

        // step testing:
        Robot stepBot = new Robot(hall, 1);

        // testing displayState()
        System.out.println("Initial state of stepBot:");
        stepBot.displayState();

        System.out.println();
        stepBot.move(); // collect an object and move forward
        stepBot.displayState();
        stepBot.move(); // collect an object but don't move
        stepBot.displayState();
        stepBot.move(); // collect an object and move forward
        stepBot.displayState();
        stepBot.move(); // collect an object but don't move
        stepBot.displayState();
        stepBot.move(); // turn around, don't move
        stepBot.displayState();
    }
}
