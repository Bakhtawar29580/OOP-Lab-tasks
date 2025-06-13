package com.mycompany.employee;

public class Employee {
    
    
    public float calculateBonus(int baseSal){
        float bonus = baseSal * 0.05f;
        return bonus;
    }
    
    public double calculateBonus(double baseSal, int rating){
        double bonus = 0;
        
        if(rating==5){
            bonus = baseSal * 0.20;
        }
        else if(rating==4){
            bonus = baseSal * 0.15;
        }
        else if(rating==3){
            bonus = baseSal * 0.10;
        }
        else if(rating==2){
            bonus = baseSal * 0.05;
        }
        else if(rating==1){
            bonus = 0;
        }
        else{
            System.out.println("invalid rating!");
        }
        return bonus;
    }
    public static void main(String[] args) {
        Employee e1 = new Employee();
        System.out.println("5% Bonus: " + e1.calculateBonus(500));
        System.out.println("Performance rating: " + e1.calculateBonus(2500, 4));
    }
}
