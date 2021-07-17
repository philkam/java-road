package org.Philip.arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String[] students = new String[5];
//        students[0] = "Philip";
//        students[1] = "Phyllis";
//        students[2] = "Janet";
//        students[3] = "Ali";
//        students[4] = "Osman";
//
//    //    System.out.println(students[3]);
//
//        String[] employees = {"Jacob", "Sam", "Martin", "Ken"};
//        int[] numbers = {1,2,3,4,5,6};
//
//        for(int i=0; i<numbers.length; i++){
//            System.out.println(numbers[i]);
//        }


        String[] names = {"Keren", "Kezia", "kesha", "Kandy"};
        int[] telNum = {3234, 2441, 2122, 2341};


        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("Please enter a name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        for(int i=0; i <names.length; i++) {
            if (name.equals(names[i])) {
                System.out.println(telNum[i]);
            }
        }
    }
}
