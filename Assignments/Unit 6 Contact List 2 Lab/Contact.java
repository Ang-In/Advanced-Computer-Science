public class Contact implements Comparable {
    // instance variables
    String firstName;
    String lastName;
    String telephoneNumber;

    // constructors
    public Contact(String firstName, String lastName, String telephoneNumber) {
        if (firstName == null || lastName == null || telephoneNumber == null) {
            throw new IllegalArgumentException(
                    "Must have a first name, last name and telephone number!");
        }
        if (firstName.trim().isEmpty() || lastName.trim().isEmpty()) {
            throw new IllegalArgumentException();
        }

        this.firstName = firstName.trim();
        this.lastName = lastName.trim();
        this.telephoneNumber = validateTelephoneNumber(telephoneNumber.trim());
    }

    // getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    // setters
    public void setFirstName(String firstName) {
        if (firstName == null || firstName.isEmpty()) {
            throw new IllegalArgumentException("Cannot set first name to nothing!");
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.isEmpty()) {
            throw new IllegalArgumentException("Cannot set last name to nothing!");
        }
        this.lastName = lastName;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        if (telephoneNumber == null || telephoneNumber.isEmpty()) {
            throw new IllegalArgumentException("Cannot set telephone number to nothing!");
        }
        this.telephoneNumber = validateTelephoneNumber(telephoneNumber);
    }

    // inherited methods
    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Contact)) {
            throw new IllegalArgumentException(
                    "Cannot compare a contact to a different type of object!");
        }

        Contact other = (Contact) o;
        int firstComp = this.firstName.compareTo(other.firstName);
        int secondComp = this.lastName.compareTo(other.lastName);
        int lastComp = this.telephoneNumber.compareTo(other.telephoneNumber);
        int comparison = (firstComp == 0) ? (secondComp == 0) ? lastComp : secondComp : firstComp;

        return comparison;
    }

    public int compareToLastName(Object o) {
        if (!(o instanceof Contact)) {
            throw new IllegalArgumentException(
                    "Cannot compare a contact to a different type of object!");
        }

        Contact other = (Contact) o;
        int firstComp = this.lastName.compareTo(other.lastName);
        int secondComp = this.firstName.compareTo(other.firstName);
        int lastComp = this.telephoneNumber.compareTo(other.telephoneNumber);
        int comparison = (firstComp == 0) ? (secondComp == 0) ? lastComp : secondComp : firstComp;

        return comparison;
    }

    @Override
    public boolean equals(Object obj) {
        int comparison = compareTo(obj);
        boolean equal = (comparison == 0) ? true : false;
        return equal;
    }

    @Override
    public String toString() {
        String output = "";
        output += firstName + " " + lastName + ": " + telephoneNumber;
        return output;
    }

    // methods

    public String validateTelephoneNumber(String telephoneNumber) {
        if (telephoneNumber == null) {
            throw new IllegalArgumentException("Cannot validate a nonexistent telephone number!");
        }
        if (telephoneNumber.length() != 12) {
            throw new IllegalArgumentException("Invalid Telephone Number - Incorrect Length!");
        }

        char[] telephoneDigits = telephoneNumber.toCharArray();
        for (int i = 0; i < telephoneDigits.length; i++) {
            boolean dashCheck = false;
            if (i == 3 || i == 7) {
                dashCheck = true;
            }

            if (dashCheck && telephoneDigits[i] != '-') {
                throw new IllegalArgumentException(
                        "Invalid Telephone Number - must be in 'xxx-xxx-xxxx' format! (Dash)");
            } else if (dashCheck) {
                continue;
            } else if (telephoneDigits[i] < 48 || telephoneDigits[i] > 57) {
                throw new IllegalArgumentException(
                        "Invalid Telephone Number - must be in 'xxx-xxx-xxxx' format! (Digit)");
            }
        }

        return telephoneNumber;
    }
}
