package org.Philip.oopsection2;

public class Main {
    public static void main(String[] args) {
        Bird Phoenix = new Bird("Chicken", "Red", 23, false, 3);

        System.out.println(Phoenix.getColor());
        System.out.println(Phoenix.getWings());
        Phoenix.eat("Grains");

        //Polymorphism
        Phoenix.fly();
        Phoenix.fly(33);

        Dog bullDog = new Dog("Bingo", "Black",44, true);
        System.out.println(bullDog.getLegs());
        bullDog.eat("Meat");


    }
}

//Inheritance
//Creating an animal class
//Extending the objects and properties of parent class, (animal), to the child classes (dog and bird )
//since they are all animals.

//Polymorhism
//Two constructors in the same class
//Override an object in a class to make changes to the method like method eat in bird.
//creating two similar objects but passing arguments to one and leaving the other