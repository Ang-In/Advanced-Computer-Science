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
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    // methods

    public String validateTelephoneNumber(String telephoneNumber) {
        if (telephoneNumber.length() != 10) {
            throw new IllegalArgumentException("Invalid Telephone Number - Incorrect Length!");
        }

        String validated = "";
        char[] telephoneDigits = telephoneNumber.toCharArray();
        for (int i = 0; i < telephoneDigits.length; i++) {
            if (telephoneDigits[i] < 48 || telephoneDigits[i] > 57) {
                throw new IllegalArgumentException(
                        "Invalid Telephone Number - Must be numbers (0-9) only!");
            }
            validated += telephoneDigits[i];
            if (i == 2 || i == 5) {
                validated += "-";
            }
        }

        return validated;
    }
}
