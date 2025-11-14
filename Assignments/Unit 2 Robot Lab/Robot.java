public class Robot {
    // instance variables
    private int[] hallway;
    private int position; // the robot's current position
    private boolean isFacingRight; // true if the robot is facing right

    // constructors
    public Robot(int[] hallwayToClean, int startingPosition) {
        if (hallwayToClean == null) {
            System.out.println("There's no hallway!");
        } else {
            // hallway
            hallway = new int[hallwayToClean.length];
            for (int i = 0; i < hallwayToClean.length; i++) {
                if (hallwayToClean[i] < 0) {
                    hallway[i] = 0;
                } else {
                    hallway[i] = hallwayToClean[i];
                }
            }

            // position
            if (startingPosition > hallwayToClean.length - 1) {
                position = hallwayToClean.length - 1;
            } else if (startingPosition < 0) {
                position = 0;
            } else {
                position = startingPosition;
            }

            // isFacingRight
            isFacingRight = true;
        }
    }

    // getters and setters
    public int[] getHallway() {
        return hallway;
    }

    public void setHallway(int[] hallway) {
        if (hallway == null) {
            System.out.println("There's no hallway!");
        } else {
            this.hallway = new int[hallway.length];
            for (int i = 0; i < hallway.length; i++) {
                if (hallway[i] < 0) {
                    this.hallway[i] = 0;
                } else {
                    this.hallway[i] = hallway[i];
                }
            }
        }
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        if (position > hallway.length - 1) {
            this.position = hallway.length - 1;
        } else if (position < 0) {
            this.position = 0;
        } else {
            this.position = position;
        }
    }

    public boolean isFacingRight() {
        return isFacingRight;
    }

    public void setFacingRight(boolean isFacingRight) {
        this.isFacingRight = isFacingRight;
    }

    // methods
    /*
     * Determines if the robot is blocked by a wall (the end of an array)
     * 
     * @return true if the robot is blocked by a wall, false otherwise
     */
    public boolean isRobotBlockedByWall() {
        // right block
        while (isFacingRight && position == (hallway.length - 1)) {
            return true;
        }
        // left block
        while (!isFacingRight && position == 0) {
            return true;
        }
        return false;
    }

    /*
     * Commands the robot to pick up an item, move forward or turn around
     */
    public void move() {
        if (hallway[position] > 0) {
            hallway[position]--; // pick up an item if there are items

            if (hallway[position] == 0 && isRobotBlockedByWall()) {
                isFacingRight = !isFacingRight; // switch direction if blocked
            } else if (hallway[position] == 0 && !isRobotBlockedByWall() && isFacingRight) {
                position++; // move right if not blocked and facing right
            } else if (hallway[position] == 0 && !isRobotBlockedByWall() && !isFacingRight) {
                position--; // move left if not blocked and facing left
            }

        } else {
            if (hallway[position] == 0 && isRobotBlockedByWall()) {
                isFacingRight = !isFacingRight; // switch direction if blocked
            } else if (hallway[position] == 0 && !isRobotBlockedByWall() && isFacingRight) {
                position++; // move right if not blocked and facing right
            } else if (hallway[position] == 0 && !isRobotBlockedByWall() && !isFacingRight) {
                position--; // move left if not blocked and facing left
            }
        }
    }

    /**
     * This method displays the current state of the robot and the hallway. It then calls the move()
     * method and counts the number of moves it takes to clear the hallway. The method should
     * display the current state of the robot after each move.
     * 
     * @return the number of moves made
     */

    public int clearHall() {
        int count = 0;
        while (!hallIsClear()) {
            count++;
            System.out.println("Hall State at move " + count + ":");
            this.displayState();
            move();
            System.out.println("Hall State after move " + count + ":");
            this.displayState();
        }

        return count;
    }

    /**
     * This method determines if the hallway contains any items.
     * 
     * @return a boolean value indicating if the hallway contains any items
     */
    public boolean hallIsClear() {
        int index = 0;
        while (index < hallway.length - 1) {
            while (hallway[index] != 0) {
                return false;
            }
            index++;
        }

        return true;
    }

    /*
     * Displays the current state of the robot and the hallway.
     */
    public void displayState() {
        String state = "";

        // hallway
        for (int i = 0; i < hallway.length; i++) {
            state += hallway[i];
            if (i != hallway.length - 1) {
                state += " ";
            }
        }
        state += "\n";

        // spacing

        for (int i = 0; i < position; i++) {
            state += "  "; // two spaces
        }

        // direction
        if (isFacingRight) {
            state += ">";
        } else {
            state += "<";
        }

        System.out.println(state);
    }
}
