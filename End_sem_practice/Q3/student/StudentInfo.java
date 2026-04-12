// Write a  Java program to develop two packages student and result.One package stores student information and the other calculates grades
package student;

import java.util.Scanner;


public class StudentInfo {
    public String name;
    public int rollNo;
    public int marks;

    public void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();

        System.out.print("Enter Marks: ");
        marks = sc.nextInt();

        sc.close();
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        StudentInfo s = new StudentInfo();
        s.getData();
        s.display();
        
    }
}