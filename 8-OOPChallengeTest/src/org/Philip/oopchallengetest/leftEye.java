package org.Philip.oopchallengetest;

import java.util.Scanner;

public class leftEye {
    String name;
    String medicalCondition;
    String color;


    public leftEye(String name, String medicalCondition, String color) {
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



    public void closeEyes(){
        System.out.println("\t1. Close the Eye");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        if(option == 1){
            System.out.println("Left eye closed");
        }else{


        }

    }
}
