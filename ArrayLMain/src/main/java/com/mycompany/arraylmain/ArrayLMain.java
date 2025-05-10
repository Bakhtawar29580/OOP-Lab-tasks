package com.mycompany.arraylmain;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLMain {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        ArrayList<Integer> integers = new ArrayList<>();
        
        System.out.println("Enter 5 integers: ");
        
        for(int i = 0; i < 5 ; i++){
            System.out.println("Enter integer " + (i + 1) + ": ");
            integers.add(input.nextInt());
        }
        
        System.out.println("Original list");
        System.out.println(integers);
        
        ArrayList<Integer> reversedList = new ArrayList<>();
        for(int i = integers.size() -1; i >= 0; i--){
            reversedList.add(integers.get(i));
        }
        
        System.out.println("Reversed list");
        System.out.println(reversedList);
        
        input.close();
     
    }
}
