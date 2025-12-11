public class BobaShopMember {
    // instance variables
    String name;
    boolean[] loyaltyCredits;

    // constructors
    public BobaShopMember(String name) {
        this.name = name;
        loyaltyCredits = new boolean[10];
    }

    // getters
    public String getName() {
        return name;
    }

    public boolean[] getLoyaltyCredits() {
        return loyaltyCredits;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setLoyaltyCredits(boolean[] loyaltyCredits) {
        this.loyaltyCredits = loyaltyCredits;
    }

    // inherited methods
    public String toString() {
        String status = " (" + determineMembershipStatus() + "), ";
        if (name == null) {
            return "null" + status + loyaltyHistory();
        }
        return name + status + loyaltyHistory();
    }

    public boolean equals(BobaShopMember other) {
        // null check: name
        /*
         * if (this.name == null || other.name == null) { if (this.name == null && other.name ==
         * null) { return true; } else { return false; } }
         * 
         * // null check: loyaltyCredits if (this.loyaltyCredits == null || other.loyaltyCredits ==
         * null) { if (this.loyaltyCredits == null && other.loyaltyCredits == null) { return true; }
         * else { return false; } }
         */

        if (!(this.name.equals(other.name))) {
            return false;
        }

        if (!(this.loyaltyCredits.length == other.loyaltyCredits.length)) {
            return false;
        }

        for (int i = 0; i < loyaltyCredits.length; i++) {
            if (this.loyaltyCredits[i] != other.loyaltyCredits[i]) {
                return false;
            }
        }

        return true;
    }

    // methods
    public void grantLoyaltyCredit() {
        if (!(loyaltyCredits == null)) {
            for (int i = 0; i < loyaltyCredits.length; i++) {
                if (loyaltyCredits[i] == false) {
                    loyaltyCredits[i] = true;
                    break;
                }
            }
        }
    }

    public int countLoyaltyCredits() {
        if (loyaltyCredits == null) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < loyaltyCredits.length; i++) {
            if (loyaltyCredits[i] == false) {
                break;
            }
            count++;
        }
        return count;
    }

    public String determineMembershipStatus() {
        int credits = countLoyaltyCredits();
        if (credits >= 6) {
            return "Gold Member";
        } else if (credits < 6 && credits >= 3) {
            return "Silver Member";
        } else {
            return "Plus Member";
        }
    }

    public String loyaltyHistory() {
        if (loyaltyCredits == null) {
            return "Loyalty History: []";
        }

        String history = "Loyalty History: [";
        int credits = countLoyaltyCredits();

        for (int i = 0; i < loyaltyCredits.length; i++) {
            if (i < credits) {
                history += "X";
            } else {
                history += "-";
            }

            if (i < loyaltyCredits.length - 1) {
                history += ", ";
            }
        }
        history += "]";

        return history;
    }
}
