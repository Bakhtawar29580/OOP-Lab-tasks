package com.mycompany.multipletimers;

import java.time.*;

public class MultipleTimers extends Thread {

    public void run() {
        try {
            Thread.sleep(2000); // 2 seconds
            System.out.println("Timer 1 finished after 2 seconds.");
        } catch (InterruptedException e) {
            System.out.println("Timer 1 interrupted.");
        }
    }

    public static void main(String[] args) {
        MultipleTimers m = new MultipleTimers();
        m.start();

        timer2 t2 = new timer2();
        t2.start();

        timer3 t3 = new timer3();
        t3.start();
    }
}

