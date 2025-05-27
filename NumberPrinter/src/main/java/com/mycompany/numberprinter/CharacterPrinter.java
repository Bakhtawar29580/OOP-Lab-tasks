package com.mycompany.numberprinter;

class CharacterPrinter extends Thread{
    public void run(){         
        for(char i = 'A'; i<= 'E'; i++ ){
            System.out.println("Characters: " + i);
        }
    }  
}
