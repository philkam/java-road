package org.Philip.oopchallengetest;

import java.util.Scanner;

public class rightEye {
    String name;
    String medicalCondition;
    String color;

    public rightEye(String name, String medicalCondition, String color) {
        this.name = name;
        this.medicalCondition = medicalCondition;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMedicalCondition() {
        return medicalCondition;
    }

    public void setMedicalCondition(String medicalCondition) {
        this.medicalCondition = medicalCondition;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void closeREyes(){
        System.out.println("\t1. Close the Eye");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        if(option == 1){
            System.out.println("Right eye closed");
        }else {
            while (option != 1) {
                System.out.println("Choose an organ: ");
                System.out.println("\t1. Left Eye");
                System.out.println("\t2. Right Eye");
                System.out.println("\t3. Heart");
                System.out.println("\t4. Stomach");
                System.out.println("\t5. Skin");
                System.out.println("\t6. Exit");


                scanner = new Scanner(System.in);
                option = scanner.nextInt();
            }

        }

        }



}


