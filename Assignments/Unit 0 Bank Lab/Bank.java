public class Bank {
    int numberOfLoanOfficers;
    int numberOfTellers;

    // constructors
    public Bank(int numberOfLoanOfficers, int numberOfTellers) {
        this.numberOfLoanOfficers = numberOfLoanOfficers;
        this.numberOfTellers = numberOfTellers;
    }

    // getters

    public int getNumberOfLoanOfficers() {
        return numberOfLoanOfficers;
    }

    public int getNumberOfTellers() {
        return numberOfTellers;
    }

    // setters

    public void setNumberOfLoanOfficers(int numberOfLoanOfficers) {
        this.numberOfLoanOfficers = numberOfLoanOfficers;
    }

    public void setNumberOfTellers(int numberOfTellers) {
        this.numberOfTellers = numberOfTellers;
    }

    // methods

    public int computeTotalEmployees() {
        return numberOfLoanOfficers + numberOfTellers;
    }

    public void hireMembers(int numberToHire, boolean isLoanOfficer) {
        if (isLoanOfficer) {
            numberOfLoanOfficers += numberToHire;
        } else {
            numberOfTellers += numberToHire;
        }
    }

    public String toString() {
        return "This bank has " + numberOfLoanOfficers + " loan officers and " + numberOfTellers
                + " tellers.";
    }

    public boolean equals(Bank other) {
        return this.numberOfLoanOfficers == other.numberOfLoanOfficers
                && this.numberOfTellers == other.numberOfTellers;
    }

    // Challenge:

    public double getEmployeeRatio() {
        return ((double) numberOfLoanOfficers / numberOfTellers);
    }

    public void fireMembers(int numberToFire, boolean isLoanOfficer) {
        if (isLoanOfficer) {
            numberOfLoanOfficers -= numberToFire;
            if (numberOfLoanOfficers < 0) {
                numberOfLoanOfficers = 0;
            }
        } else {
            numberOfTellers -= numberToFire;
            if (numberOfTellers < 0) {
                numberOfTellers = 0;
            }
        }
    }

    public void transferEmployee(boolean fromLoanOfficer) {
        if (fromLoanOfficer) {
            numberOfLoanOfficers--;
            numberOfTellers++;
        } else {
            numberOfLoanOfficers++;
            numberOfTellers--;
        }
    }

    public int calculateTotalSalary(){
        return numberOfLoanOfficers * 75000 + numberOfTellers * 45000;
    }
}
