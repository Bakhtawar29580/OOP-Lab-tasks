package com.mycompany.linkedlist3;

import java.util.LinkedList;

public class Linkedlist3 {

    public static void main(String[] args) {
        
        LinkedList<Integer> nodes = new LinkedList<>();
        
        nodes.add(1);
        nodes.add(2);
        nodes.add(3);
        nodes.add(4);
        nodes.add(5);
        
        System.out.println("List before reversal: " + nodes);
        
        LinkedList<Integer> reversed = new LinkedList<>();
        
        for(int i = nodes.size()-1; i>= 0; i--){
            reversed.add(nodes.get(i));
        }
        
        System.out.println("\nList after reversal: " + reversed);
    }
}
