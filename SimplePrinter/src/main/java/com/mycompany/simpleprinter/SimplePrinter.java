package com.mycompany.simpleprinter;

public class SimplePrinter extends Thread {
    
    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println("Hello from thread! "+ i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("SimplePrinter interrupted.");
            }
        }
    }

    public static void main(String[] args) {
        SimplePrinter p = new SimplePrinter();
        p.start();
        for(int i = 1; i <= 5; i++){
            System.out.println("Hello from Main! "+ i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("MainPrinter interrupted.");
            }
       }
    }
}
