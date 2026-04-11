// To Draw a class diagram to Identify classes for books, members, and staff. Define relationships like borrowing books, returning 
// books, and membership management. Include attributes such as book title, author, ISBN, member ID, and due date.

                // +----------------------+
                // |        Book          |
                // +----------------------+
                // | title : String       |
                // | author : String      |
                // | ISBN : String        |
                // | isAvailable : boolean|
                // +----------------------+
                // | borrowBook()         |
                // | returnBook()         |
                // +----------------------+


                // +----------------------+
                // |       Member         |
                // +----------------------+
                // | memberID : int       |
                // | name : String        |
                // +----------------------+
                // | borrowBook(Book)     |
                // | returnBook(Book)     |
                // +----------------------+


                // +----------------------+
                // |        Staff         |
                // +----------------------+
                // | staffID : int        |
                // | name : String        |
                // +----------------------+
                // | manageMembership()   |
                // +----------------------+


                // +----------------------+
                // |        Borrow        |
                // +----------------------+
                // | dueDate : String     |
                // +----------------------+
                // | showDetails()        |
                // +----------------------+

// Write a Java program that demonstrates single inheritance. Create a base class Person with attributes like name and age. Create a 
// derived class Student that extends Person and adds studentId and course. Implement a method to display student details.

import java.util.Scanner;

class person{
    String name ;
    int age ;

    person(String name , int age){
        this.name = name ;
        this.age =  age;
    }

    void details(){
        System.out.println("Name         : "+ name);
        System.out.println("Age          :"+ age);
    }
}

class Student extends person{
    String course;
    int stdid;

    Student(String name , int age , int stdid , String course){
        super(name , age );
        this.stdid = stdid;
        this.course = course ;

    }

    void details(){
        super.details();
        System.out.println("Student Id   : " + stdid);
        System.out.println("Course       : " + course);
    }
}

public class Q1{
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  String name = sc.nextLine();
  int age = sc.nextInt();
  int stdid = sc.nextInt();
  sc.nextLine();
  String course = sc.nextLine();

  Student  sd = new Student(name, age, stdid, course);
  sd.details();

  sc.close();
}
}


// import java.util.Scanner;

// class Person {
//     String name;
//     int age;

//     void input(Scanner sc) {
//         System.out.print("Enter Name: ");
//         name = sc.nextLine();

//         System.out.print("Enter Age: ");
//         age = sc.nextInt();
//         sc.nextLine();
//     }

//     void details() {
//         System.out.println("Name : " + name);
//         System.out.println("Age  : " + age);
//     }
// }

// class Student extends Person {
//     int studentId;
//     String course;

//     void inputStudent(Scanner sc) {
//         input(sc);   // calling parent input

//         System.out.print("Enter Student ID: ");
//         studentId = sc.nextInt();
//         sc.nextLine();

//         System.out.print("Enter Course: ");
//         course = sc.nextLine();
//     }

//     void details() {
//         super.details();
//         System.out.println("Student ID : " + studentId);
//         System.out.println("Course     : " + course);
//     }
// }

// public class Q1 {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         Student s = new Student();
//         s.inputStudent(sc);
//         s.details();

//         sc.close();
//     }
// }