package org.Philip.interfacesclasses;

public class Main {
    public static void main(String[] args) {
        CarInterface carInterface = new ElectricCar("Tesla");
        carInterface.start();
        carInterface.move(38);

        FossilFuelCar fossilFuelCar = new FossilFuelCar("Hyundai");
        fossilFuelCar.start();
        fossilFuelCar.move(87);
        fossilFuelCar.printName("Hey! ");


    }
}
