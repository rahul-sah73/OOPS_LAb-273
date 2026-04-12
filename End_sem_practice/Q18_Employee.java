// Write a Java program to Implement a class Employee with attributes name and salary.
// Derive Manager from Employee and add an attribute teamSize.
// Further derive ProjectManager from Manager and add projectName.
// Display details using appropriate methods.

import java.util.Scanner;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayEmployee() {
        System.out.println("Name: " + name);
        System.out.println("Salary: Rs " + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    void displayManager() {
        displayEmployee();
        System.out.println("Team Size: " + teamSize);
    }
}

class ProjectManager extends Manager {
    String projectName;

    ProjectManager(String name, double salary, int teamSize, String projectName) {
        super(name, salary, teamSize);
        this.projectName = projectName;
    }

    void displayProjectManager() {
        displayManager();
        System.out.println("Project Name: " + projectName);
    }
}

public class Q18_Employee {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Team Size: ");
        int teamSize = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.print("Enter Project Name: ");
        String projectName = sc.nextLine();

        ProjectManager pm = new ProjectManager(name, salary, teamSize, projectName);

        System.out.println("\n--- Employee Details ---");
        pm.displayProjectManager();

        sc.close();
    }
}