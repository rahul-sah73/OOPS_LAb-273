// Write a  Java program to develop two packages student and result.One package stores student information and the other calculates grades
package result;

import java.util.Scanner;

public class Result {

    public void calculateGrade(int marks) {
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        Result r = new Result();
        r.calculateGrade(marks);

        sc.close();
    }
}