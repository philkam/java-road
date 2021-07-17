package org.philip.loops;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //for loops
        int a =5;
//        for (int i =0; i<a; i++){
//            System.out.println("Hello");
//        }
//####################################################################################################
//        while(a<10){
//
//            a++;
//
//            if(a==8){
//                continue;
//            }
//            System.out.println("Hello");
//        }

//        do{
//            System.out.println("Hello");
//        }while(a<5);
//######################################################################################################
//        System.out.println("Please enter a number: ");
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        System.out.println("Answer : "+number);
//        System.out.println("PLease enter your name");
//        String name = scanner.next();
//        System.out.println("Name: "+name);
//############################################################################################
        Random random = new Random();
        int number = random.nextInt(30) +1;
        System.out.println("Random: " + number);
    }

}

