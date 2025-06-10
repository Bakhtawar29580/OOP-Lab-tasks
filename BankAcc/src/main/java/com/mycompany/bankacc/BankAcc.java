/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bankacc;

/**
 *
 * @author USER
 */
public class BankAcc {
    String accNum;
    double bal;
    
    public void deposit(double amount){
        bal += amount;
    }
    
    public void displayBal(){
        System.out.println("Current balance is: " + bal);
    }

    public static void main(String[] args) {
        BankAcc b1 = new BankAcc();
        b1.accNum = "123456";
        b1.deposit(500);
        b1.displayBal();
    }
}
