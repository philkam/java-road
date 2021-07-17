package org.Philip.game;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //welcome the user

        System.out.println("Welcome to this Game");

        //Asking for the name
        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello " + name);

        //Should we start this game
        System.out.println("May we begin?");
        System.out.println("\t1. Yes");
        System.out.println("\t2. No");

        int startgame = scanner.nextInt();


        //Asking for approval
        while (startgame != 1){
            System.out.println("May we begin?");
            System.out.println("\t1. Yes");
            System.out.println("\t2. No");

            startgame = scanner.nextInt();
        }

        //Random number generation
        Random random = new Random();
        int randomNumber = random.nextInt(200)+1;
        System.out.println("Please guess a number from 1 to 200");
        int userInput = scanner.nextInt();

        int NumberOfTries = 0;
        boolean hasWon = false;
        boolean hasFinished = false;

        while (!hasFinished){
            NumberOfTries++;

            if(NumberOfTries <10){
                if(userInput == randomNumber){
                    hasFinished = true;
                    hasWon =true;
                }else if(userInput > randomNumber){
                    System.out.println("Guess lower");
                    userInput = scanner.nextInt();
                }else{
                    System.out.println("Guess higher");{
                        userInput = scanner.nextInt();
                    }
                }

            }else{
                hasFinished = true;
            }
        }


        if (hasWon){
            System.out.println("Congratulations! You have won");
        }else{
            System.out.println("You have lost! Game Over. The number is " + randomNumber);
        }


    }
}

















//############ ##########################################################################################
//MYCODE
//        System.out.println("Hello, should we start this game?");
//        System.out.println("Enter 1 to continue or 0 to exist");
//        int number = scanner.nextInt();
//        if (number == 1) {
//            System.out.println("we are proceeding");
//
//            //Generating a random number
//            Random random = new Random();
//            int rnumber = random.nextInt(20) + 1;
//            System.out.println("Random number: " + rnumber);
//
//            System.out.println("Guess a random number between 1 and 20");
//            int user_input = scanner.nextInt();
//            System.out.println("Your random number is:  " + user_input);
//            int a = 5;
//
//            if (user_input == rnumber) {
//                System.out.println("Congratulations " + name);
//            } else {
//                while (a==5) {
//                    if(user_input != rnumber)
//                    System.out.println("Try again");
//                    user_input = scanner.nextInt();
//                    System.out.println("Your random number is:  " + user_input);
//                    a++;
//
//                }
//
//
//            }
//
//
//        } else {
//            System.out.println("Program terminated");
//        }
//    }
//    }



