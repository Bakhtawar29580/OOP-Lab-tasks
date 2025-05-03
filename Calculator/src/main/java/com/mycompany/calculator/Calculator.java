package com.mycompany.calculator;
import java.util.Scanner;

public class Calculator {

    interface Operations{
        int add(int a,int b);
        int subtract(int a,int b);
        int multiply(int a,int b);
        int divide(int a,int b);
    }
    
    static class Calculate implements Operations{
        
        public int add(int a, int b){
            return a + b;
        }
        
        public int subtract(int a, int b){
            return a - b;
        }
        
        public int multiply(int a, int b){
            return a * b;
        }
        
        public int divide(int a, int b){
            if(b==0){
                System.out.println("Division by zero ERROR!");
                return 0;
            }      
            return a / b;
        }    
    }
      
    public static void main(String[] args) {
        Calculate c = new Calculate();
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = s.nextInt();
        
        System.out.println("Enter second number: ");
        int num2 = s.nextInt();
        
        System.out.println("Addition: " + c.add(num1, num2));
        System.out.println("Subtraction: " + c.subtract(num1, num2));
        System.out.println("Multiplication: " + c.multiply(num1, num2));
        System.out.println("Division: " + c.divide(num1, num2));
    }
}
