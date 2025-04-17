//Ask the user to input two integers and display their absolute difference using Math.abs().
 
package com.mycompany.lab8;

import java.util.Scanner;

public class Diff {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.println("Input two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println("Absolute difference b/w two numbers is : " + Math.abs(num1 - num2));
    }   
}
