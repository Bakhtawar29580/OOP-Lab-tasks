package com.mycompany.mainn;

import java.io.*;
import java.net.*;

public class Mainn {

    public static void main(String[] args) {
        try{
            Socket socket = new Socket("localhost", 5000);
            
    DataOutputStream output = new DataOutputStream(socket.getOutputStream());
    output.writeUTF("Hello Server!");
       output.writeUTF("Hello again!");
       
       output.close();
       socket.close();
       
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
