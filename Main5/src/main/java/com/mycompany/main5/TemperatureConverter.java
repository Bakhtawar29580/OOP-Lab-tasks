package com.mycompany.main5;

public class TemperatureConverter {
    private double temperature;
    private boolean isCelsuis;
    
    void setCelsius(double value){
        temperature = value;
        isCelsuis = true;
    }
    
    void setFahrenheit(double value){
        temperature = value;
        isCelsuis = false;
    }
    
    double toFahrenheit(){
        if(isCelsuis){
            return(temperature * 9/5) + 32;
        }
        return temperature;
    }
    
    double toCelsius(){
        if(isCelsuis){
            return(temperature - 32) * 5/9;
        }
        return temperature;
    }
    
    void showTemperature(){
        if(isCelsuis){
            System.out.println("Stored Temperature: " + temperature + " C");
        }else{
            System.out.println("Stored Temperature: " + temperature + " F");
        }
    }   
}