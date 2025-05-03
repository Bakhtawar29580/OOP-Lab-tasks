package com.mycompany.print;

public class Print {
    
    interface Printable{
        void print();
    }            
    
    static class Book implements Printable{
        String title = "The Kite Runner";
        String author = "By Khaled Hosseini";
        
        public void print(){
            System.out.println("Book " + title + " " + author);
        }
    }
    
    static class Magazine implements Printable{
        int issue_num = 33;
        
        public void print(){
            System.out.println("Issue number is: " + issue_num);
        }
    } 

    public static void main(String[] args) {
        Book B = new Book();
        Magazine M = new Magazine();
        
       // Use Printable interface references
        Printable p1 = B; 
        Printable p2 = M; 

        // Call print using interface reference
        p1.print(); // Calls Book's print method
        p2.print(); // Calls Magazine's print method
    }
}