package org.Philip.oopsection2;

public class Bird extends Animal{

    private int wings;


    public Bird(String name, String color, int legs, boolean hasTail,int wings){
        super(name,color,legs,hasTail);
        this.wings = wings;
    }

    @Override
    public void eat(String food) {
       // super.eat(food);
        System.out.println("C'est fini the " + food);
    }

    public void setWings(int wings){
        this.wings = wings;
    }

    public int getWings(){
        return wings;
    }

    public void fly(){
        System.out.println(this.getName() + " is flying");
    }

    public void fly(int speed){
        System.out.println("My speed " + speed);
    }



}
