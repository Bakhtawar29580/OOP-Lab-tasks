package com.mycompany.lab8;

import java.util.Scanner;

public class Lab8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println("Square root of " + num + " is " + Math.sqrt(num));
    }
}
