package com.mycompany.multipletimers;

public class timer3 extends Thread {

    public void run() {
        try {
            Thread.sleep(6000); // 6 seconds
            System.out.println("Timer 3 finished after 6 seconds.");
        } catch (InterruptedException e) {
            System.out.println("Timer 3 interrupted.");
        }
    }
}
