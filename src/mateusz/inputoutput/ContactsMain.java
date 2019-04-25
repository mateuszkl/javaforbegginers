package mateusz.inputoutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ContactsMain {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("contacts.csv"))) {

            List<Contact> contactList = new ArrayList<>();

            String line;

            while ((line = br.readLine()) != null) {
                String[] values = line.split(";");
                contactList.add(new Contact(values[0], values[1], values[2]));
            }

            System.out.println("number of contacts: " + contactList.size());

            for (Contact contact : contactList) {
                System.out.println("name: " + contact.getName() + ", number: " + contact.getNumber()  + ", email: " + contact.getEmail());
            }

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
