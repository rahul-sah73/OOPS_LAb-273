/*

To Draw a use case diagram to Identify actors such as Student, Instructor, and Admin. To Define use cases like Enroll in Course, 
Upload Material, Take Quiz, and Issue Certificate. To Show relationships between actors and use cases.


            Student                Instructor                 Admin
               |                       |                       |
               |                       |                       |
               |                       |                       |
        ---------------------------------------------------------------
        |                 Online Learning System                     |
        |                                                             |
        |      (Enroll in Course)  <------------- Student             |
        |                                                             |
        |      (Take Quiz)        <------------- Student              |
        |                                                             |
        |      (Upload Material)  <------------- Instructor           |
        |                                                             |
        |      (Issue Certificate) <------------- Admin               |
        |                                                             |
        ---------------------------------------------------------------


Write a Java program to Create a class Vehicle with a method move(). Create a subclass Car that overrides the move() method to 
display "Car is moving" instead of the default "Vehicle is moving".


*/
import java.util.Scanner;

class Vehicle {

    void move() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {

    
    void move() {
        System.out.println("Car is moving");
    }
}

public class Q8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Press 1 to move Vehicle");
        System.out.println("Press 2 to move Car");
        int choice = sc.nextInt();

        Vehicle v;

        if (choice == 1) {
            v = new Vehicle();
        } else {
            v = new Car();
        }

        v.move();

        sc.close();
    }
}