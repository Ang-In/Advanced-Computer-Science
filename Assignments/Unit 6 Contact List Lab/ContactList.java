import java.util.AbstractList;
import java.util.ArrayList;

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
        int right = contactList.size();
        int location = -1;

        while (left < right) {
            int midIndex = (left + right) / 2;
            int sorter = name.compareTo(contactList.get(midIndex));
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
                    continue;
                }
            }
            prevSorter = sorter;
        }

        return location;
    }

    private int findName(String name) {
        if (contactList == null || contactList.size() == 0) {
            return -1;
        }

        int prevSorter = 0;
        int left = 0;
        int right = contactList.size();
        int location = -1;

        while (left < right) {
            int midIndex = (left + right) / 2;
            String curWord = contactList.get(midIndex);
            int sorter = name.compareTo(curWord);
            if (sorter == 0) {
                location = midIndex;
                break;
            } else if (sorter < 0) {
                if (prevSorter > 0) {
                    left = midIndex;
                    continue;
                } else if (right - left == 1) {
                    break;
                } else {
                    right = midIndex;
                    continue;
                }
            } else if (sorter > 0) {
                if (prevSorter < 0) {
                    right = midIndex;
                    continue;
                } else if (right - left == 1) {
                    break;
                } else {
                    left = midIndex;
                    continue;
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
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Cannot add a nonexistent name!");
        }

        int location = findInsertLocation(name);
        if (location < 0) {
            return false;
        } else if (contactList.isEmpty()) {
            contactList.add(name);
            return true;
        } else {
            contactList.add(location, name);
            return true;
        }

    }

    // to-do: add(ArrayList<String> names)
    /* this method adds a list of names to the contact list */
    public void add(ArrayList<String> names) {
        if (names == null) {
            throw new IllegalArgumentException("Cannot add a nonexistent list of names!");
        }

        for (String name : names) {
            add(name);
        }
    }

    // to-do: remove(String name)
    /* removes a name from the contact list and keeps list alphabetized */
    public boolean remove(String name) {
        System.out.println("- Removing " + name);
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Cannot add a nonexistent name!");
        }
        if (contactList.isEmpty()) {
            return false;
        }

        int location = findName(name);
        if (location == -1) {
            return false;
        } else {
            contactList.remove(location);
            return true;
        }
    }

    // to-do: remove(ArrayList<String> names)
    /* this method removes a list of names from the contact list */
    public void remove(ArrayList<String> names) {
        if (names == null) {
            throw new IllegalArgumentException("Cannot remove a nonexistent list of names!");
        }

        for (String name : names) {
            remove(name);
        }
    }

    /** returns a String containing all of the words in list */
    public String toString() {
        return "Contact List: " + contactList.toString();
    }

    // to-do: get(int index)
    /** returns the name at the specified index */
    public String get(int index) {
        if (contactList == null || index >= contactList.size()) {
            throw new IllegalArgumentException("Invalid Index!");
        }
        return contactList.get(index);
    }

    // to-do: size()
    /** returns the number of names in the contact list */
    public int size() {
        if (contactList == null) {
            throw new IllegalArgumentException("Cannot return the size of a nonexistent list!");
        }
        return contactList.size();
    }

    // to-do: clear()
    /** removes all names from the contact list */
    public void clear() {
        System.out.println("Clearing the contact list");
        contactList = new ArrayList<String>();
    }

}
