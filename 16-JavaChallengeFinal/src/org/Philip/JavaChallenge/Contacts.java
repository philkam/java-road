package org.Philip.JavaChallenge;

import java.util.ArrayList;

public class Contacts {
     String name;
     String number;
     String email;
    ArrayList<Messages> message;

   public Contacts(String name, String number, String email, ArrayList<Messages> message) {
      this.name = name;
      this.number = number;
      this.email = email;
      this.message = message;
   }

   public Contacts(String name, String number, String email) {
      this.name = name;
      this.number = number;
      this.email = email;
   }

   public void getDetails(){
      System.out.println("Name: " + this.name +
              "\nNumber: "+ this.number+
              "\nEmail: " +this.email);
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }



   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public ArrayList<Messages> getMessage() {
      return message;
   }

   public void setMessage(ArrayList<Messages> message) {
      this.message = message;
   }
}
