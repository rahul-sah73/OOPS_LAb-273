/*

To Draw a use case diagram to implement Hotel Management System Actors like Guest, Hotel Manager, Receptionist Use Cases 
Check Availability, Make Reservation, Cancel Booking, Room Service Request


           +----------------------------------+
           |     Hotel Management System      |
           |                                  |
Guest -----| Check Availability               |
Guest -----| Make Reservation                 |
Guest -----| Cancel Booking                   |
Guest -----| Room Service Request             |
           |                                  |
Receptionist -- Manage Reservations           |
Receptionist -- Check Availability            |
           |                                  |
Hotel Manager -- Manage Rooms                 |
Hotel Manager -- View Reports                 |
           +----------------------------------+


Write a Java program to Appliance base class. SmartLight and SmartThermostat extend it.VoiceControlled interface for voice 
control.

*/

import java.util.Scanner;

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

class SmartLight extends Appliance {

    SmartLight(String name) {
        super(name);
    }

    void voiceControl(String command) {
        System.out.println("SmartLight voice command: " + command);
    }
}

class SmartThermostat extends Appliance {

    SmartThermostat(String name) {
        super(name);
    }

    void voiceControl(String command) {
        System.out.println("SmartThermostat voice command: " + command);
    }
}

public class Q16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Smart Light name: ");
        String lightName = sc.nextLine();

        SmartLight light = new SmartLight(lightName);
        light.turnOn();

        System.out.print("Enter voice command for Smart Light: ");
        String cmd1 = sc.nextLine();
        light.voiceControl(cmd1);

        light.turnOff();

        System.out.print("\nEnter Smart Thermostat name: ");
        String thermoName = sc.nextLine();

        SmartThermostat thermostat = new SmartThermostat(thermoName);
        thermostat.turnOn();

        System.out.print("Enter voice command for Smart Thermostat: ");
        String cmd2 = sc.nextLine();
        thermostat.voiceControl(cmd2);

        thermostat.turnOff();

        sc.close();
    }
}
