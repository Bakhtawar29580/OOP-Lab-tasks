package com.mycompany.mai;

public class Person {
    
    public void print(){
        final String name = "Bakhtawar";
        System.out.println("My name is " + name);
        name = "lina";
    }
}


public class Main{
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.print();
    }
}