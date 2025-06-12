package com.mycompany.personn;

public class Personn {
    
    String name = "Bakhtawar";
    int age = 20;
    
    public void introduce(){
        System.out.println("Hello! My name is "+ name + " and I'm " + age + " years old.");
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.introduce();
    }
}
