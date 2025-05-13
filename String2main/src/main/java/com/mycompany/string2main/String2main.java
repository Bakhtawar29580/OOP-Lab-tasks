package com.mycompany.string2main;

import java.util.Stack;
import java.util.Scanner;

public class String2main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);    
        Stack<Character> stack = new Stack<>();
        
        System.out.println("Enter a word: ");
        String word = input.next();
        
        for(int i = 0; i < word.length(); i++){
            stack.push(word.charAt(i));        
        }
        
         String reversed = "";
         while (!stack.isEmpty()) {
            reversed += stack.pop();
        }
         
         if (word.equalsIgnoreCase(reversed)) {
            System.out.println("The word is a palindrome.");
        } else {
            System.out.println("The word is NOT a palindrome.");
        }

        input.close();
    }
}
