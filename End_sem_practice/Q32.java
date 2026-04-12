// Q32: Write a Java program to create Appliance base class.
// SmartLight and SmartThermostat extend it.
// VoiceControlled interface for voice control.

import java.util.*;

// Base class
class Appliance {
    String name;

    Appliance(String name) {
        this.name = name;
    }

    void turnOn() {
        System.out.println(name + " is ON");
    }

    void turnOff() {
        System.out.println(name + " is OFF");
    }
}

// Interface
interface VoiceControlled {
    void voiceCommand(String command);
}

// SmartLight class
class SmartLight extends Appliance implements VoiceControlled {

    SmartLight(String name) {
        super(name);
    }

    @Override
    public void voiceCommand(String command) {
        if (command.equalsIgnoreCase("on")) {
            turnOn();
        } else if (command.equalsIgnoreCase("off")) {
            turnOff();
        } else {
            System.out.println("Invalid command for Light");
        }
    }
}

// SmartThermostat class
class SmartThermostat extends Appliance implements VoiceControlled {

    SmartThermostat(String name) {
        super(name);
    }

    @Override
    public void voiceCommand(String command) {
        if (command.equalsIgnoreCase("on")) {
            turnOn();
        } else if (command.equalsIgnoreCase("off")) {
            turnOff();
        } else {
            System.out.println("Invalid command for Thermostat");
        }
    }
}

public class Q32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        VoiceControlled device;

        System.out.println("1. Smart Light");
        System.out.println("2. Smart Thermostat");
        System.out.print("Choose device: ");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            device = new SmartLight("Smart Light");
        } else {
            device = new SmartThermostat("Smart Thermostat");
        }

        System.out.print("Enter voice command (on/off): ");
        String command = sc.nextLine();

        device.voiceCommand(command);

        sc.close();
    }
}