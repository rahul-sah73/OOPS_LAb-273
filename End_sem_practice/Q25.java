// Q25: Write a Java program to create a file and store user input into that file.

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // taking user input
            System.out.print("Enter text to write into file: ");
            String data = sc.nextLine();

            // creating and writing to file
            FileWriter fw = new FileWriter("output.txt");
            fw.write(data);
            fw.close();

            System.out.println("Data written to file successfully.");

        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }

        sc.close();
    }
}