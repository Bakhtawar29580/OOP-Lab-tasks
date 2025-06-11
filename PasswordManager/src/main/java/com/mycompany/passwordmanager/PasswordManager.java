package com.mycompany.passwordmanager;

public class PasswordManager {
    private int pass;
    
    public void changePass(int oldPass, int NewPass){
        if(pass == oldPass){
            System.out.println("Password updated");
        }else{
            System.out.println("old Password is incorrect");
        }
    }
    
    public void validatePass(int inputPass){
        if(pass == inputPass){
            System.out.println("Correct Password");
        }else{
            System.out.println("inCorrect Password");
        }
    }
    
    public static void main(String[] args) {
        PasswordManager p1 = new PasswordManager();
        p1.validatePass(0);
        p1.changePass(0, 1234);
        p1.validatePass(1234);
        p1.changePass(1111, 2222);
        p1.validatePass(2222);
    }
}
