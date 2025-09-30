public class Dog {
    // instance variables
    private String name;
    private String ownerName;
    private int age;
    private int dogId;
    private char dogChar;
    private String dogTag;
    private boolean stillInFacility;

    // constructors
    public Dog(String name, String ownerName, int age, int dogId) {
        this.name = name;
        this.ownerName = ownerName;
        this.age = age;
        this.dogId = dogId;
        this.dogChar = generateDogChar();
        this.dogTag = generateDogTag();
        this.stillInFacility = true;
    }

    public Dog() {
        this.name = "Pup";
        this.ownerName = "Chrissy";
        this.age = 1;
        this.dogId = 100;
        this.dogChar = generateDogChar();
        this.dogTag = generateDogTag();
        this.stillInFacility = true;
    }

    // methods
    public char generateDogChar() {
        int conversion = dogId;
        int onesDigit = conversion % 10;
        conversion /= 10;
        int tensDigit = conversion % 10;
        int hundredsDigit = conversion /= 10;

        return (char) ('F' + ((onesDigit + tensDigit + hundredsDigit) % 10));
    }

    public String generateDogTag() {
        return "" + dogId + dogChar;
    }

    public String toString() {
        if (stillInFacility) {
            return name + " is a good dog. They are " + age + " years old and belong to "
                    + ownerName
                    + ". They are currently in our facility. For employee use only: DogTag is "
                    + dogTag + ".";
        } else {
            return name + " is a good dog. They are " + age + " years old and belong to "
                    + ownerName
                    + ". They are not currently in our facility. For employee use only: DogTag is "
                    + dogTag + ".";
        }
    }

    public boolean equals(Dog other) {
        return this.name.equals(other.name) && this.ownerName.equals(other.ownerName)
                && this.age == other.age && this.dogId == other.dogId
                && this.dogChar == other.dogChar && this.dogTag.equals(other.dogTag)
                && this.stillInFacility == other.stillInFacility;
    }

    // getters and setters
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDogId() {
        return dogId;
    }

    public void setDogId(int dogId) {
        this.dogId = dogId;
    }

    public char getDogChar() {
        return dogChar;
    }

    public void setDogChar(char dogChar) {
        this.dogChar = dogChar;
    }

    public String getDogTag() {
        return dogTag;
    }

    public void setDogTag(String dogTag) {
        this.dogTag = dogTag;
    }

    public boolean isStillInFacility() {
        return stillInFacility;
    }

    public void setStillInFacility(boolean stillInFacility) {
        this.stillInFacility = stillInFacility;
    }
}
