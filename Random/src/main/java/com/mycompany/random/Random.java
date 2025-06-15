package com.mycompany.random;

public class Random {
    
    public void numGen(){
        
        for(int i = 1; i <= 5; i++){
            int rand = (int) (Math.random() * 100) + 1;
            
            System.out.println("Random number " + i + " : " + rand);
        }
    }

    public static void main(String[] args) {
        Random r1 = new Random();
        r1.numGen();
    }
}
