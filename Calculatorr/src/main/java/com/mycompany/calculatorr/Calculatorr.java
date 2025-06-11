/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculatorr;

/**
 *
 * @author USER
 */
public class Calculatorr {
    
    int add(int a, int b){
        return a + b;
    }
    
    int multiply(int a, int b){
        return a * b;
    }

    public static void main(String[] args) {
        Calculatorr c1 = new Calculatorr();
        System.out.println("Sum of two digits is: " + c1.add(6, 90));
        System.out.println("Product of two digits is: " + c1.multiply(6, 6));
    }
}
