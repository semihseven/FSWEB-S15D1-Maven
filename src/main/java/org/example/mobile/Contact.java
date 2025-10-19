package org.example.mobile;

public class Contact {

    String name;
    String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public boolean equals(Object obj) {
        Contact c = (Contact) obj;
        return this.name.equals(c.getName()) && this.phoneNumber.equals(c.getPhoneNumber());
    }

    public static Contact createContact(String name, String phoneNumber) {
        return new Contact(name,phoneNumber);
    }
}
