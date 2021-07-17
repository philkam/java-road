package org.Philip.myapplication;

public class Main {
    public static void main(String[] args) {



        TestClass.name = "Philip";

        TestClass testclass = new TestClass(20, "Blonde");
        System.out.println("Name: "+testclass.getName());

        TestClass secondTestClass = new TestClass(200, "Brunette");
        System.out.println(secondTestClass.name);

        //When you use static, static belongs to the object itself therefore
        // you do not need to instantiate because they don't belong to the instances
        // of the object.
        secondTestClass.printSomething();





    }
}
