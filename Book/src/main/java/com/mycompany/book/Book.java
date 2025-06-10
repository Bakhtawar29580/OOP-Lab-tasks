package com.mycompany.book;

public class Book {
    private String title;
    private String author;
    private boolean isIssued;
    
    public void issueBook(){
        isIssued = true;
        System.out.println("Book is issued");       
   }   
    
    public void returnbook(){
        isIssued = false;
        System.out.println("Book is returned");
    }
    
    public void ShowStatus(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        if(isIssued){
            System.out.println("Status: Issued");
        }else{
            System.out.println("Status: Available");
        }
    }
    
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.title = "The silent patient";
        b1.author = "anny";
        
        b1.ShowStatus();
        System.out.println();
        b1.issueBook();
        System.out.println();
        b1.ShowStatus();
        System.out.println();
        b1.returnbook();
        System.out.println();
        b1.ShowStatus();
    }
}
