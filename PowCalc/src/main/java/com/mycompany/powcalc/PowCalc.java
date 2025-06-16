package com.mycompany.powcalc;

import java.util.Scanner;

public class PowCalc {
    
    void calculator(){
        Scanner s1 = new Scanner(System.in);
        
        System.out.println("Enter base number: ");
        double num1 = s1.nextDouble();
        
        System.out.println("Enter exponent number: ");
        double num2 = s1.nextDouble();
        
        double result = Math.pow(num1, num2);
        
        System.out.println("The result is: " + result);
        
        s1.close();
    }
    
    public static void main(String[] args) {
        PowCalc p1 = new PowCalc();
        p1.calculator();
    }
}
