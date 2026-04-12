// Q31: Write a Java program to create an abstract class Vehicle with methods start() and fuelType()
// and implement subclasses Car and ElectricBike.

// import java.util.*;

abstract class Vehicle {
    abstract void start();
    abstract void fuelType();
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts with a key or button.");
    }

    @Override
    void fuelType() {
        System.out.println("Car uses Petrol/Diesel.");
    }
}

class ElectricBike extends Vehicle {

    @Override
    void start() {
        System.out.println("Electric Bike starts with a button.");
    }

    @Override
    void fuelType() {
        System.out.println("Electric Bike uses Electricity.");
    }
}

public class Q31 {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new ElectricBike();

        System.out.println("Car Details:");
        v1.start();
        v1.fuelType();

        System.out.println("\nElectric Bike Details:");
        v2.start();
        v2.fuelType();
    }
}