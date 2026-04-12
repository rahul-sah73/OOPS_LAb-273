// Write a Java program to calculate the sum of all elements in an array.

import java.util.Scanner;

public class Q21_Array_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking size of array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        // taking array input
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i]; // adding elements
        }

        // displaying result
        System.out.println("Sum of array elements = " + sum);

        sc.close();
    }
}