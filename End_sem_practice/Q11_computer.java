// Write a Java program where a computer class contains a method showConfiguration().
// To Create a laptop class that extends Computer and adds battery information.

import java.util.Scanner;

// Base class
class Computer {
    String processor;
    int ram;

    Computer(String processor, int ram) {
        this.processor = processor;
        this.ram = ram;
    }

    void showConfiguration() {
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram + " GB");
    }
}

// Subclass
class Laptop extends Computer {
    int battery;

    Laptop(String processor, int ram, int battery) {
        super(processor, ram);
        this.battery = battery;
    }

    // overriding method
    @Override
    void showConfiguration() {
        super.showConfiguration();
        System.out.println("Battery: " + battery + " mAh");
    }
}

// Main class
public class Q11_computer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Processor: ");
        String processor = sc.nextLine();

        System.out.print("Enter RAM (GB): ");
        int ram = sc.nextInt();

        System.out.print("Enter Battery (mAh): ");
        int battery = sc.nextInt();

        Laptop l = new Laptop(processor, ram, battery);
        l.showConfiguration();

        sc.close();
    }
}