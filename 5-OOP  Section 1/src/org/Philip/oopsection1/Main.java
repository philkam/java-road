package org.Philip.oopsection1;

public class Main {
    public static void main(String[] args) {
        //constructor1
        Phone iPhone = new Phone("Samsung S20",24,53,11);

        //constructor2 - 2 constructors called polymorphism
        Phone pixel = new Phone("Pixel 3", 33);

        System.out.println(pixel.getName());


       // iPhone.name = "iPhone 11";
      //  System.out.println(iPhone.name);

       // iPhone.setName("iPhone 11");
        System.out.println(iPhone.getName());

        //iPhone.setCamera(11);
        System.out.println(iPhone.getCamera());

        //iPhone.setScreenSize(14);
        System.out.println(iPhone.getScreenSize());

       // iPhone.setMemoryRam(23);
        System.out.println(iPhone.getMemoryRam());






        iPhone.playMusic("Our God is Awesome");




    }
}
