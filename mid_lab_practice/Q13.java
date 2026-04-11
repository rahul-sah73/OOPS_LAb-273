
/*

To Draw a use case diagram to implement Social Media Platform Actors such as User, Admin, Advertiser Use Cases like Create 
Account, Post Content, Like/Comment, Send Messages, Report User

             +-----------------------------+
             |     Social Media System     |
             |                             |
User --------| Create Account              |
User --------| Post Content                |
User --------| Like / Comment              |
User --------| Send Messages               |
User --------| Report User                 |
             |                             |
Admin -------| Manage Users                |
Admin -------| Remove Content              |
Admin -------| Handle Reports              |
             |                             |
Advertiser --| Create Ads                  |
Advertiser --| Manage Advertisements       |
             +-----------------------------+


Write a Java program to Person base class with name and age. Student and Teacher extend Person.Student adds rollNumber, grade; 
Teacher adds subject, salary.


*/

import java.util.Scanner;

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
    int rollNumber;
    String grade;

    Student(String name, int age, int rollNumber, String grade) {
        super(name, age);
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    void displayStudent() {
        displayPerson();
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }
}

class Teacher extends Person {
    String subject;
    double salary;

    Teacher(String name, int age, String subject, double salary) {
        super(name, age);
        this.subject = subject;
        this.salary = salary;
    }

    void displayTeacher() {
        displayPerson();
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);
    }
}

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String sName = sc.nextLine();
        System.out.print("Enter Student Age: ");
        int sAge = sc.nextInt();
        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Grade: ");
        String grade = sc.nextLine();

        Student s = new Student(sName, sAge, roll, grade);

        System.out.print("Enter Teacher Name: ");
        String tName = sc.nextLine();
        System.out.print("Enter Teacher Age: ");
        int tAge = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Subject: ");
        String subject = sc.nextLine();
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        Teacher t = new Teacher(tName, tAge, subject, salary);

        System.out.println("\nStudent Details:");
        s.displayStudent();

        System.out.println("\nTeacher Details:");
        t.displayTeacher();

        sc.close();
    }
}