// Q47: Write a Java program that creates a file and saves multiple lines of text in it.

import java.io.*;
import java.util.*;

public class Q47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            FileWriter fw = new FileWriter("output.txt");

            System.out.print("Enter number of lines: ");
            int n = sc.nextInt();
            sc.nextLine(); // clear buffer

            System.out.println("Enter " + n + " lines:");
            for (int i = 0; i < n; i++) {
                String line = sc.nextLine();
                fw.write(line + "\n");
            }

            fw.close();
            System.out.println("Data written to file successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}