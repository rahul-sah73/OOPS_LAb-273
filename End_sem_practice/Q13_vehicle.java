//Write a java program to create a Vehicle class with constructor initializing speed.Create a Bike class that initializes engine capacity and displays both details.




import java.util.Scanner;

// Base class
class Vehicle {
    int speed;

    Vehicle(int speed) {
        this.speed = speed;
    }
}

// Subclass
class Bike extends Vehicle {
    int engineCapacity;

    Bike(int speed, int engineCapacity) {
        super(speed);
        this.engineCapacity = engineCapacity;
    }

    void display() {
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Engine Capacity: " + engineCapacity + " cc");
    }
}

// Main class
public class Q13_vehicle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Speed: ");
        int speed = sc.nextInt();

        System.out.print("Enter Engine Capacity (cc): ");
        int engine = sc.nextInt();

        Bike b = new Bike(speed, engine);
        b.display();

        sc.close();
    }
}