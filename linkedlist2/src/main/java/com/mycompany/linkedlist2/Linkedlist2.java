package com.mycompany.linkedlist2;

import java.util.LinkedList;

public class Linkedlist2 {

    public static void main(String[] args) {
        
        LinkedList<String> nodes = new LinkedList<>();
        
        nodes.add("Maryam");
        nodes.add("Bakhtawar");
        nodes.add("Ayesha");
        nodes.add("Manal");
        nodes.add("Umaima");
        
        System.out.println("Before deleting from the list: ");
        for(String girls :nodes){
            System.out.println(girls);
        }
        
        nodes.remove(0); // Deleting the first node
        nodes.remove(1);// Deleting a node at a given position     
        nodes.removeLast(); // Deleting the last node
        
        System.out.println("\nAfter deleting first, mid & last nodes: ");
        for(String girls :nodes){
            System.out.println(girls);
        }
    }
}
