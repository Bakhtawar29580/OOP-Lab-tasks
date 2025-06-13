package com.mycompany.employ;

public class Employ {
    
    void printDetails(int id){
        System.out.println("Employee ID: " + id);
    }
    
    void printDetails(String name){
        System.out.println("Employee Name: " + name);
    }
    
    void printDetails(int id, String name){
        System.out.println("Employee Name: " + name + " & Employee ID: " + id);
    }
    
    public static void main(String[] args) {
        Employ e1 = new Employ();
        e1.printDetails(123);
        e1.printDetails("Bakhtawar");
        e1.printDetails(1234, "Aimen");
    }
}
