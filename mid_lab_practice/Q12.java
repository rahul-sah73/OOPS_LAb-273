/*

To Draw a use case diagram to implement Flight Reservation System Actors such as Passenger, Airline Staff, System. Use cases like 
search Flights, Book Ticket, Cancel Ticket, Check Flight Status, Issue Boarding Pass

           Passenger                Airline Staff                System
              |                         |                         |
              |                         |                         |
              |                         |                         |
      ----------------------------------------------------------------------
      |                 Flight Reservation System                        |
      |                                                                   |
      |   (Search Flights)        <------------- Passenger                |
      |                                                                   |
      |   (Book Ticket)           <------------- Passenger                |
      |                                                                   |
      |   (Cancel Ticket)         <------------- Passenger                |
      |                                                                   |
      |   (Check Flight Status)   <------------- Passenger                |
      |                                            <------ Airline Staff  |
      |                                                                   |
      |   (Issue Boarding Pass)    <------------- Airline Staff           |
      |                                                                   |
      ----------------------------------------------------------------------

Write a Java program to Vehicle class with brand and speed attributes.Car extends Vehicle and adds fuelType. SportsCar extends 
Car and adds accelerationTime. Implement a method displayDetails() in each class.



*/

import java.util.Scanner;

class Vehicle {
    String brand;
    int speed;
    static Scanner sc = new Scanner(System.in);

    void input() {
        System.out.println("Enter Brand:");
        brand = sc.nextLine();

        System.out.println("Enter Speed:");
        speed = sc.nextInt();
        sc.nextLine();
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }
}

class Car extends Vehicle {
    String fuelType;

    void input() {
        super.input();
        System.out.println("Enter Fuel Type:");
        fuelType = sc.nextLine();
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Fuel Type: " + fuelType);
    }
}

class SportsCar extends Car {
    double accelerationTime;

    void input() {
        super.input();
        System.out.println("Enter Acceleration Time (0-100 km/h in seconds):");
        accelerationTime = sc.nextDouble();
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Acceleration Time: " + accelerationTime + " seconds");
    }
}

public class Q12 {
    public static void main(String[] args) {

        SportsCar sc = new SportsCar();

        sc.input();

        System.out.println("\nVehicle Details:");
        sc.displayDetails();
    }
}