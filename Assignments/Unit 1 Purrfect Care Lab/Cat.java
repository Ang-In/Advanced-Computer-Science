public class Cat {
    // instance variables
    private String name;
    private String ownerName;
    private int moodLevel;
    private String catId;
    private char catChar;
    private boolean isHungry;

    // constructors
    public Cat(String name, String ownerName, int moodLevel, String catId) {
        this.name = name;
        this.ownerName = ownerName;
        this.moodLevel = moodLevel;
        this.catId = catId;
        catChar = PurrfectUtils.generateCatChar(catId);
        isHungry = true;
    }

    public Cat() {
        name = "Kitty";
        ownerName = "Jane";
        moodLevel = 5;
        catId = "1000";
        catChar = PurrfectUtils.generateCatChar(catId);
        isHungry = true;
    }

    // getters & setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getMoodLevel() {
        return moodLevel;
    }

    public void setMoodLevel(int moodLevel) {
        this.moodLevel = PurrfectUtils.validateMoodLevel(moodLevel);
    }

    public String getCatId() {
        return catId;
    }

    public void setCatId(String catId) {
        String fixedId = PurrfectUtils.validateCatId(catId);
        this.catId = fixedId;
    }

    public char getCatChar() {
        return catChar;
    }

    public void setCatChar(char catChar) {
        this.catChar = catChar;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean isHungry) {
        this.isHungry = isHungry;
    }

    // methods
    public String generateCatTag() {
        return catId + catChar;
    }

    public String toString() {
        String catMoodMessage = PurrfectUtils.determineCatMood(this);
        String header = "== ABOUT " + name.toUpperCase() + " ==\n";
        String info = name + " is a cat.\n";
        String tag = "Their tag is " + generateCatTag() + ".\n";
        String mood = "Currently, " + catMoodMessage;

        return header + info + tag + mood;
    }

    public boolean equals(Cat other) {
        if (this.name.equals(other.name) && this.ownerName.equals(other.ownerName)
                && this.moodLevel == other.moodLevel
                && this.generateCatTag().equals(other.generateCatTag())
                && this.isHungry == other.isHungry) {
            return true;
        }
        return false;
    }
}
