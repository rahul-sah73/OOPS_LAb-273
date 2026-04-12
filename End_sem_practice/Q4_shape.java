// Write a Java program to Create a Shape class and its subclasses Circle, Rectangle, Triangle. Implement method overriding to
// calculate and display the area of different shapes.


import java.util.Scanner;

// Base class
class Shape {
    void area() {
        System.out.println("Area not defined");
    }
}

// Circle class
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    // Method overriding
    void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

// Rectangle class
class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method overriding
    void area() {
        double result = length * width;
        System.out.println("Area of Rectangle: " + result);
    }
}

// Triangle class
class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Method overriding
    void area() {
        double result = 0.5 * base * height;
        System.out.println("Area of Triangle: " + result);
    }
}

// Main class
public class Q4_shape{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Shape:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");

        int choice = sc.nextInt();

        Shape s;

        switch (choice) {
            case 1:
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();
                s = new Circle(r);
                s.area();
                break;

            case 2:
                System.out.print("Enter length: ");
                double l = sc.nextDouble();
                System.out.print("Enter width: ");
                double w = sc.nextDouble();
                s = new Rectangle(l, w);
                s.area();
                break;

            case 3:
                System.out.print("Enter base: ");
                double b = sc.nextDouble();
                System.out.print("Enter height: ");
                double h = sc.nextDouble();
                s = new Triangle(b, h);
                s.area();
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}