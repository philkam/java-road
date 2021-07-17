package org.philip.helloworld;

public class hello {
    public static void main(String[] args) {
//        System.out.print("Hello world");
//        System.out.println("Hello world");
//        //Todo Do something so you don't forget.
//
//         #Variables in Java
//        int number = -5;
//        System.out.println(number); // up to 2^31
//
//        long myLong = 5;
//        System.out.println(myLong); // up to 2 ^ 63
//
//        double myDouble = 4.5;
//        System.out.println(myDouble); //bigger than float
//
        float myFloat =  (float) 4.5;
        System.out.println(myFloat);
//
//        char myChar = '\u00AE';// 'M';
//        System.out.println(myChar);
//
//        String name = "Philip Marfo";
//        System.out.println(name);
//
//        boolean myBoolean = true;
//        System.out.println(myBoolean);


 //     #Arithmetic operations
        int a =5;
        int b = 2;
        int ans = a+b;
        int answ = a-b;
        int answe = a*b;
        double answer =  (double) a/b; //cast to a double to get decimal places
        int modulo = a%b;

        System.out.println(ans);
        System.out.println(answ);
        System.out.println(answe);
        System.out.println(answer);
        System.out.println(modulo);

        String firstName = "Philip ";
        String secondName = "Marfo";
        String name =  firstName +secondName;
        System.out.println(name);
    }
}

