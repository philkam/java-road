package org.Philip.JavaChallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Contacts> contact;
    static Scanner scanner = new Scanner(System.in);
    private static int id =0;

    public static void main(String[] args) {
        contact = new ArrayList<>();
        System.out.println("Hello welcome to my contact simulation app");
        showOptions();

    }

    private static void manageMessages() {
        System.out.println("Please select an option" +
                "\n\t1. Show all messages" +
                "\n\t2. Send a message" +
                "\n\t3. Go back to previous menu");
        int select = scanner.nextInt();
        switch(select){
            case 1:
                showMessages();
                break;
            case 2:
                sendMessage();
                break;
            default:
                showOptions();
                break;
                
        }
        
    }

    private static void sendMessage() {
        System.out.println("Who are you going to send the message to?");
        String name = scanner.next();
        if(name.equals("")){
            System.out.println("Please enter a name ");
            sendMessage();
        }else{
            boolean doesExist = false;
            for (Contacts c: contact){
                if(c.getName().equals(name)){
                    doesExist = true;
                }
            }
            if(doesExist){
                System.out.println("What do you want to tell the person?");
                String text = scanner.next();
                if(text.equals("")){
                    System.out.println("Please enter some text");
                    sendMessage();
                }else{
                    id++;
                    Messages newMessage = new Messages(text, name,id);
                    for(Contacts c: contact){
                        if(c.getName().equals(name)){
                            ArrayList<Messages> newMessages = new ArrayList<>();
                            newMessages.add(newMessage);
                            c.setMessage(newMessages);
                            System.out.println("Message added successfully");
                        }
                    }


                }
            }else{
                System.out.println("There is no such contact");
            }
        }
        showOptions();



    }

    private static void showMessages() {
        ArrayList<Messages> allMessages = new ArrayList<>();
        for(Contacts c: contact){
            allMessages.addAll(c.getMessage());



            if (allMessages.size() > 0) {
                for(Messages m: allMessages){
                    m.getDetails();
                    System.out.println("**************");
                }
            }else {
                System.out.println("You don't have any messages");
            }

        }
        showOptions();
    }

    private static void showOptions() {
        System.out.println("Please select one:" +
                "\n\t1. Contacts" +
                "\n\t2. Messages" +
                "\n\t3. Exit");

        int select = scanner.nextInt();
        switch(select){
            case 1:
                manageContacts();
                break;
            case 2:
                manageMessages();
                break;
            case 3:
                break;
            default:
                showOptions();
                break;

        }

    }

    private static void manageContacts() {
        System.out.println("\t1. Show all contacts" +
                "\n\t2. Add a new contact" +
                "\n\t3. Search for a contact" +
                "\n\t4. Delete a contact" +
                "\n\t5. Go back to previous menu");
        int select = scanner.nextInt();
        switch(select){
            case 1:
                showContact();
                break;
            case 2:
                addContact();
                break;
            case 3:
                searchContact();
                break;
            case 4:
                deleteContact();
                break;
            default:
                showOptions();
                break;

        }

    }

    private static void deleteContact() {
        System.out.println("Enter the contact's name");
        String name = scanner.next();
        if(name.equals("")){
            System.out.println("Please enter the name");
            deleteContact();
        }else{
            boolean doesExist = false;

            for(Contacts c: contact) {
                if (c.getName().equals(name)) {
                    doesExist = true;
                    contact.remove(c);


                    System.out.println("Contact successfully removed");
                }
            }
            if(!doesExist){
                System.out.println("There is no such contact");
            }

        }
        showOptions();

    }

    private static void searchContact() {
        System.out.println("Please enter the contacts name");
        String name = scanner.next();
        for(Contacts c: contact){
            boolean doesExist = false;
            if(c.getName().equals(name)){
                doesExist = true;
                c.getDetails();
            }else{
                doesExist = false;
            }
            if(!doesExist){
                System.out.println("Contact doesn't exist");
            }

        }
        showOptions();
    }

    private static void showContact() {
        if(contact.isEmpty()){
            System.out.println("Your contact is empty");
        }else{
            for(Contacts c: contact){
                c.getDetails();
                System.out.println("********************");
            }
        }
        showOptions();

    }

    private static void addContact() {

        System.out.println("Enter your new contact" +
                "\nEnter the name of the contact");
        String name = scanner.next();
        System.out.println("Enter your number");
        String number = scanner.next();
        System.out.println("Enter your email");
        String email = scanner.next();


        if(name.equals("")||number.equals("")||email.equals("")){
            System.out.println("Please fill in the blanks");
            addContact();
        }else{
            Contacts cont = new Contacts(name, number, email);
            contact.add(cont);
            System.out.println("Contact added successfully");
        }
        showOptions();

    }
}
