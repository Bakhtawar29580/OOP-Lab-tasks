package com.mycompany.main6;

import java.util.Scanner;

public class Employee {

    public double calculateBonus(int basesalary) {
        return basesalary * 0.05;
    }

    public double calculateBonus(double basesalary,int rating) {
        double bonusper = 0.0;
        
        Scanner s1 = new Scanner(System.in);
        System.out.print("Input rating: ");
        rating = s1.nextInt();

        switch(rating) {
            case 1:
                bonusper = 0;
                break;
            case 2:
                bonusper = 0.05;
                break;
            case 3:
                bonusper = 0.10;
                break;
            case 4:
                bonusper = 0.15;
                break;
            case 5:
                bonusper = 0.20;
                break;
            default:
                System.out.println("Invalid performance rating");
                bonusper = 0;
        }

        return basesalary * bonusper;
    }
}
