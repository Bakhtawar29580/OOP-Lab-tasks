public class CharacterPrinter extends Thread{
    public void run(){         
        for(char i = 1; i<= 5; i++ ){
            System.out.println("Characters: " + i);
        }
    }  
}

