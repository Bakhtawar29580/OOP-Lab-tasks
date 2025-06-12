package com.mycompany.vehicle;

public class Vehicle {
    
    public void startEngine(){
        System.out.println("The vehicle engine starts");
    }  

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.honk();
        c1.startEngine();
    }
}
