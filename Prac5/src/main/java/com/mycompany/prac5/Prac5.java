package com.mycompany.prac5;
import java.util.Scanner;

interface shape {
    double area();
}

class circle implements shape {
    double radius;

    circle(double r) {
        radius = r;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

class rectangle implements shape {
    double length;
    double width;

    rectangle(double l, double w) {
        length = l;
        width = w;
    }

    public double area() {
        return length * width;
    }
}

public class Prac5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Circle input
        System.out.print("Enter radius of circle: ");
        double r = scanner.nextDouble();
        shape c = new circle(r);
        System.out.println("Area of Circle: " + c.area());

        // Rectangle input
        System.out.print("Enter length of rectangle: ");
        double l = scanner.nextDouble();
        System.out.print("Enter width of rectangle: ");
        double w = scanner.nextDouble();
        shape rect = new rectangle(l, w);
        System.out.println("Area of Rectangle: " + rect.area());
    }
}
