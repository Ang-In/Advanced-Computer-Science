public class StudentRecord {
    // instance variables
    private String name;
    private int[] scores;

    // constructors
    public StudentRecord(String name, int[] scores) {
        this.name = name;
        this.scores = scores;
    }

    // getters
    public String getName() {
        return name;
    }

    public int[] getScores() {
        return scores;
    }

    public int getTestScore(int testNumber) {
        if (testNumber < scores.length - 1 && testNumber > 0) {
            return scores[testNumber];
        }
        return -1;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    // inherited methods
    public String toString() {
        String statement = name + "'s scores: [";
        for (int i = 0; i < this.scores.length; i++) {
            if (i == this.scores.length - 1) {
                statement += scores[i];
                statement += "]";
            } else {
                statement += scores[i];
                statement += ", ";
            }
        }
        return statement;
    }

    public boolean equals(StudentRecord other) {
        if (name.equals(other.name) && scores.length == other.scores.length) {
            for (int i = 0; i < scores.length; i++) {
                if (this.getTestScore(i) != other.getTestScore(i)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    // methods

    /*
     * returns the average (arithmetic mean) of the values in scores precondition: 0 <= first < last
     * < scores.length
     * 
     * @param first - the first index of the scores array
     * 
     * @param last - the last index of the scores array
     * 
     * @return the double average of the values in scores
     */
    public double getAverage(int first, int last) {
        double avg = 0.0;
        for (int i = first; i <= last; i++) {
            avg += getTestScore(i);
        }
        avg = avg / ((last - first) + 1);
        return avg;
    }

    /*
     * Determines if each successive value in scores is greater than or equal to the previous value
     * 
     * @return true if student has improved, false otherwise
     */
    public boolean hasImproved() {
        int prevVal = Integer.MIN_VALUE;
        for (int i = 0; i < scores.length; i++) {
            if (prevVal > getTestScore(i)) {
                return false;
            } else {
                prevVal = getTestScore(i);
            }
        }
        return true;
    }

    /*
     * The method determines if the student has improved and returns the average score
     * appropriately: If the student has improved, returns the average of the top half of the scores
     * array. Otherwise, returns the average of all of the values in scores
     * 
     * @return the double average of test scores
     */

    public double getFinalAverage() {
        if (hasImproved()) {
            if (scores.length % 2 == 1) {
                return getAverage((int) ((scores.length / 2) + 0.5), scores.length - 1);
            }
            return getAverage((scores.length / 2), scores.length - 1);
        }
        return getAverage(0, scores.length - 1);
    }

}
