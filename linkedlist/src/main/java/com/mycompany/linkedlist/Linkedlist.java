package com.mycompany.linkedlist;

import java.util.LinkedList;

public class Linkedlist {

    public static void main(String[] args) { 
        
        LinkedList<String> nodes = new LinkedList<>();
        nodes.add("ITM");
        nodes.add("OOP");
        nodes.add("DLD");

        System.out.println("Before adding to the list:");
        for (String subj : nodes) {
            System.out.println(subj);
        }
        
        nodes.add(0, "MVC");       //inserting objects at beginning
        nodes.add("DS");         //    //     //     at end

        System.out.println("\nAfter adding at beginning and end:");
        for (String subj : nodes) {
            System.out.println(subj);
        }
    }
}
