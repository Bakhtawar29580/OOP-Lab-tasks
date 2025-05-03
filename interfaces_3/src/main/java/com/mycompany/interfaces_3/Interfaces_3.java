package com.mycompany.interfaces_3;

public class Interfaces_3 {
    
    interface Vehicle{
        void start();
    }
    
    static class car implements Vehicle{
        public void start(){
            System.out.println("The car starts");
        }
    }
    
    static class bike implements Vehicle{
         public void start(){
            System.out.println("The bike starts");
        }
    }
    
    static class bus implements Vehicle{
         public void start(){
            System.out.println("The bus starts");
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new car();
        Vehicle v2 = new bike();
        Vehicle v3 = new bus();
        
        v1.start();
        v2.start();
        v3.start();
    }
}
