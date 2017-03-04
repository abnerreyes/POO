/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno
 */
import java.util.Scanner;

public class test {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {
        
      boolean quit = false;
        int option = 0;
        printOptions();
        while (!quit) {
            System.out.println("Please, Pick an option from the menu: ");
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 0:
                    printOptions();
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNew();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printOptions() {
        System.out.println("Press ");
        System.out.println("0 - Display menu options.");
        System.out.println("1 - Display contacts list.");
        System.out.println("2 - Add a new contact.");
        System.out.println("3 - Update a contact in the list.");
        System.out.println("4 - Remove a contact in the list.");
        System.out.println("5 - Search for a contact in the list.");
        System.out.println("6 - To exit.");
    }

    public static void addNew() {
        System.out.println("Please enter contact name: ");
        String name = scanner.nextLine();
        System.out.println("Please enter contact number: ");
        String number = scanner.nextLine();
        Contact newContact = Contact.createContact(name, number);
        if (mobilePhone.addNew(newContact)) {
            System.out.println("New contact added: Name: " + name + ". Phone: " + number);
        } else {
            System.out.println(name + " Contact is already on the list.");
        }
    }

    public static void updateContact() {
        System.out.println("Enter the existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.searchContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact number: ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if (mobilePhone.updateContact(existingContact, newContact)) {
            System.out.println("Contact updated successfully.");
        } else {
            System.out.println("Updating error, try again.");
        }
    }

    public static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.searchContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found.");
            return;
        }
        if (mobilePhone.removeContact(existingContact)) {
            System.out.println("Contact was successfully deleted.");
        } else {
            System.out.println("Deleting error, try again.");
        }
    }

    public static void searchContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.searchContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Name: " + existingContact.getName() + ", Phone: " + existingContact.getNumber());
    }
}