public class Main {

    public static void main(String[] args) {
        Contact search;
        ContactsManager myContactManager = new ContactsManager();
        Contact Contact1 = new Contact();
        Contact1.Name="Malik";
        Contact1.Email="Annonymous.com";
        Contact1.PhoneNumber= "090078601";
        Contact Contact2 = new Contact();
        Contact1.Name="Malik Khan";
        Contact1.Email="KhanAnnonymous.com";
        Contact1.PhoneNumber= "074490078601";
        Contact Contact3 = new Contact();
        Contact1.Name="Malik QADEER";
        Contact1.Email="QADEERAnnonymous.com";
        Contact1.PhoneNumber= "+955090078601";
        myContactManager.addContact(Contact1);
        myContactManager.addContact(Contact2);
        myContactManager.addContact(Contact3);
        System.out.println(myContactManager.ContactsCount);
//        search = myContactManager.searchContact("Malik");
//        System.out.print(search.Name + " : " + search.PhoneNumber + "\n");

    }
}
