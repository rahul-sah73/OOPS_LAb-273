// Program to print all elements of 1D array

import java.util.Scanner;

public class Array_Print {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are:");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
            sc.close();
        }
    }
}