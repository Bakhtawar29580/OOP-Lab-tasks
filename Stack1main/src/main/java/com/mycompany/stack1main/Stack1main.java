package com.mycompany.stack1main;

import java.util.*;


public class Stack1main {

    public static void main(String[] args) {
        Stack<String> books = new Stack<>();
        
        books.push("The Silent Patient");
        books.push("The Kite Runner");
        books.push("The Alchemist");
        books.push("Pir e Kamil");
        books.push("The power of now");
        
        String removedbook1 = books.pop();
        String removedbook2 = books.pop();
        
        System.out.println("Books removed:");
        System.out.println(removedbook1);
        System.out.println(removedbook2);
        
        System.out.println(" ");
        System.out.println("Remaining books: ");
        for(String book : books){
            System.out.println(book);
        }
    }
}
