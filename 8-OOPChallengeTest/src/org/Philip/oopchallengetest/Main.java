package org.Philip.oopchallengetest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        choice program = new choice();
        leftEye left = new leftEye("Left Eye", "Short Sighted", "Blue");
        rightEye right = new rightEye("Right Eye","Normal","Blue");
        heart heart = new heart("Heart", "Normal",65);
        stomach stomach = new stomach("Stomach", "PUD");
        skin skin = new skin("Skin", "Burned");






            System.out.println("Name: Tom");
            System.out.println("Age: 25");


         int option;


        do{
            program.programstarted();
            Scanner scanner = new Scanner(System.in);
            option = scanner.nextInt();

            if(option == 1){
                System.out.println("Name: " + left.getName());
                System.out.println("Medical Condition: "+left.getMedicalCondition());
                System.out.println("Color: "+left.getColor());
                left.closeEyes();
            }else if(option ==2){
                System.out.println("Name: " + right.getName());
                System.out.println("Medical Condition: "+right.getMedicalCondition());
                System.out.println("Color: "+right.getColor());
                right.closeREyes();
            }else if(option == 3){
                System.out.println("Name: "+heart.getName());
                System.out.println("Medical Condition: "+heart.getMedicalCondition());
                System.out.println("Heart Rate: "+heart.getHeartRate());
                heart.changerate();
            }else if(option==4){
                System.out.println("Name: "+stomach.getName());
                System.out.println("Medical Condition: "+stomach.getMedicalCondition());
                stomach.fed();
            }else if(option == 5){
                System.out.println("Name: "+skin.getName());
                System.out.println("Medical Condition: "+skin.getMedicalCondition());

            }else{

            }
        }while(option<6);


    }
}
