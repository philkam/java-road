package org.Philip.myapplication;

public class innerClass {
    private int age;
    private String color;

//you can access variables in the main class inside the inner class as in age.
    private class testInnerClass{
        private String name;

        public testInnerClass(String name) {
            this.name = name;
        }

        private void printAge(){
            System.out.println("Age: "+age);
        }
    }





}
