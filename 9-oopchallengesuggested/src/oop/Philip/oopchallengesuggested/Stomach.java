package oop.Philip.oopchallengesuggested;

public class Stomach extends organ {
    private boolean isEmpty;

    public Stomach(String name, String medicalCondition, boolean isEmpty) {
        super(name, medicalCondition);
        this.isEmpty = isEmpty;
    }


    public void digest(){
        System.out.println("Digesting begins");
    }

    @Override
    public void getDetails() {
        super.getDetails();

        if(this.isEmpty()){
            System.out.println("Need to be fed");
        }else{
            System.out.println("Stomach is empty");
        }
    }

    public boolean isEmpty() {
        return isEmpty;
    }


}
