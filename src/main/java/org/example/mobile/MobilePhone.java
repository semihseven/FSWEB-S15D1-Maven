package org.example.mobile;

import java.util.ArrayList;
import java.util.List;


public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber, List<Contact> myContacts) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>(myContacts);
    }

    public String getMyNumber() {
        return myNumber;
    }

    public ArrayList<Contact> getMyContacts() {
        return myContacts;
    }

    public boolean addNewContact(Contact contact) {
        if(findContact(contact)>=0) {
            return false;
        } else {
            myContacts.add(contact);
            return true;
        }
    }
    public boolean updateContact(Contact contactOld, Contact contactNew) {
        int i = findContact(contactOld);

        if(i>=0) {
            myContacts.set(i,contactNew);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeContact(Contact contact) {
        if(findContact(contact)>=0) {
            myContacts.remove(contact);
            return true;
        } else {
            return false;
        }
    }

    public int findContact (Contact contact) {
        return myContacts.indexOf(contact);
    }

    public int findContact (String name) {
        for(int i=0 ; i<myContacts.size(); i++) {
            if(myContacts.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
        for(int i=0 ; i<myContacts.size(); i++) {
            if(myContacts.get(i).getName().equals(name)){
                return myContacts.get(i);
            }
        }
        return null;
    }

    public void printContact(){
        System.out.println("Contact List: ");
        for(int i=0 ; i<myContacts.size(); i++) {
            System.out.println((i+1)+". "+myContacts.get(i).getName()+" -> "+myContacts.get(i).getPhoneNumber());
        }

    }
}

/*
findContact Contact türünde bir parametre alır ve int değer döndürür.
Dönüş değeri Contact objesinin listedeki indeksi olmalıdır. Eğer eleman listede yoksa -1 değeri döner.

findContact yukardaki findContact metodu ile aynı şekilde çalışır.
Sadece parametresinin tipi String olmalıdır.

queryContact String tipinde bir değer alır ve Contact türünde bir değer döndürür.
String parametre Contact ismini içerir.
Eğer ilgili isimdeki Contact listede varsa ilgili Contact objesini döndürür. Yoksa null döndürür

printContact parametre almaz return değeri de yoktur.
Contactların tamamını aşağıdaki formattaki gibi listeler. Contact List:
 */
