/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.maximum;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Maximum {
    
    void max (){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        
        int n1 = s1.nextInt();
        int n2 = s1.nextInt();
        int n3 = s1.nextInt();       
        
        int result = Math.max(n1, Math.max(n2, n3));
        System.out.println("Largest num among all three is: " + result); 
        
        s1.close();
    }

    public static void main(String[] args) {
        Maximum m1 = new Maximum();
        m1.max();
    }
}
