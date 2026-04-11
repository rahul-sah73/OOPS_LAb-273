/*

To Draw a use case diagram to implement E-Commerce System actors such as Customer, Seller, Admin, Payment System. Use cases 
like Add to Cart, Checkout, Make Payment, Track Order, Cancel Order, Manage Inventory


        Customer                 Seller                 Admin            Payment System
           |                       |                     |                     |
           |                       |                     |                     |
           |                       |                     |                     |
   -------------------------------------------------------------------------------
   |                        E-Commerce System                                  |
   |                                                                            |
   |   (Add to Cart)          <------------- Customer                           |
   |                                                                            |
   |   (Checkout)             <------------- Customer                           |
   |                                                                            |
   |   (Make Payment)         <------------- Customer ---------> Payment System |
   |                                                                            |
   |   (Track Order)          <------------- Customer                           |
   |                                                                            |
   |   (Cancel Order)         <------------- Customer                           |
   |                                                                            |
   |   (Manage Inventory)     <------------- Seller                             |
   |                                       <------------- Admin                 |
   |                                                                            |
   -------------------------------------------------------------------------------

   Write a Java program to Create a class Person with a constructor initializing name and age.Derive a class Doctor that adds 
specialization.Call the base class constructor using super().


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

class Doctor extends Person {
    String specialization;

    Doctor(String name, int age, String specialization) {
        super(name, age);   // calling base class constructor
        this.specialization = specialization;
    }

    void displayDoctor() {
        super.displayPerson();
        System.out.println("Specialization: " + specialization);
    }
}

public class Q11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name:");
        String name = sc.nextLine();

        System.out.println("Enter Age:");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Specialization:");
        String specialization = sc.nextLine();

        Doctor d = new Doctor(name, age, specialization);

        d.displayDoctor();
        sc.close();
    }
}