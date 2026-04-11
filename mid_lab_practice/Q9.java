/*

To Draw a use case diagram to Identify actors such as Guest, Receptionist, and Admin. To Define use cases like Search Room, Make 
Reservation, Cancel Booking, and Check-In/Check-Out. To Show interactions between the guest and hotel management.


          Guest                Receptionist                 Admin
            |                       |                         |
            |                       |                         |
            |                       |                         |
     ---------------------------------------------------------------
     |                Hotel Management System                     |
     |                                                            |
     |      (Search Room)        <------------- Guest             |
     |                                                            |
     |      (Make Reservation)   <------------- Guest             |
     |                                                            |
     |      (Cancel Booking)     <------------- Guest             |
     |                                                            |
     |      (Check-In / Check-Out) <--------- Receptionist        |
     |                                                            |
     |      (Manage System / Records) <-------- Admin             |
     |                                                            |
     ---------------------------------------------------------------

Write a Java program to Implement a class Employee with attributes name and salary. Derive Manager from Employee and add an 
attribute teamSize. Further derive ProjectManager from Manager and add projectName. Display details using appropriate methods.



*/
import java.util.*;

class EmployeeQ9{
    String name;
    double salary;
static Scanner sc = new Scanner(System.in);
    void input(){
        System.out.println("Enter name");
        name = sc.nextLine();

        System.out.println("Enter salary");
        salary = sc.nextDouble();
        sc.nextLine();
    }

    void displayEmployee(){
        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);
    }
}

class Manager extends EmployeeQ9{
    int teamSize;

    void input(){
        super.input();
        System.out.println("Enter team size");
        teamSize = sc.nextInt();
        sc.nextLine();
    }

    void displayManager(){
        super.displayEmployee();
        System.out.println("Team Size : " + teamSize);
    }
}

class ProjectManager extends Manager{
    String projectName;

    void input(){
        super.input();
        System.out.println("Enter project name");
        projectName = sc.nextLine();
    }

    void displayProjectManager(){
        super.displayManager();
        System.out.println("Project Name : " + projectName);
    }
}

public class Q9{
    public static void main(String[] args){
        ProjectManager pm = new ProjectManager();
        pm.input();
        pm.displayProjectManager();
    }
}