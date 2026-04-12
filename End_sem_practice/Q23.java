// Q23: Write a Java program to create Smart Home System using interfaces where devices like Lights and Fan implement a common interface

import java.util.Scanner;

// Common Interface
interface SmartDevice {
    void turnOn();
    void turnOff();
}

// Light class implementing interface
class Light implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("Light is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is OFF");
    }
}

// Fan class implementing interface
class Fan implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("Fan is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan is OFF");
    }
}

public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SmartDevice device;

        System.out.println("1. Light");
        System.out.println("2. Fan");
        System.out.print("Choose device: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            device = new Light();
        } else {
            device = new Fan();
        }

        System.out.println("1. Turn ON");
        System.out.println("2. Turn OFF");
        System.out.print("Choose action: ");
        int action = sc.nextInt();

        if (action == 1) {
            device.turnOn();
        } else {
            device.turnOff();
        }

        sc.close();
    }
}