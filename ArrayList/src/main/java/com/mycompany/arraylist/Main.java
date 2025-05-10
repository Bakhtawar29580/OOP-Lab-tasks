package com.mycompany.arraylist;

import java.util.ArrayList;

class Employee{
    int id;
    String name;
    float salary;
    
    public Employee(int empId, String empName, float empSalary){
        id = empId;
        name = empName;
        salary = empSalary;
    }
    
    public void display(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class Main {
   
    public static void main(String[] args) {
        
        ArrayList<Employee> employees = new  ArrayList<>();
        employees.add(new Employee(1, "Ali", 9000));
        employees.add(new Employee(2, "Areeb", 4000));
        employees.add(new Employee(3, "Fawad", 20000));
        
        Employee highestpaid = employees.get(0);
        
        for(Employee emp : employees){
            if(emp.salary> highestpaid.salary){
                highestpaid = emp;
            }
        }
        
    System.out.println("Employee with the highest salary is: ");
    highestpaid.display();
   
    }
}
