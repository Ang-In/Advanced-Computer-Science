import java.util.ArrayList;
import java.util.Arrays;

public class ContactListTester {
    public static void main(String[] args) {
        // A list of unsorted names
        Contact alice = new Contact("Alice", "Berenstein", "919-001-8738");
        System.out.println(alice);

        Contact annabelle = new Contact("Annabelle", "Granger", "7278189296");
        Contact bobby = new Contact("Bobby", "Karlson", "4017788292");
        Contact fred = new Contact("Fred", "Fernandez", "3234518920");
        Contact samuel = new Contact("Samuel", "Micheal", "8883330001");
        Contact samantha = new Contact("Samantha", "Sonny", "8888888888");
        Contact tommy = new Contact("Tommy", "Bear", "6132501003");
        Contact xena = null;

        ArrayList<Contact> test = new ArrayList<Contact>(Arrays.asList(alice, tommy, bobby,
                annabelle, samantha, samuel, alice));

        // initializing a contact list
        ContactList contactList = new ContactList();


        System.out.println("=== Testing Adding Names ===");
        // testing the add method
        for (Contact c : test) {
            contactList.add(c);
            System.out.println(contactList);
        }


        // Current contact list should be
        // Contact List: [Alice, Annabelle, Bobby, Samantha, Samuel, Tommy]


        /*if (contactList.toString()
                .equals("Contact List: [Alice, Annabelle, Bobby, Samantha, Samuel, Tommy]")) {
            System.out.println("=== Adding Names PASSED! === \n");
        } else {
            System.out.println("=== Adding Names FAILED! === \n");
        }*/


        System.out.println("=== Testing Removing Names ===");

        // testing the remove method
        contactList.remove(bobby);
        System.out.println(contactList);

        contactList.remove(alice);
        System.out.println(contactList);

        contactList.add(fred);
        System.out.println(contactList);

        contactList.add(xena);
        System.out.println(contactList);

        contactList.remove(tommy);
        System.out.println(contactList);

        contactList.remove(fred);
        System.out.println(contactList);

        contactList.remove(annabelle);
        System.out.println(contactList);

        contactList.remove(samantha);
        System.out.println(contactList);

        // Final contact list should be
        // Contact List: [Samuel, Xena]

        /*if (contactList.toString().equals("Contact List: [Samuel, Xena]")) {
            System.out.println("=== Removing Names PASSED! === \n");
        } else {
            System.out.println("=== Removing Names FAILED! === \n");
        }*/
    }
}

