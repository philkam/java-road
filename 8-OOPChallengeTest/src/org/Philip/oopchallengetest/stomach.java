package org.Philip.oopchallengetest;

import java.util.Scanner;

public class stomach {
    String name;
    String medicalCondition;

    public stomach(String name, String medicalCondition) {
        this.name = name;
        this.medicalCondition = medicalCondition;
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

    public void fed(){
        System.out.println("Need to be fed");
        System.out.println("\t1. Digest");
        Scanner scanner = new Scanner(System.in);
        int digest = scanner.nextInt();
        if(digest ==1){
            System.out.println("Digestion begins");
            //while loop continues
        }
    }
}
