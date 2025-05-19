package com.mycompany.mythread;

public class Mythread extends Thread{
    
    public void run(){
        for(int i = 1; i <=5; i++){
            System.out.println("From working thread: " + i);
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println("WorkerThread Interrupted");
            }
        }
    }

    public static void main(String[] args) {
        Mythread t = new Mythread();
        t.start();
        for(int i = 1; i <=5; i++){
            System.out.println("From Main: " + i);
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println("MainThread Interrupted");
            }
        }
    }
}