// Q24: Write a Java program to create Vehicle class with brand and speed attributes.
// Car extends Vehicle and adds fuelType.
// SportsCar extends Car and adds accelerationTime.
// Implement a method displayDetails() in each class.

import java.util.Scanner;

class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }
}

class Car extends Vehicle {
    String fuelType;

    Car(String brand, int speed, String fuelType) {
        super(brand, speed);
        this.fuelType = fuelType;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Fuel Type: " + fuelType);
    }
}

class SportsCar extends Car {
    double accelerationTime;

    SportsCar(String brand, int speed, String fuelType, double accelerationTime) {
        super(brand, speed, fuelType);
        this.accelerationTime = accelerationTime;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Acceleration Time (0-100 km/h): " + accelerationTime + " seconds");
    }
}

public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input
        System.out.print("Enter brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter speed: ");
        int speed = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter fuel type: ");
        String fuelType = sc.nextLine();

        System.out.print("Enter acceleration time: ");
        double accTime = sc.nextDouble();

        // creating object
        SportsCar car = new SportsCar(brand, speed, fuelType, accTime);

        // displaying details
        System.out.println("\nSports Car Details:");
        car.displayDetails();

        sc.close();
    }
}