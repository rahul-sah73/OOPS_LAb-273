// Write a Java program that stores student marks in an array,
// calculates total, average, and identifies the top performer

import java.util.Scanner;

public class Q17_mark {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] marks = new int[n];
        int total = 0;

        // Input marks
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks of student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        // Calculate average
        double average = (double) total / n;

        // Find top performer
        int max = marks[0];
        int index = 0;

        for (int i = 1; i < n; i++) {
            if (marks[i] > max) {
                max = marks[i];
                index = i;
            }
        }

        // Output
        System.out.println("\nTotal Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Top Performer: Student " + (index + 1) + " with marks " + max);

        sc.close();
    }
}