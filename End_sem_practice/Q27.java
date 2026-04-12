// Q27: Write a Java program that sorts an array of numbers and displays them in ascending order.

import java.util.*;

public class Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // sorting array
        Arrays.sort(arr);

        // displaying sorted array
        System.out.println("Array in ascending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}