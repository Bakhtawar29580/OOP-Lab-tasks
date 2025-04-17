//Take three integers as input from the user and display the largest one using Math.max(). 
package com.mycompany.task8;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter 3 numbers: ");
        int num1 = input.nextInt(); 
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        
        System.out.println("The largest number is : " + Math.max(num1, num2));
    }
}
