// Write a java program to Create a system where different types of employees FullTimeEmployee, PartTimeEmployee, ContractEmployee
//  have different salary structures and Override calculateSalary() in each subclass. In main (), create employee objects and call calculateSalary().

import java.util.Scanner;

// Base class
class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void calculateSalary() {
        System.out.println("Salary calculation not defined");
    }
}

// Full Time Employee
class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    // Override method
    void calculateSalary() {
        System.out.println(name + " (Full-Time) Salary: Rs " + monthlySalary);
    }
}

// Part Time Employee
class PartTimeEmployee extends Employee {
    double hoursWorked, ratePerHour;

    PartTimeEmployee(String name, double hoursWorked, double ratePerHour) {
        super(name);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    // Override method
    void calculateSalary() {
        double salary = hoursWorked * ratePerHour;
        System.out.println(name + " (Part-Time) Salary: Rs " + salary);
    }
}

// Contract Employee
class ContractEmployee extends Employee {
    double contractAmount;

    ContractEmployee(String name, double contractAmount) {
        super(name);
        this.contractAmount = contractAmount;
    }

    // Override method
    void calculateSalary() {
        System.out.println(name + " (Contract) Salary: Rs " + contractAmount);
    }
}

// Main class
public class Q6_employee {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Full Time Employee
        System.out.print("Enter Full-Time Employee Name: ");
        String name1 = sc.nextLine();
        System.out.print("Enter Monthly Salary: ");
        double salary1 = sc.nextDouble();
        sc.nextLine(); // clear buffer

        // Part Time Employee
        System.out.print("Enter Part-Time Employee Name: ");
        String name2 = sc.nextLine();
        System.out.print("Enter Hours Worked: ");
        double hours = sc.nextDouble();
        System.out.print("Enter Rate per Hour: ");
        double rate = sc.nextDouble();
        sc.nextLine(); // clear buffer

        // Contract Employee
        System.out.print("Enter Contract Employee Name: ");
        String name3 = sc.nextLine();
        System.out.print("Enter Contract Amount: ");
        double contract = sc.nextDouble();

        Employee e1 = new FullTimeEmployee(name1, salary1);
        Employee e2 = new PartTimeEmployee(name2, hours, rate);
        Employee e3 = new ContractEmployee(name3, contract);

        System.out.println("\n--- Salaries ---");
        e1.calculateSalary();
        e2.calculateSalary();
        e3.calculateSalary();

        sc.close();
    }
}