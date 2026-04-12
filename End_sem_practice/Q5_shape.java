// Write a program where a Shape class contains a constructor that initializes dimensions. To Create a Rectangle class that uses those dimensions to calculate the area.

import java.util.Scanner;

// Base class
class Shape {
    double length, width;

    // Constructor to initialize dimensions
    Shape(double length, double width) {
        this.length = length;
        this.width = width;
    }
}

// Rectangle class
class Rectangle extends Shape {

    // Constructor calls parent constructor
    Rectangle(double length, double width) {
        super(length, width);
    }

    // Method to calculate area
    void calculateArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

// Main class
public class Q5_shape {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double l = sc.nextDouble();

        System.out.print("Enter width: ");
        double w = sc.nextDouble();

        Rectangle r = new Rectangle(l, w);
        r.calculateArea();

        sc.close();
    }
}