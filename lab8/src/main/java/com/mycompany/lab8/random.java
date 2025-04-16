//Write a program that prints 5 random numbers between 1 and 100.
package com.mycompany.lab8;

import java.util.Random;

public class random {
    
    void randomNum(){
        Random rand = new Random();     
        
            System.out.println("Random numbers b/w 1 & 100 are : ");
            for (int i = 0; i < 5; i++){
                System.out.println(rand.nextInt(100) + 1);
        }
    }
    
    public static void main(String[] args) {
        random r = new random(); 
        r.randomNum();           
    }
} 
