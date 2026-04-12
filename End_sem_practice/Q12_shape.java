// Write a java program to create an abstract class Shape with an abstract method area (). Create subclasses Circle and
//  Rectangle implementing area(). Use an array of Shape references to call area () dynamically.

import java.util.Scanner;

// Abstract class
abstract class Shape {
    abstract void area();
}

// Circle class
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Circle Area: " + result);
    }
}

// Rectangle class
class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void area() {
        double result = length * width;
        System.out.println("Rectangle Area: " + result);
    }
}

// Main class
public class Q12_shape {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();

        System.out.print("Enter length of rectangle: ");
        double l = sc.nextDouble();

        System.out.print("Enter width of rectangle: ");
        double w = sc.nextDouble();

        // Array of Shape references
        Shape[] shapes = new Shape[2];

        shapes[0] = new Circle(r);
        shapes[1] = new Rectangle(l, w);

        System.out.println("\nAreas:");

        // Dynamic method call
        for (Shape s : shapes) {
            s.area(); // runtime polymorphism
        }

        sc.close();
    }
}