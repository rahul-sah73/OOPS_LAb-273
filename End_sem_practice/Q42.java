// Q42: Write a Java program to create a system where different types of employees 
// FullTimeEmployee, PartTimeEmployee, ContractEmployee have different salary structures 
// and override calculateSalary() in each subclass. In main(), create employee objects and call calculateSalary().

import java.util.*;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void calculateSalary() {
        System.out.println("Salary calculation not defined");
    }
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    void calculateSalary() {
        System.out.println(name + " (Full-Time) Salary: " + monthlySalary);
    }
}

class PartTimeEmployee extends Employee {
    double hoursWorked;
    double ratePerHour;

    PartTimeEmployee(String name, double hoursWorked, double ratePerHour) {
        super(name);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    @Override
    void calculateSalary() {
        double salary = hoursWorked * ratePerHour;
        System.out.println(name + " (Part-Time) Salary: " + salary);
    }
}

class ContractEmployee extends Employee {
    double contractAmount;

    ContractEmployee(String name, double contractAmount) {
        super(name);
        this.contractAmount = contractAmount;
    }

    @Override
    void calculateSalary() {
        System.out.println(name + " (Contract) Salary: " + contractAmount);
    }
}

public class Q42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Full-Time Employee
        System.out.print("Enter Full-Time Employee name: ");
        String name1 = sc.nextLine();
        System.out.print("Enter monthly salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();
        Employee e1 = new FullTimeEmployee(name1, salary);

        // Part-Time Employee
        System.out.print("\nEnter Part-Time Employee name: ");
        String name2 = sc.nextLine();
        System.out.print("Enter hours worked: ");
        double hours = sc.nextDouble();
        System.out.print("Enter rate per hour: ");
        double rate = sc.nextDouble();
        sc.nextLine();
        Employee e2 = new PartTimeEmployee(name2, hours, rate);

        // Contract Employee
        System.out.print("\nEnter Contract Employee name: ");
        String name3 = sc.nextLine();
        System.out.print("Enter contract amount: ");
        double contract = sc.nextDouble();
        Employee e3 = new ContractEmployee(name3, contract);

        // Display salaries
        System.out.println("\nEmployee Salaries:");
        e1.calculateSalary();
        e2.calculateSalary();
        e3.calculateSalary();

        sc.close();
    }
}