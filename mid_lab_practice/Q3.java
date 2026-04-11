// To Draw a class diagram to Define classes for doctors, patients, appointments, and prescriptions. To Show relationships between 
// doctors treating patients, appointments scheduling, and prescriptions being issued.Include attributes such as doctor ID, patient 
// history, and appointment date.

/*
+-------------------+
|      Doctor       |
+-------------------+
| doctorID          |
| name              |
| specialization    |
| contactNumber     |
+-------------------+
| diagnosePatient() |
| issuePrescription()|
+-------------------+
        |
        | treats
        | 1..*
        v
+-------------------+
|      Patient      |
+-------------------+
| patientID         |
| name              |
| age               |
| patientHistory    |
+-------------------+
| viewHistory()     |
+-------------------+

        |
        | schedules
        | 1..*
        v
+-------------------+
|   Appointment     |
+-------------------+
| appointmentID     |
| appointmentDate   |
| time              |
| status            |
+-------------------+
| schedule()        |
| cancel()          |
+-------------------+

        |
        | issues
        | 1
        v
+-------------------+
|   Prescription    |
+-------------------+
| prescriptionID    |
| medicineName      |
| dosage            |
| instructions      |
+-------------------+
| generatePrescription() |
+-------------------+
 */

/*
    Write a java program to Create a system where different types of employees FullTimeEmployee, PartTimeEmployee, 
    ContractEmployee have different salary structures and Override calculateSalary() in each subclass. In main (), create employee 
    objects and call calculateSalary().
*/
import java.util.Scanner;

class Employee {
    void calculateSalary(Scanner sc) {
        System.out.println("Salary calculation");
    }
}

class FullTimeEmployee extends Employee {
    void calculateSalary(Scanner sc) {
        System.out.print("Enter monthly salary: ");
        double salary = sc.nextDouble();
        System.out.println("Full Time Employee Salary: " + salary);
    }
}

class PartTimeEmployee extends Employee {
    void calculateSalary(Scanner sc) {
        System.out.print("Enter hours worked: ");
        int hours = sc.nextInt();

        System.out.print("Enter hourly rate: ");
        double rate = sc.nextDouble();

        System.out.println("Part Time Employee Salary: " + (hours * rate));
    }
}

class ContractEmployee extends Employee {
    void calculateSalary(Scanner sc) {
        System.out.print("Enter contract amount: ");
        double amount = sc.nextDouble();

        System.out.println("Contract Employee Salary: " + amount);
    }
}

public class Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee e1 = new FullTimeEmployee();
        Employee e2 = new PartTimeEmployee();
        Employee e3 = new ContractEmployee();

        e1.calculateSalary(sc);
        e2.calculateSalary(sc);
        e3.calculateSalary(sc);

        sc.close();
    }
}