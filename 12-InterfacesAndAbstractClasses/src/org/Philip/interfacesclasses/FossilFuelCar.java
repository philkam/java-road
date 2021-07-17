package org.Philip.interfacesclasses;

public class FossilFuelCar implements CarInterface,TestInter{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FossilFuelCar(String name) {
        this.name = name;
    }

    @Override
    public void start() {
        System.out.println("The cylinder is causing the engine in the car to move");

    }

    @Override
    public void move(int speed) {
        System.out.println(this.getName() +" is moving at "+ speed +"mph");

    }

    @Override
    public void printName(String name) {
        System.out.println("This is fresh");
    }
}
