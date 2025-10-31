public class Car {
    // instance variables
    private String model;
    private String ownerName;
    private String username;
    private int cleanlinessLevel;
    private boolean needsOilChange;


    // constructors
    public Car(String model, String ownerName, int cleanlinessLevel) {
        this.model = model;
        this.ownerName = AutoUtils.fixName(ownerName);
        this.username = AutoUtils.generateUsername(this.ownerName);
        this.cleanlinessLevel = AutoUtils.validateCleanlinessLevel(cleanlinessLevel);
        this.needsOilChange = false;
    }

    public Car() {
        model = "Placeholder";
        ownerName = "John Doe";
        username = AutoUtils.generateUsername(ownerName);
        cleanlinessLevel = 10;
        needsOilChange = false;
    }

    // getters and setters

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = AutoUtils.fixName(ownerName);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getCleanlinessLevel() {
        return cleanlinessLevel;
    }

    public void setCleanlinessLevel(int cleanlinessLevel) {
        this.cleanlinessLevel = AutoUtils.validateCleanlinessLevel(cleanlinessLevel);
    }

    public boolean isNeedsOilChange() {
        return needsOilChange;
    }

    public void setNeedsOilChange(boolean needsOilChange) {
        this.needsOilChange = needsOilChange;
    }

    // methods

    public String toString() {
        String header = "== ABOUT CAR ==\n";
        String info = "Model: " + model + "\n";
        String owner = "Owner: " + ownerName + "\n";
        String user = "Username: " + username + "\n";
        String clean = "Cleanliness Level: " + cleanlinessLevel + "\n";
        if (needsOilChange) {
            String oil = "Does car need oil change? Yes";
            return header + info + owner + user + clean + oil;
        } else {
            String oil = "Does car need oil change? No";
            return header + info + owner + user + clean + oil;
        }
    }

    public boolean equals(Car other) {
        if (this.model.equals(other.model) && this.ownerName.equals(other.ownerName)
                && this.username.equals(other.username)
                && this.cleanlinessLevel == other.cleanlinessLevel
                && this.needsOilChange == other.needsOilChange) {
            return true;
        }
        return false;
    }
}
