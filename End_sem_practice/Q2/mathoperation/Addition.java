package mathoperation;

import java.util.Scanner;

public class Addition {

    // Method to add two numbers
    public void add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum = " + sum);
    }

    // Main method with user input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Addition obj = new Addition();

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        obj.add(num1, num2);

        sc.close();
    }
}