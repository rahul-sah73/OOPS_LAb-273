// Q39: Write a Java program to create a file and store student details,
// then read and display the data.

import java.util.*;
import java.io.*;

public class Q39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // taking input
            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter course: ");
            String course = sc.nextLine();

            // writing to file
            FileWriter fw = new FileWriter("student.txt");
            fw.write("Name: " + name + "\n");
            fw.write("Age: " + age + "\n");
            fw.write("Course: " + course + "\n");
            fw.close();

            System.out.println("Data written to file successfully.\n");

            // reading from file
            FileReader fr = new FileReader("student.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;
            System.out.println("Reading from file:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}