package com.mycompany.main7;

public class Main7 {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.calculateSalary();

        Manager m1 = new Manager();
        m1.calculateSalary();

        Developer d1 = new Developer();
        d1.calculateSalary();
    }
}