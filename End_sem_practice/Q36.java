// Q36: Create a Java program to implement method overloading for calculating 
// the area of a circle, rectangle, and triangle.

import java.util.*;

class AreaCalculator {

    // Circle
    double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Rectangle
    double area(double length, double width) {
        return length * width;
    }

    // Triangle
    double area(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }
}

public class Q36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AreaCalculator calc = new AreaCalculator();

        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.print("Choose shape: ");
        int choice = sc.nextInt();

        double result = 0;

        if (choice == 1) {
            System.out.print("Enter radius: ");
            double r = sc.nextDouble();
            result = calc.area(r);
        } 
        else if (choice == 2) {
            System.out.print("Enter length: ");
            double l = sc.nextDouble();
            System.out.print("Enter width: ");
            double w = sc.nextDouble();
            result = calc.area(l, w);
        } 
        else if (choice == 3) {
            System.out.print("Enter base: ");
            double b = sc.nextDouble();
            System.out.print("Enter height: ");
            double h = sc.nextDouble();
            result = calc.area(b, h, true);
        }

        System.out.println("Area = " + result);

        sc.close();
    }
}