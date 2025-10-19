package org.example;

import org.example.mobile.Contact;
import org.example.mobile.MobilePhone;
import org.example.models.Grocery;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        //Grocery grocery = new Grocery();
        //grocery.startGrocery();
        ArrayList<Contact> contacts = new ArrayList<>();

        contacts.add(new Contact("Semih","111111"));
        contacts.add(new Contact("Seven","2222222"));
        contacts.add(new Contact("Ali","3333333"));

        MobilePhone phone = new MobilePhone("444444", contacts);

        System.out.println(phone.findContact("Semih"));

    }
}
