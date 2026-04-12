// Q40: Write a Java program to create a Shape class and its subclasses Circle, Rectangle, Triangle.
// Implement method overriding to calculate and display the area of different shapes.

import java.util.*;

class Shape {
    void area() {
        System.out.println("Area not defined");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void area() {
        double result = length * width;
        System.out.println("Area of Rectangle: " + result);
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    void area() {
        double result = 0.5 * base * height;
        System.out.println("Area of Triangle: " + result);
    }
}

public class Q40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.print("Choose shape: ");
        int choice = sc.nextInt();

        Shape s;

        if (choice == 1) {
            System.out.print("Enter radius: ");
            double r = sc.nextDouble();
            s = new Circle(r);
        } else if (choice == 2) {
            System.out.print("Enter length: ");
            double l = sc.nextDouble();
            System.out.print("Enter width: ");
            double w = sc.nextDouble();
            s = new Rectangle(l, w);
        } else {
            System.out.print("Enter base: ");
            double b = sc.nextDouble();
            System.out.print("Enter height: ");
            double h = sc.nextDouble();
            s = new Triangle(b, h);
        }

        s.area();

        sc.close();
    }
}