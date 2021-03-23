public class ContactsManager {
    Contact[] myList;
    int ContactsCount;

    ContactsManager() {
        this.ContactsCount = 0;
        this.myList = new Contact[500];

    }

    void addContact(Contact contact) {
        myList[ContactsCount] = contact;
        ContactsCount++;

    }

    Contact searchContact(String searchName) {

        for(int i = 0; i<ContactsCount;i++)

    {
        if (myList[i].Name.equals(searchName)) {
            return myList[i];
        }
    }return null;
}


}
