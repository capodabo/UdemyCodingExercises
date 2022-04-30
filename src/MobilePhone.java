import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) < 0) {
            this.myContacts.add(contact);
            return true;
        }
        return false;
    }

    public boolean updateContact(Contact oldContact, Contact updatedContact) {
        if ((findContact(oldContact) < 0) || (findContact(updatedContact.getName()) != -1)) {
            return false;
        }
        this.myContacts.set(findContact(oldContact), updatedContact);
        return true;
    }

    public boolean removeContact(Contact contact) {
        if (findContact(contact) < 0) {
            return false;
        }
        this.myContacts.remove(contact);
        return true;
    }

    private int findContact(Contact contact) {
        if (myContacts.contains(contact)) {
            return this.myContacts.indexOf(contact);
        }
        return -1;
    }

    private int findContact(String name) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            if (this.myContacts.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
        if (findContact(name) < 0) {
            return null;
        }
        return this.myContacts.get(findContact(name));
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < this.myContacts.size(); i++) {
            System.out.println((i + 1) + ". " + this.myContacts.get(i).getName() + " -> " + this.myContacts.get(i).getPhoneNumber());
        }
    }
}
