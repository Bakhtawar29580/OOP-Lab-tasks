package com.mycompany.prac1;

public class Prac1 {
    
     public static void main(String[] args) {
         
        int[] sum= {1,2,3,4,5};
        int total =0;
         
        for(int i = 0; i <sum.length; i++){
            total += sum[i];
        }
        System.out.println("Sum of all numbers is: " + total);
    }
}
