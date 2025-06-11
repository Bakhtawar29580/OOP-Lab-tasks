package com.mycompany.temperatureconverter;

public class TemperatureConverter {
    private double temperature;
    
    public void setCelsius(double value){
        temperature = value;
        System.out.println("Temperature set in Celsius: " + temperature + " C");
    }
    
    public void setFahrenheit(double value){
        temperature = (value - 32) * 5 / 9;
        System.out.println("Temperature set in Fahrenheit (stored as Celsius): " + temperature + " C");
    }
    
    public void toFahrenheit(){
        double fahrenheit = (temperature * 9 / 5) + 32;
        System.out.println("Converted to Fahrenheit: " + fahrenheit + " F");
    }
    
    public void toCelsius(){
        System.out.println("Converted to Celsius (stored): " + temperature + " C");
    }
    
    public void showTemperature(){
        System.out.println("Stored Temperature (in Celsius): " + temperature + " C");
    }
    
    public static void main(String[] args) {
        TemperatureConverter t1 =  new TemperatureConverter();
        t1.setCelsius(37);
        t1.showTemperature();
        t1.toFahrenheit();
        
        t1.setFahrenheit(56);
        t1.showTemperature();
        t1.toCelsius();
    }
}
