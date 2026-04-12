// Write a Java program that reads numbers from a file and calculates their sum and average

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q19_file{
    public static void main(String[] args) {

        try {
            File file = new File("numbers.txt"); // file name
            Scanner sc = new Scanner(file);

            double sum = 0;
            int count = 0;

            // read numbers from file
            while (sc.hasNext()) {
                double num = sc.nextDouble();
                sum += num;
                count++;
            }

            // calculate average
            if (count > 0) {
                double average = sum / count;
                System.out.println("Sum: " + sum);
                System.out.println("Average: " + average);
            } else {
                System.out.println("File is empty");
            }

            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}