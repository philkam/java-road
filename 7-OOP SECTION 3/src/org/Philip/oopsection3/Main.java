package org.Philip.oopsection3;

public class Main {
    public static void main(String[] args) {
       // Engine engine = new Engine("Renault", 8000);
        Car mercedes = new Car("Mercedes Benz", 4, "Black", new Engine("Renault",8000));

        System.out.println(mercedes.getColor());

        Engine engine = mercedes.getEngine();
        System.out.println("Engine revolutions per minute are: " + engine.getRpm());

        System.out.println("Engine model: "+mercedes.getEngine().getModel());

//The keyword null in Java means empty
//        Car mercedes = null;
//        if (mercedes != null){
//            System.out.println();
//        }else{
//            System.out.println("The car is empty");
//        }

//// The final keyword does not allow you to change the assign variable in other part of the program.
//        final int a = 5;
//        a += 5;
//Here, you cannot assign new values to the arguments in engine1 because of the final keyword
//but you can use .setRpm to assign a new value to the rpm
//        final Engine engine1 = new Engine("Honda", 1000);
//        engine1 = new Engine("Passat", 2234);
//        engine1.setRpm(3000);

    }
}

/*
COMPOSITION
The use of one class in other classes. Class Engine was used in class Car.
 */