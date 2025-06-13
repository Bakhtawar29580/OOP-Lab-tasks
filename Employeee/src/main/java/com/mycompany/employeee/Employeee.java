package com.mycompany.employeee;

public class Employeee {
    
    public void calculateSal(){
        System.out.println("Base Salary: $3000");
    }
}
    
    class Manager extends Employeee{
        @Override
       public void calculateSal(){
         System.out.println("Manager Salary: $5000 + Bonus");
       } 
    }

    class developer extends Employeee{
      @Override
      public void calculateSal(){
        System.out.println("Developer Salary: $4000 + Project Allowance");
      }        
    }
