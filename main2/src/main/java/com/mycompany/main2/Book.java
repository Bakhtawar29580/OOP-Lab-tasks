
package com.mycompany.main2;

public class Book {
    private String title = "The silent patient";
    private String author = "James";
    private boolean isIssued = false;
    
    void issueBook(){
        if (!isIssued){
            isIssued = true;
            System.out.println("Book is issued");
        }else{
            System.out.println("Book is already issued");
        }
    }
    
    void returnBook(){
        if (!isIssued){
            isIssued = false;
            System.out.println("Book is available");
        }else{
            System.out.println("Book is not available");
        }
    }
    
    void showStatus(){
        System.out.println("Book: " + title + " by " + author);
        System.out.println("Status: " + (isIssued? "Issued " : "Available"));
    }
}
