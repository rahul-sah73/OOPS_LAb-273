// Q45: Write a Java program to read and display the contents of a text file.

import java.io.*;

public class Q45 {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("file.txt"));

            String line;
            System.out.println("File Contents:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
