// Q41: Write a Java program for a Scientific Calculator that performs addition, subtraction,
// and multiplication using method overloading for different data types (int, float, double).

import java.util.*;

class Calculator {

    // Addition
    int add(int a, int b) {
        return a + b;
    }

    float add(float a, float b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    int subtract(int a, int b) {
        return a - b;
    }

    float subtract(float a, float b) {
        return a - b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication
    int multiply(int a, int b) {
        return a * b;
    }

    float multiply(float a, float b) {
        return a * b;
    }

    double multiply(double a, double b) {
        return a * b;
    }
}

public class Q41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Choose Data Type:");
        System.out.println("1. int");
        System.out.println("2. float");
        System.out.println("3. double");
        int type = sc.nextInt();

        System.out.println("Choose Operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        int op = sc.nextInt();

        if (type == 1) {
            System.out.print("Enter two integers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (op == 1) System.out.println("Result: " + calc.add(a, b));
            else if (op == 2) System.out.println("Result: " + calc.subtract(a, b));
            else System.out.println("Result: " + calc.multiply(a, b));
        } 
        else if (type == 2) {
            System.out.print("Enter two floats: ");
            float a = sc.nextFloat();
            float b = sc.nextFloat();

            if (op == 1) System.out.println("Result: " + calc.add(a, b));
            else if (op == 2) System.out.println("Result: " + calc.subtract(a, b));
            else System.out.println("Result: " + calc.multiply(a, b));
        } 
        else {
            System.out.print("Enter two doubles: ");
            double a = sc.nextDouble();
            double b = sc.nextDouble();

            if (op == 1) System.out.println("Result: " + calc.add(a, b));
            else if (op == 2) System.out.println("Result: " + calc.subtract(a, b));
            else System.out.println("Result: " + calc.multiply(a, b));
        }

        sc.close();
    }
}