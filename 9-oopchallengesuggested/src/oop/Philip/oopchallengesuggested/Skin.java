package oop.Philip.oopchallengesuggested;

public class Skin extends organ {
    private String color;
    private int softness;

    public Skin(String name, String medicalCondition, String color, int softness) {
        super(name, medicalCondition);
        this.color = color;
        this.softness = softness;
    }

    @Override
    public void getDetails() {
        super.getDetails();

        System.out.println("Color: "+this.getColor());

    }

    public String getColor() {
        return color;
    }

}
