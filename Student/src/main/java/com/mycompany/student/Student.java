package com.mycompany.student;

public class Student {
    String name;
    double marks;
    
    public void checkPass(){
            if(marks<=50){
                System.out.println("Status: Failed");
             }else{
                System.out.println("Status: Passed");
               }
            }

    public static void main(String[] args) {
        Student s1 = new Student();
        
        s1.name = "Sadia";
        s1.marks = 51;
        
        System.out.println("Student name: " + s1.name);
        s1.checkPass();
    }
}
