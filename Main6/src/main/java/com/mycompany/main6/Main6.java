package com.mycompany.main6;

public class Main6 {

    public static void main(String[] args) {
         Employee e1 = new Employee();
         
         double bonus1 = e1.calculateBonus(4000);
         System.out.println("Bonus based on base salary of 4000: " + bonus1);
        
         double bonus2 = e1.calculateBonus(4100.0, 9);
         System.out.println("Bonus based on performance rating: " + bonus2);
        
    }
}
