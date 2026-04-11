/*

To Draw a use case diagram to Identify actors such as Customer, Restaurant, and Delivery Agent. To Define use cases like Browse 
Menu, Place Order, Make Payment, Track Order, and Deliver Order. Show interactions between these actors.

                Customer
                   |
                   |
        ----------------------------
        |        Browse Menu       |
        |        Place Order       |
        |        Make Payment      |
        |        Track Order       |
        |                          |
        |       Food Ordering      |
        |          System          |
        |                          |
        |        Deliver Order     |
        ----------------------------
                   | 
                   |
             Delivery Agent
                   |
                   |
               Restaurant
                   |
                   |
               Place Order



Write a java program to Create a base class Room with a method getRate(). Subclasses as Deluxe Room (higher rate with extra 
facilities) Standard Room (basic rate)
Use a list of Room references to calculate and display total booking cost dynamically.


*/  

import java.util.Scanner;

class Room {
    double getRate() {
        return 0;
    }
}

class DeluxeRoom extends Room {
    double rate;

    DeluxeRoom(double rate) {
        this.rate = rate;
    }

    double getRate() {
        return rate;
    }
}

class StandardRoom extends Room {
    double rate;

    StandardRoom(double rate) {
        this.rate = rate;
    }

    double getRate() {
        return rate;
    }
}

public class Q7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Deluxe Room rate: ");
        double dr = sc.nextDouble();

        System.out.print("Enter Standard Room rate: ");
        double sr = sc.nextDouble();

        Room r1 = new DeluxeRoom(dr);
        Room r2 = new StandardRoom(sr);

        double total = r1.getRate() + r2.getRate();

        System.out.println("Total Booking Cost = " + total);
        sc.close();
    }
}