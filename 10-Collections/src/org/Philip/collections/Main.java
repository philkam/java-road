package org.Philip.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {


//        /*
//        In using arraylist you cannot use a primitive data type like int.
//        You can use Integer class for int. Use Double, Long, Float.
//
//
//
//         */
//        ArrayList<String>  names = new ArrayList<>();
//        //List<String> names = new ArrayList<>();
        
//        //Add to the array list
//        names.add("Meisam");
//        names.add("Phyllis");
//
//        //Get elements in the array list
//        System.out.println(names.get(0));
//
//        //get the size of the array list
//        System.out.println(names.size());
//
//        //clear all elements in the array list
//        //names.clear();
//
//        //remove first element in the array
//        //names.remove("Meisam");
//
//        System.out.println(names.get(0));
//
//        //Check if an element is in array list
//        System.out.println(names.contains("Phyllis"));
//
//        //names.remove("Phyllis");
//
//
//        //Check if array list is empty
//        System.out.println(names.isEmpty());
//
//        //System.out.println(names.indexOf("Phyllis"));
//
//        //You can sort array list alphabetically by:
//        //names.sort
//
//        for(int i =0; i< names.size();i++){
//            System.out.println(names.get(i));
//        }



        Map<String, String> emailList = new HashMap<>();
        emailList.put("Philip", "philipA@gmail.com");
        emailList.put("Phyllis", "phyllis@gmail.com");
        System.out.println(emailList.get("Philip"));
        System.out.println(emailList.size());
        emailList.remove("Philip");
        System.out.println(emailList.size());
        System.out.println(emailList.containsKey("Phyllis"));
        System.out.println(emailList.containsValue("phyllis@gmail.com"));

        //using objects in array list
        ArrayList<Student> student = new ArrayList<>();
        student.add(new Student("Philip", 1111));
        student.add(new Student("Keren", 222));
        //for each loop
        for (Student s: student){
            System.out.println(s.getName());
        }









//        String[] names = new String[5];
//        String[] name = {"Precious", "Kingsley", "Meisan", "Doaa", "Pack"};
//        System.out.println(name[3]);
//
//        //New array to take 6 elements
//        String[] newNames = new String[6];
//
//
//        //Reading names into array and saving them in the new names
//        for(int i =0; i< name.length;i++){
//            newNames[i]=name[i]  ;
//
//        }
//        newNames[5] = "Jerry";
//        System.out.println(newNames[5]);




    }
}
