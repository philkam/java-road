package org.Philip.oopchallengetest;

import java.util.Scanner;

public class heart {
    String name;
    String medicalCondition;
    int heartRate;

    public heart(String name, String medicalCondition, int heartRate) {
        this.name = name;
        this.medicalCondition = medicalCondition;
        this.heartRate = heartRate;
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

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public void changerate(){
        System.out.println("\t1. Change the heart rate");
        Scanner scanner = new Scanner(System.in);
        int heartRateChoice = scanner.nextInt();
        if(heartRateChoice==1) {
            System.out.println("Enter the new heart rate: ");
            scanner = new Scanner(System.in);
            int heartRate = scanner.nextInt();
            System.out.println("Heart Rate is changed to " + heartRate);

        }
    }
}
