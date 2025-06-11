package com.mycompany.lightbulb;

public class LightBulb {
    private boolean isOn;
    
    public void turnOn(){
        isOn = true;
        System.out.println("Bulb is On.");
    }
    
    public void turnOff(){
        isOn = false;
        System.out.println("Bulb is off.");
    }
    
    public void ShowStatus(){
        if(isOn){
            System.out.println("Status: Bulb is currently On.");
        }else{
            System.out.println("Status: Bulb is currently Off.");
        }
    }
    
    public static void main(String[] args) {
        LightBulb L1 = new LightBulb();
        L1.turnOn();
        L1.ShowStatus();
        L1.turnOff();
        L1.ShowStatus();
    }
}
