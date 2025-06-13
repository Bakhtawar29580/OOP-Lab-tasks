package com.mycompany.employeee;


public class myProgram {    
    
    public static void main(String[] args) {
        
        Employeee emp = new Employeee();
        
        emp.calculateSal();  // Base salary

        emp = new Manager();
        emp.calculateSal();  // Manager salary

        emp = new developer();
        emp.calculateSal();  // Developer salary
        
      }   
}
