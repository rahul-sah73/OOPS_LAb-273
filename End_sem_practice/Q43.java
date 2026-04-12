// Q43: Write a Java program to read a file containing student names 
// and sort them alphabetically before displaying them.

import java.util.*;
import java.io.*;

public class Q43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> names = new ArrayList<>();

        try {
            // reading from file
            FileReader fr = new FileReader("students.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                names.add(line);
            }
            br.close();

            // sorting names
            Collections.sort(names);

            // displaying sorted names
            System.out.println("Sorted Student Names:");
            for (String name : names) {
                System.out.println(name);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}