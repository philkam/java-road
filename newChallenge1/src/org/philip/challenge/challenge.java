package org.philip.challenge;

import java.util.Random;
import java.util.Scanner;

public class challenge {
    public static void main(String[] args) {
        //Welcome the user
        System.out.println("Welcome to my game");

        //Ask for user's name.
        System.out.println("Please enter Your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Welcome" + name);

        //Should we start the game?
        System.out.println("Should we start the game?");
        System.out.println("May we begin? \n" +
                "1. Yes \n" +
                "2. No ");

        int begin = scanner.nextInt();

        //Asking for Approval
        while(begin !=1){
            System.out.println("May we begin? \n" +
                    "1. Yes \n" +
                    "2. No");

             begin = scanner.nextInt();
        }

        //Generate a random number
        Random random = new Random();
        int randNum = random.nextInt(30)+1; //from 1 to 30

        //Ask for user's input
        System.out.println("Please guess a number");
        int userInput = scanner.nextInt();

        int numberOfTries = 0;
        boolean hasFinished = false;
        boolean hasWon = false;

        while (!hasFinished){

            numberOfTries++;


            if(numberOfTries < 10){
                if(userInput == randNum){
                    hasFinished = true;
                    hasWon = true;
                }else if(userInput > randNum){
                    System.out.println("Please guess lower");
                    userInput = scanner.nextInt();

                }else{
                    System.out.println("Please guess higher");
                    userInput = scanner.nextInt();

                }
            }else {
                hasFinished = true;
            }


        }
        if(hasWon){
            System.out.println("Congratulations. You have won the game");
        }else{
            System.out.println("Better luck next time champ");
        }

    }
}




