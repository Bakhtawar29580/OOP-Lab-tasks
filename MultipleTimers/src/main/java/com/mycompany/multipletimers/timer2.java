package com.mycompany.multipletimers;

public class timer2 extends Thread {

    public void run() {
        try {
            Thread.sleep(4000); // 4 seconds
            System.out.println("Timer 2 finished after 4 seconds.");
        } catch (InterruptedException e) {
            System.out.println("Timer 2 interrupted.");
        }
    }
}

