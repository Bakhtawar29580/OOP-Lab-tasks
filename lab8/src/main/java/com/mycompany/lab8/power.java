//Take two numbers as input: base and exponent. Use Math.pow() to display the result.
package com.mycompany.lab8;

import java.util.Scanner;

public class power {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println("Power of" + num + " is " + Math.pow(2, 8));
    }
}
   