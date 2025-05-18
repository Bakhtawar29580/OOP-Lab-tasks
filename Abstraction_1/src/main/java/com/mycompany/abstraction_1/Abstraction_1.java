package com.mycompany.abstraction_1;

abstract class Shape{
    abstract double getArea();
}

class Circle extends Shape{
    int radius;
    
    void setradius(int r){
        radius = r;
    }
    
    @Override
    double getArea(){
        return 3.14 * radius * radius;
    }    
}

class Rectangle extends Shape{
    int length;
    int width;
    
    void setsides(int l, int w){
        length = l;
        width = w;
    }
    
    @Override
    double getArea(){
        return length * width;
    }    
}

public class Abstraction_1 {

    public static void main(String[] args) {
        Circle c = new Circle();
        c.setradius(3);
        
        Rectangle r = new Rectangle();
        r.setsides(4, 6);
        
        System.out.println("Area of circle is: " + c.getArea());
        System.out.println("Area of rectangle is: " + r.getArea());      
    }
}
