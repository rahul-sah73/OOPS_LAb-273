/*

Identify actors such as Customer and Bank. To Define use cases like Withdraw Cash, Deposit Cash, Check Balance, and Transfer 
Funds. To Show relationships between the customer and ATM functions.


                +----------------------------------+
                |            ATM System            |
                |----------------------------------|
Customer ------>|      (Withdraw Cash)             |
Customer ------>|      (Deposit Cash)              |
Customer ------>|      (Check Balance)             |
Customer ------>|      (Transfer Funds)            |
                |                                  |
Bank ---------->|   (Authorize / Verify Account)   |
                +----------------------------------+

*/

/*

Write a java program to create an abstract class Shape with an abstract method area(). Create subclasses Circle and Rectangle 
implementing area(). Use an array of Shape references to call area() dynamically

*/

import java.util.Scanner;

abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle = " + result);
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    void area() {
        double result = length * width;
        System.out.println("Area of Rectangle = " + result);
    }
}

public class Q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();

        System.out.print("Enter length of rectangle: ");
        double l = sc.nextDouble();

        System.out.print("Enter width of rectangle: ");
        double w = sc.nextDouble();

        Shape[] shapes = new Shape[2];

        shapes[0] = new Circle(r);
        shapes[1] = new Rectangle(l, w);

        for (Shape s : shapes) {
            s.area();
        }

        sc.close();
    }
}