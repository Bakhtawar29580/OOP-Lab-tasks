package com.mycompany.clockdisplay;

import java.time.*;

public class ClockDisplay extends Thread {

    public void run(){
        while(true){
            System.out.println("Clock Display Time: " + java.time.LocalTime.of(5,30,5));
        }
    }
    
    public static void main(String[] args) {
        ClockDisplay c = new ClockDisplay();
        c.start();
        while(true){
            System.out.println("Clock Display Time in main: " + java.time.LocalTime.of(5,30,5));
        }
    }
}
