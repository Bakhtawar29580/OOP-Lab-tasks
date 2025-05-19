package com.mycompany.thread;

public class MyThreadEg extends Thread{
    public void run(){
        for(int i = 1; i<= 5; i++ ){
            System.out.println("From mythread: " + i);
        }
    }

    public static void main(String[] args) {
        MyThreadEg t = new MyThreadEg();
        t.start();
        for(int i = 1; i<= 5; i++ ){
            System.out.println("From Main: " + i);
        }
    }
}
