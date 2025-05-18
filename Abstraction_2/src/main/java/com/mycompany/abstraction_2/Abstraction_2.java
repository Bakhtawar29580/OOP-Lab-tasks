package com.mycompany.abstraction_2;

abstract class BankAccount{
    double balance = 0;
    
    abstract double deposit(double amount);
    abstract double withdraw(double amount);
    abstract double getBalance();
}

class SavingsAccount extends BankAccount{
    
    double deposit(double amount){
        balance = balance + amount;
        return balance;
    }
    
    double withdraw(double amount){
        if(amount <= balance){
            balance = balance - amount;
        }else{
            System.out.println("Insufficient balance in SavingsAcc");
        }
        return balance;
    }
    
    double getBalance(){
        return balance;
    }  
}

class CurrentAccount extends BankAccount{
    
    double deposit(double amount){
        balance = balance + amount;
        return balance;
    }
    
    double withdraw(double amount){
        if(amount <= balance){
            balance = balance - amount;
        }else{
            System.out.println("Insufficient balance in CurrentAcc");
        }
        return balance;
    }
    
    double getBalance(){
        return balance;
    }  
}

public class Abstraction_2 {

    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        CurrentAccount c = new CurrentAccount();
        
        System.out.println("Savings account: ");
        s.deposit(2500);
        s.deposit(600);
        System.out.println("Savings bal: " + s.getBalance());
        
        System.out.println("\nCurrent Account: ");
        c.deposit(5500);
        c.withdraw(2000);
        System.out.println("Current bal: " + c.getBalance());
  }
}
