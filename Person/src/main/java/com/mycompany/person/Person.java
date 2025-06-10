package com.mycompany.person;

public class Person {
    
    String name;
    int age;
    
    public void displaytInfo(){
            System.out.println("My name is " + name + " and I'm " + age + " years old");
        }  
    
    public static void main(String[] args) {
              Person p1= new Person();
              p1.name = "Bakhtawar";
              p1.age = 20;
              
              Person p2 = new Person();
              p2.name = "Aimen";
              p2.age = 22;
              
              p1.displaytInfo();
              p2.displaytInfo();
    }
}
