package com.mycompany.shape;

public class Shape {

    interface ShapeInterface {
        default double circle(int radius) {
            return radius * radius * 3.14;
        }

        default double rectangle(int length, int width) {
            return length * width;
        }
    }
    
    static class Circle implements ShapeInterface {
        // No need to override methods
    }

    static class Rectangle implements ShapeInterface {
        // No need to override methods
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        System.out.println("Area of circle: " + c.circle(8));
        System.out.println("Area of rectangle: " + r.rectangle(5, 5));
    }
}