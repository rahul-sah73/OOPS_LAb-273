// Q38: Write a Java program that demonstrates single inheritance.
// Create a base class Person with attributes like name and age.
// Create a derived class Student that extends Person and adds studentId and course.
// Implement a method to display student details.

import java.util.*;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    int studentId;
    String course;

    Student(String name, int age, int studentId, String course) {
        super(name, age);
        this.studentId = studentId;
        this.course = course;
    }

    void displayStudent() {
        displayPerson();
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
    }
}

public class Q38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter course: ");
        String course = sc.nextLine();

        Student s = new Student(name, age, id, course);

        System.out.println("\nStudent Details:");
        s.displayStudent();

        sc.close();
    }
}