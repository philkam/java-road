package oop.Philip.oopchallengesuggested;

public class organ {
    private String name;
    private String medicalCondition;




    public void getDetails(){
        System.out.println("Name: "+this.getName());
        System.out.println("Medical Condition: "+getMedicalCondition());
    }

    public String getName() {
        return name;
    }


    public String getMedicalCondition() {
        return medicalCondition;
    }

    public organ(String name, String medicalCondition) {
        this.name = name;
        this.medicalCondition = medicalCondition;


    }
}
