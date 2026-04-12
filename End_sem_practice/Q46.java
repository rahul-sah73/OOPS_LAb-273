// Q46: Create an abstract class representing a Shape that contains an abstract method to compute area.
// Implement two subclasses representing different shapes that provide their own implementation for calculating the area.

import java.util.*;

abstract class Shape {
    abstract double computeArea();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double computeArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double computeArea() {
        return length * width;
    }
}

public class Q46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.print("Choose shape: ");
        int choice = sc.nextInt();

        Shape s;

        if (choice == 1) {
            System.out.print("Enter radius: ");
            double r = sc.nextDouble();
            s = new Circle(r);
        } else {
            System.out.print("Enter length: ");
            double l = sc.nextDouble();
            System.out.print("Enter width: ");
            double w = sc.nextDouble();
            s = new Rectangle(l, w);
        }

        System.out.println("Area = " + s.computeArea());

        sc.close();
    }
}