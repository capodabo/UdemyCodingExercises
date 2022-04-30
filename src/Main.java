import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void printActions() {
        System.out.println("\nYour options are:");
        System.out.println("\t 1. Add a contact");
        System.out.println("\t 2. Update a contact");
        System.out.println("\t 3. Remove a contact");
        System.out.println("\t 4. Query if a contact exists in the list");
        System.out.println("\t 5. Print your contacts list");
        System.out.println("\t 0. Exit the application");

    }

    public static void main(String[] args) {

        System.out.print("Please enter your phone number: ");
        String phoneNumber = scanner.nextLine();
        MobilePhone mobilePhone = new MobilePhone(phoneNumber);
        System.out.println("Contacts list was created for phone number " + phoneNumber + ".");

        boolean runProgram = true;

        while (runProgram) {
            System.out.print("\nPlease enter a number to select an action or enter 6 to view your options: ");
            if (scanner.hasNextInt()) {
                int caseNumber = scanner.nextInt();
                scanner.nextLine();

                switch (caseNumber) {
                    case 1:
                        // Solution 1:
/*
                        System.out.print("Please enter a name for your new contact: ");
                        String newContactName = scanner.nextLine();
                        System.out.print("Please enter a number for your new contact: ");
                        String newContactNumber = scanner.nextLine();
                        Contact contact = Contact.createContact(newContactName, newContactNumber);

                        if (mobilePhone.addNewContact(contact)) {
                            System.out.println("The contact with name " + newContactName + " and number " + newContactNumber + " was added to your contacts list.");
                        } else {
                            System.out.println("Cannot add contact with name " + newContactName + ". This name is already in your contacts list.");
                        }
                        break;
*/

                        // Solution 2:
                        System.out.print("Please enter a name for your new contact: ");
                        String newContactName = scanner.nextLine();

                        if (mobilePhone.queryContact(newContactName) == null) {
                            System.out.print("Please enter a number for your new contact: ");
                            String newContactNumber = scanner.nextLine();
                            Contact contact = Contact.createContact(newContactName, newContactNumber);
                            mobilePhone.addNewContact(contact);
                            System.out.println("The contact with name " + newContactName + " and number " + newContactNumber + " was added to your contacts list.");
                        } else {
                            System.out.println("Cannot add contact with name " + newContactName + ". This name is already in your contacts list.");
                        }
                        break;

                    case 2:
                        //Solution 1:
/*
                        System.out.print("Please enter the name of the contact you would like to update: ");
                        String oldContactName = scanner.nextLine();
                        System.out.print("Please enter the new name for this contact: ");
                        String updatedContactName = scanner.nextLine();
                        System.out.print("Please enter the new number for this contact: ");
                        String updatedContactNumber = scanner.nextLine();
                        Contact oldContact = mobilePhone.queryContact(oldContactName);
                        Contact updatedContact = Contact.createContact(updatedContactName, updatedContactNumber);

                        if (mobilePhone.updateContact(oldContact, updatedContact)) {
                            System.out.println("The contact with name " + oldContactName + " and phone number " + oldContact.getPhoneNumber() + " was updated.");
                            System.out.println("The new name for this contact is " + updatedContactName + " and the new number is " + updatedContactNumber + ".");
                        } else {
                            System.out.println("The contact with name " + oldContactName + " was not updated.");
                        }
                        break;
*/

                        // Solution 2:
                        System.out.print("Please enter the name of the contact you would like to update: ");
                        String oldContactName = scanner.nextLine();

                        if (mobilePhone.queryContact(oldContactName) == null) {
                            System.out.println("Cannot update contact. A contact with name " + oldContactName + " does not exist in your contacts list.");
                        } else {
                            System.out.print("Please enter the new name for this contact: ");
                            String updatedContactName = scanner.nextLine();
                            if (mobilePhone.queryContact(updatedContactName) == null) {
                                System.out.print("Please enter the new number for this contact: ");
                                String updatedContactNumber = scanner.nextLine();
                                Contact oldContact = mobilePhone.queryContact(oldContactName);
                                Contact updatedContact = Contact.createContact(updatedContactName, updatedContactNumber);
                                mobilePhone.updateContact(oldContact, updatedContact);
                                System.out.println("The contact with name " + oldContactName + " and phone number " + oldContact.getPhoneNumber() + " was updated.");
                                System.out.println("The new name for this contact is " + updatedContactName + " and the new number is " + updatedContactNumber + ".");
                            } else {
                                System.out.println("Cannot update contact. A contact with name " + updatedContactName + " already exists in your contacts list.");
                            }
                        }
                        break;

                    case 3:
                        System.out.print("Please enter the name of the contact you would like to remove: ");
                        String removeContact = scanner.nextLine();
                        Contact removedContact = mobilePhone.queryContact(removeContact);

                        if (mobilePhone.removeContact(removedContact)) {
                            System.out.println("The contact with name " + removeContact + " was removed from your contacts list.");
                        } else {
                            System.out.println("The contact with name " + removeContact + " could not be removed because it was not found in your contacts list.");
                        }
                        break;

                    case 4:
                        System.out.print("Please enter the name of the contact to search for: ");
                        String queryContact = scanner.nextLine();
                        Contact checkContact = mobilePhone.queryContact(queryContact);

                        if (mobilePhone.queryContact(queryContact) == null) {
                            System.out.println("The contact with name " + queryContact + " was not found in your contacts list.");
                        } else {
                            System.out.println("The contact with name " + checkContact.getName() + " was found in contacts list with the number " + checkContact.getPhoneNumber() + ".");
                        }
                        break;

                    case 5:
                        mobilePhone.printContacts();
                        break;

                    case 6:
                        printActions();
                        break;

                    case 0:
                        System.out.println("Exiting the application...");
                        runProgram = false;
                        break;

                    default:
                        System.out.print("This option is not available.");
                        break;
                }
            } else {
                scanner.nextLine();
                System.out.print("This was an invalid entry.");
            }
        }
        scanner.close();
        System.out.println("Program terminated.");
    }
}
