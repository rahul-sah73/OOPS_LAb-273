// Q34: Write a Java program to create Employee class with name, designation, salary.
// Developer and Manager extend Employee.
// Add extra attributes: programmingLanguage for Developer, teamSize for Manager.

import java.util.*;

class Employee {
    String name;
    String designation;
    double salary;

    Employee(String name, String designation, double salary) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, String designation, double salary, String programmingLanguage) {
        super(name, designation, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(String name, String designation, double salary, int teamSize) {
        super(name, designation, salary);
        this.teamSize = teamSize;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

public class Q34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Developer");
        System.out.println("2. Manager");
        System.out.print("Choose employee type: ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter designation: ");
        String designation = sc.nextLine();

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();

        Employee emp;

        if (choice == 1) {
            System.out.print("Enter programming language: ");
            String lang = sc.nextLine();
            emp = new Developer(name, designation, salary, lang);
        } else {
            System.out.print("Enter team size: ");
            int size = sc.nextInt();
            emp = new Manager(name, designation, salary, size);
        }

        System.out.println("\nEmployee Details:");
        emp.displayDetails();

        sc.close();
    }
}