package com.mycompany.main9;

public class Employee {
        
        public void printDetails(int ID){
            System.out.println("Employee ID: " + ID);
        }
        
        public void printDetails(String name){
            System.out.println("Employee Name: " + name);
        }
        
        public void printDetails(int ID, String name){
            System.out.println("Employee ID: " + ID + ", Employee Name: " + name);
        }
}
