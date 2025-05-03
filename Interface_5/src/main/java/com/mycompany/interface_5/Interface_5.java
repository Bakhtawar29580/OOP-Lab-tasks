package com.mycompany.interface_5;

public class Interface_5 {

    interface Greeting{
        void sayHello(String name);
        
        default void sayGoodbye(){
            System.out.println("Good Bye user!");
        }
        static void staticGreet(){
            System.out.println("Greetings user!");
        }
    }
   
        static class Welcome implements Greeting{
             public void sayHello(String name) {
            System.out.println("Hello, " + name + "!");
        }
    }

     
    public static void main(String[] args) {
        Greeting.staticGreet();
        Welcome w = new Welcome();
        w.sayHello("Bakhtawar");
        w.sayGoodbye();
    }
}