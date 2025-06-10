/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rectangle;

/**
 *
 * @author USER
 */
public class Rectangle {
    double length;
    double width;
    
    double calculateArea(){
        return length * width;
    }

    public static void main(String[] args) {
        
        Rectangle r1 = new Rectangle();
        r1.length = 6;
        r1.width = 12;
        
        double area = r1.calculateArea();
        System.out.println("Area of Rectangle is: " + area);
    }
}
