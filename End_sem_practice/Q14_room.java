// Write a java program to Create a base class Room with a method getRate(). Subclasses as Deluxe Room (higher rate with extra facilities) Standard Room (basic rate)
// Use a list of Room references to calculate and display total booking cost dynamically.

import java.util.Scanner;

// Base class
class Room {
    double getRate() {
        return 0;
    }
}

// Deluxe Room
class DeluxeRoom extends Room {
    @Override
    double getRate() {
        return 3000; // higher rate
    }
}

// Standard Room
class StandardRoom extends Room {
    @Override
    double getRate() {
        return 1500; // basic rate
    }
}

// Main class
public class Q14_room {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rooms: ");
        int n = sc.nextInt();

        Room[] rooms = new Room[n];

        // Input room types
        for (int i = 0; i < n; i++) {
            System.out.println("Enter type for room " + (i + 1) + " (1-Deluxe, 2-Standard): ");
            int type = sc.nextInt();

            if (type == 1) {
                rooms[i] = new DeluxeRoom();
            } else {
                rooms[i] = new StandardRoom();
            }
        }

        double total = 0;

        // Calculate total cost dynamically
        for (int i = 0; i < rooms.length; i++) {
            total += rooms[i].getRate();
        }

        System.out.println("Total Booking Cost: Rs " + total);

        sc.close();
    }
}