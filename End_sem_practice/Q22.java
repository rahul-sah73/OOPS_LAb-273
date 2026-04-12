// Write a Java program to Create a class Person with a constructor initializing name and age 
// Derive a class Doctor that adds specialization. Call the base class constructor using super().

import java.util.Scanner;

class Person {
    String name;
    int age;

    // Constructor of Person
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Doctor extends Person {
    String specialization;

    // Constructor of Doctor using super()
    Doctor(String name, int age, String specialization) {
        super(name, age);  // calling base class constructor
        this.specialization = specialization;
    }

    void displayDoctor() {
        displayPerson();
        System.out.println("Specialization: " + specialization);
    }
}

public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.print("Enter specialization: ");
        String specialization = sc.nextLine();

        // creating object
        Doctor d = new Doctor(name, age, specialization);

        // displaying details
        System.out.println("\nDoctor Details:");
        d.displayDoctor();

        sc.close();
    }
}