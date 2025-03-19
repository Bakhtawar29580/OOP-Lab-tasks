package com.mycompany.main5;

public class Main5 {

    public static void main(String[] args) {
        TemperatureConverter t1= new TemperatureConverter();
        
        t1.setCelsius(25);
        t1.showTemperature();
        System.out.println("Converted to Fahrenheit: " + t1.toFahrenheit() + " F");
        
        t1.setFahrenheit(77);
        t1.showTemperature();
        System.out.println("Converted to Celsuis: " + t1.toCelsius() + " C");
    }
}
