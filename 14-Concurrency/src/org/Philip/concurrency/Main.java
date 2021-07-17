package org.Philip.concurrency;

public class Main {
    public static void main(String[] args) {
        int a =0;
        int b = 2;
        try{
            System.out.println(b/a);
        }catch (ArithmeticException e){
            System.out.println(" Divide by 0 doesn't work man!");
        }

        String name = null;
        try{

            name.equals("Phyllis") ;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("C'est ne travaille pass");
        }




//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                //System.out.println("Hey there");
//                for(int i=0; i<5;i++){
//                    System.out.println("Printing in the " + i + " worker thread");
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//
//            }
//        });
//        thread.start();
//        for(int i=0; i<5;i++){
//            System.out.println("Printing in the " + i + " main thread");
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
    }
}
