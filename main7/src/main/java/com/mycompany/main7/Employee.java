package com.mycompany.main7;

public class Employee {
  
    int salary = 3000;

    public void calculateSalary() {
        System.out.println("Base Salary : $" + salary);
    }
}

class Manager extends Employee {
    @Override
    public void calculateSalary() {
        int managerBaseSalary = 5000;
        System.out.println("Manager Salary : $" + managerBaseSalary + " + Bonus");
    }
}

class Developer extends Employee {
    @Override
    public void calculateSalary() {
        int developerBaseSalary = 4000;
        System.out.println("Developer Salary : $" + developerBaseSalary + " Project Allowance + Bonus");
    }   
}