// Write a Java program to Create a class Vehicle with a method move().
// Create a subclass Car that overrides the move() method to
// display "Car is moving" instead of the default "Vehicle is moving".

class Vehicle {
    void move() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {

    @Override
    void move() {
        System.out.println("Car is moving");
    }
}

public class Q16_vehicle {
    public static void main(String[] args) {

        Vehicle v = new Vehicle();
        v.move();

        Vehicle c = new Car(); // polymorphism
        c.move();
    }
}