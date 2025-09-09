public class Squid {
    // instance variables
    private int tentacleCount;
    private double inkMeter;
    private String funFact;

    // constructors

    // default constructor
    public Squid() {
        tentacleCount = 10;
        inkMeter = 100.0;
        funFact = "pieces of squid make for good bait while fishing";
    }

    public Squid(int tentacles, double ink, String fact) {

    }

    // getters
    public int getTentacleCount() {
        return tentacleCount;
    }

    public double getInkMeter() {
        return inkMeter;
    }

    public String getFunFact() {
        return funFact;
    }

    // setters
    public void setTentacleCount(int value) {
        tentacleCount = value;
    }

    public void setInkMeter(double inkVal) {
        inkMeter = inkVal;
    }

    public void setFunFact(String fact) {
        funFact = fact;
    }

    // built-in method returning all values of an object in a nice sentence
    public String toString() {
        return "This is a squid. It has " + tentacleCount
                + " tentacles. It's current ink level is '" + inkMeter
                + ". Also, did you know that... " + funFact + "?";
    }

    public boolean equals(Squid otherSquid) {
        return tentacleCount == otherSquid.tentacleCount && inkMeter == otherSquid.inkMeter
                && funFact.equals(otherSquid.funFact);
    }

}
