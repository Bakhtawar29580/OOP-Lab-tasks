package com.mycompany.countdowntimer;

public class CountdownTimer extends Thread{
    
    public void run(){
        for(int i = 10; i >= 1; i--){
            System.out.println("CountdownTimer: "+ i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("CountdownTimer interrupted.");
            }
        }
    }

    public static void main(String[] args) {
       CountdownTimer c = new CountdownTimer();
       c.start();
        for(int i = 10; i >= 1; i--){
            System.out.println("CountdownTimer Main: "+ i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("CountdownTimer interrupted.");
            }
        }
    }
}
