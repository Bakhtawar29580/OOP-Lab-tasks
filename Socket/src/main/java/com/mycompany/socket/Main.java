package com.mycompany.socket;
import java.io.*;
import java.net.*;

public class Main {
    
    public static void main(String[] args) {
        
        try{
            ServerSocket server = new ServerSocket(5000);
            System.out.println("Server is waiting for client");
        
        Socket client = server.accept();
        System.out.println("Client connected");
        
        DataInputStream input = new DataInputStream(client.getInputStream());
        String msg = input.readUTF();
        System.out.println("Client says " + msg);
        
        input.close();
        client.close();
        server.close();
       }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
       }       
    }
} 