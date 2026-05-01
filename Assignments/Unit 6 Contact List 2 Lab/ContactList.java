import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;

public class ContactList extends AbstractList {

    // instance variables
    private ArrayList<Contact> contactList;

    // constructors
    public ContactList() {
        contactList = new ArrayList<Contact>();
    }

    // inherited methods
    /** returns a String containing all of the words in list */
    public String toString() {
        return "Contact List: " + contactList.toString();
    }

    // get(int index)
    /** returns the name at the specified index */
    public Contact get(int index) {
        if (contactList == null || index >= contactList.size()) {
            throw new IllegalArgumentException("Invalid Index!");
        }
        return contactList.get(index);
    }

    // size()
    /** returns the number of names in the contact list */
    public int size() {
        if (contactList == null) {
            throw new IllegalArgumentException("Cannot return the size of a nonexistent list!");
        }
        return contactList.size();
    }

    // methods
    // add(String name)
    /**
     * adds a contact to the contact list so that the list remains alphabetized, it prints out which
     * name is being added, also the method prevents duplicate names from being added
     */
    public boolean add(Contact contact) {
        if (contact == null) {
            throw new IllegalArgumentException("Cannot add a nonexistent contact!");
        }

        System.out.println("+ Adding " + contact.getFirstName());
        /*
         * if (searchContacts(contact.getTelephoneNumber()) != null) { return false; }
         */

        int location = findAddLocation(contact); // mark
        if (contactList.isEmpty()) {
            contactList.add(contact);
            return true;
        } else if (location < 0) {
            return false;
        } else {
            contactList.add(location, contact);
            return true;
        }

    }

    // remove(String name)
    /* removes a contact from the contact list and keeps list alphabetized */
    public boolean remove(Contact contact) {
        if (contact == null) {
            throw new IllegalArgumentException("Cannot remove a nonexistent contact!");
        }

        System.out.println("- Removing " + contact.getFirstName());
        if (contactList.isEmpty()) {
            return false;
        }
        /*
         * if (searchContacts(contact.getTelephoneNumber()) != null) { return false; }
         */

        int location = findRemoveLocation(contact); // mark
        if (location == -1) {
            return false;
        } else {
            contactList.remove(location);
            return true;
        }
    }

    public void sortByFirstName() {
        if (contactList != null) {
            Collections.sort(contactList);
        }
    } // mark

    public void sortByLastName() {
        // Uses Selection Sort
        int size = contactList.size();
        if (contactList != null) {
            for (int i = 0; i < size; i++) {
                Contact sorting = contactList.get(i);
                int swapIndex = i;
                for (int j = i; j < contactList.size() - 1; j++) {

                    if (sorting.compareToLastName(contactList.get(i)) > 0) {
                        sorting = contactList.get(j);
                        swapIndex = j;
                    }
                }

                Contact temp = contactList.get(i);
                contactList.set(i, sorting);
                contactList.set(swapIndex, temp);
            }
        } else {
            throw new IllegalArgumentException("Cannot sort a nonexistent list!");
        }
    }

    public void sortByTelephoneNumber() {
        // Uses Insertion Sort
        if (contactList != null) {
            for (int i = 1; i < contactList.size(); i++) {
                Contact key = contactList.get(i);
                int j = i - 1;

                while (j >= 0 && key.getTelephoneNumber()
                        .compareTo(contactList.get(j).getTelephoneNumber()) > 0) {
                    contactList.add(j + 1, contactList.get(j));
                    j -= 1; // mark
                }
                contactList.add(j + 1, key);
            }
        } else {
            throw new IllegalArgumentException("Cannot sort a nonexistent list!");
        }
    }

    // clear()
    /** removes all names from the contact list */
    public void clear() {
        System.out.println("Clearing the contact list");
        contactList = new ArrayList<Contact>();
    }

    public Contact searchContacts(String telephoneNumber) {
        if (contactList == null || contactList.size() == 0) {
            return null;
        }
        if (telephoneNumber == null) {
            throw new IllegalArgumentException(
                    "Cannot find contact with a nonexistent phone number!");
        }

        sortByTelephoneNumber();
        int prevSorter = 0;
        int left = 0;
        int right = contactList.size();
        Contact result = null;

        while (left < right) { // mark
            int midIndex = (left + right) / 2; // truncates
            String curNum = contactList.get(midIndex).getTelephoneNumber();
            int sorter = telephoneNumber.compareTo(curNum);
            if (sorter == 0) { // equal
                result = contactList.get(midIndex);
                break;
            } else if (sorter < 0) { // our guess is too large
                if (prevSorter > 0) {
                    left = midIndex;
                    prevSorter = sorter;
                    continue;
                } else if (right - left == 1) {
                    break;
                } else {
                    right = midIndex;
                    prevSorter = sorter;
                    continue;
                }
            } else if (sorter > 0) { // our guess is too small
                if (prevSorter < 0) {
                    right = midIndex;
                    prevSorter = sorter;
                    continue;
                } else if (right - left == 1) {
                    break;
                } else {
                    left = midIndex;
                    prevSorter = sorter;
                    continue;
                }
            }
            prevSorter = sorter;
        }

        return result;
    }

    // helper method: search
    protected int findAddLocation(Contact contact) {
        // You can use a sequential search here. But for a Stretch Challenge, try to do
        // a binary search.
        if (contactList == null || contact == null) {
            return -1;
        }
        if (contactList.size() == 0) {
            return 0;
        }

        int prevSorter = 0;
        int left = 0;
        int right = contactList.size();
        int location = -1;

        while (left < right) { // mark
            int midIndex = (left + right) / 2;
            int sorter = contact.compareTo(contactList.get(midIndex));
            if (sorter == 0) {
                break;
            } else if (sorter < 0) {
                if (prevSorter > 0) {
                    location = midIndex;
                    break;
                } else if (right - left == 1) {
                    location = 0;
                    break;
                } else {
                    right = midIndex;
                    prevSorter = sorter;
                    continue;
                }
            } else if (sorter > 0) {
                if (prevSorter < 0) {
                    location = midIndex + 1;
                    break;
                } else if (right - left == 1) {
                    location = right;
                    break;
                } else {
                    left = midIndex;
                    prevSorter = sorter;
                    continue;
                }
            }
            prevSorter = sorter;
        }

        return location;
    }

    protected int findRemoveLocation(Contact contact) {
        // You can use a sequential search here. But for a Stretch Challenge, try to do
        // a binary search.
        if (contactList == null || contact == null) {
            return -1;
        }
        if (contactList.size() == 0) {
            return 0;
        }

        int prevSorter = 0;
        int left = 0;
        int right = contactList.size();
        int location = -1;

        while (left < right) { // mark
            int midIndex = (left + right) / 2;
            int sorter = contact.compareTo(contactList.get(midIndex));
            if (sorter == 0) {
                location = midIndex;
                break;
            } else if (sorter < 0) {
                if (prevSorter > 0) {
                    left = midIndex;
                    prevSorter = sorter;
                    continue;
                } else if (right - left == 1) {
                    location = 0;
                    break;
                } else {
                    right = midIndex;
                    prevSorter = sorter;
                    continue;
                }
            } else if (sorter > 0) {
                if (prevSorter < 0) {
                    right = midIndex + 1;
                    prevSorter = sorter;
                    continue;
                } else if (right - left == 1) {
                    location = right;
                    break;
                } else {
                    left = midIndex;
                    prevSorter = sorter;
                    continue;
                }
            }
            prevSorter = sorter;
        }

        return location;
    }
}
