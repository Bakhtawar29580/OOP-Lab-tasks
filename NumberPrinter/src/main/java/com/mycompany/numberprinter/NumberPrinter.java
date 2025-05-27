package com.mycompany.numberprinter;

public class NumberPrinter extends Thread {
    
    public void run(){         
        for(int i = 1; i<= 5; i++ ){
            System.out.println("Number: " + i);
        }
    }
    
    public static void main(String[] args) {
        NumberPrinter p = new NumberPrinter();
        p.start();
        CharacterPrinter c = new CharacterPrinter();
        c.start();
    }
  }
