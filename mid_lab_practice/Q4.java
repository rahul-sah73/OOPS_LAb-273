/*
To Draw a class diagram to Identify classes such as student, course, professor, and department. To Show relationships like students 
enrolling in courses, professors teaching courses, and departments offering courses. Include attributes like course code, student name, 
professor specialization, and department name.
*/

/*

+--------------------+
|      Student       |
+--------------------+
| studentID          |
| studentName        |
| email              |
+--------------------+
| enrollCourse()     |
| viewCourses()      |
+--------------------+
        |
        | enrolls in
        | 1..*
        v
+--------------------+
|       Course       |
+--------------------+
| courseCode         |
| courseName         |
| credits            |
+--------------------+
| addStudent()       |
| removeStudent()    |
+--------------------+
        ^
        |
        | teaches
        | 1
+--------------------+
|     Professor      |
+--------------------+
| professorID        |
| name               |
| specialization     |
+--------------------+
| teachCourse()      |
+--------------------+

        ^
        |
        | offers
        | 1..*
+--------------------+
|    Department      |
+--------------------+
| departmentID       |
| departmentName     |
| location           |
+--------------------+
| manageCourses()    |
+--------------------+

*/

/*

Write a Java program that defines a class Calculator with overloaded methods add() that can take two, three, or four integers. To 
Demonstrate method overloading by calling different versions of the add() method in the main method.


*/
import java.util.Scanner;

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}

public class Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator c = new Calculator();

        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum = " + c.add(a, b));

        System.out.println("Enter three numbers:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        System.out.println("Sum = " + c.add(x, y, z));

        System.out.println("Enter four numbers:");
        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();
        int s = sc.nextInt();
        System.out.println("Sum = " + c.add(p, q, r, s));
        sc.close();
    }
}
