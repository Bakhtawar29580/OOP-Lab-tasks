package com.mycompany.square;

import java.util.Scanner;

public class Square {
    
    public void root(){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter a number: ");
        
        double num = s1.nextDouble();
        double result = Math.sqrt(num);
        
        System.out.println("The square root of " + num + " is: " + result);
        
        s1.close();
    }
    
    public static void main(String[] args) {
        Square s = new Square();
        s.root();
    }
}
