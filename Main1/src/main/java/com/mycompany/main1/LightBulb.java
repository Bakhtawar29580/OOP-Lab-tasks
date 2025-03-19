package com.mycompany.main1;

public class LightBulb {
    private boolean isOn = false;
    
    void turnOn(){
        isOn = true;
    }
    
    void turnOff(){
        isOn = false;
    }
    
    void showStatus(){
        System.out.println("Light is " + (isOn? "ON" : "OFF"));
    }
}
