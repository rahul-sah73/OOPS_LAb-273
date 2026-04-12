// Q35: Write a Java program that stores employee salaries in an array 
// and calculates the highest and lowest salary.

import java.util.*;

public class Q35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        double[] salaries = new double[n];

        System.out.println("Enter salaries:");
        for (int i = 0; i < n; i++) {
            salaries[i] = sc.nextDouble();
        }

        // finding highest and lowest
        double highest = salaries[0];
        double lowest = salaries[0];    

        for (int i = 1; i < n; i++) {
            if (salaries[i] > highest) {
                highest = salaries[i];
            }
            if (salaries[i] < lowest) {
                lowest = salaries[i];
            }
        }

        // displaying result
        System.out.println("Highest Salary: " + highest);
        System.out.println("Lowest Salary: " + lowest);

        sc.close();
    }
}