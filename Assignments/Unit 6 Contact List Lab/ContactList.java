import java.util.ArrayList;
import java.util.AbstractList;

public class ContactList extends AbstractList {

    // instance variable
    private ArrayList<String> contactList;

    // constructor
    // to-do: initializes an empty contact list
    public ContactList() {
        contactList = new ArrayList<String>();
    }

    // methods

    // to-do: findInsertLocation(String name)
    /**
     * returns the location in the contact list where the name should go to keep the list
     * alphabetized
     */
    private int findInsertLocation(String name) {
        // You can use a sequential search here. But for a Stretch Challenge, try to do
        // a binary search.

        if (contactList == null) {
            return -1;
        }
        if (contactList.size() == 0) {
            return 0;
        }

        int prevSorter = 0;
        int left = 0;
        int right = contactList.size() - 1;
        int location = -1;

        while (left < right) {
            int midIndex = (left + right) / 2;
            int sorter = name.compareTo(contactList.get(midIndex));
            if (sorter == 0) {
                break;
            } else if (sorter < 0) {
                if (prevSorter > 0) {
                    location = midIndex;
                } else {
                    right = midIndex;
                }
            } else if (sorter > 0) {
                if (prevSorter < 0) {
                    location = midIndex + 1;
                } else {
                    left = midIndex;
                }
            }
            prevSorter = sorter;
        }

        return location;
    }

    // to-do: add(String name)
    /**
     * adds a name to the contact list so that the list remains alphabetized, it prints out which
     * name is being added, also the method prevents duplicate names from being added
     */
    public boolean add(String name) {
        System.out.println("+ Adding " + name);
        int location = findInsertLocation(name);
        if (location == -1) {
            return false;
        } else {
            contactList.add(location, name);
            return true;
        }

    }

    // to-do: add(ArrayList<String> names)
    /* this method adds a list of names to the contact list */
    public void add(ArrayList<String> names) {
        for (String name : names) {
            add(name);
        }
    }

    // to-do: remove(String name)
    /* removes a name from the contact list and keeps list alphabetized */
    public boolean remove(String name) {
        System.out.println("- Removing " + name);
        return false;
    }

    // to-do: remove(ArrayList<String> names)
    /* this method removes a list of names from the contact list */
    public void remove(ArrayList<String> names) {

    }

    /** returns a String containing all of the words in list */
    public String toString() {
        return "Contact List: " + contactList.toString();
    }

    // to-do: get(int index)
    /** returns the name at the specified index */
    public String get(int index) {
        return null;
    }

    // to-do: size()
    /** returns the number of names in the contact list */
    public int size() {
        return 0;
    }

    // to-do: clear()
    /** removes all names from the contact list */
    public void clear() {
        System.out.println("Clearing the contact list");
    }

}
