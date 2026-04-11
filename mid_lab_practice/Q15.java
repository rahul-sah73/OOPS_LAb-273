/*
To Draw a use case diagram to implement Event Management System Actors such as Event Organizer, Attendee, System Use Cases 
like as Create Event, Register for Event, Cancel Registration, View Event Details

             +----------------------------------+
             |     Event Management System      |
             |                                  |
Organizer ---| Create Event                     |
Organizer ---| Update / Manage Event            |
             |                                  |
Attendee ----| Register for Event               |
Attendee ----| Cancel Registration              |
Attendee ----| View Event Details               |
             |                                  |
System ------| Store Event Information          |
System ------| Manage Registrations             |
             +----------------------------------+


Write a Java program to User (base class) with name, email. Buyer and Seller extend it.Implement methods for transactions.

*/

import java.util.Scanner;

class User {
    String name;
    String email;

    User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    void displayUser() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}

class Buyer extends User {

    Buyer(String name, String email) {
        super(name, email);
    }

    void buyItem(String item, double price) {
        System.out.println(name + " bought " + item + " for ₹" + price);
    }
}

class Seller extends User {

    Seller(String name, String email) {
        super(name, email);
    }

    void sellItem(String item, double price) {
        System.out.println(name + " sold " + item + " for ₹" + price);
    }
}

public class Q15
 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Buyer Name: ");
        String bName = sc.nextLine();
        System.out.print("Enter Buyer Email: ");
        String bEmail = sc.nextLine();

        Buyer b = new Buyer(bName, bEmail);

        System.out.print("Enter Item Buyer wants to buy: ");
        String item1 = sc.nextLine();
        System.out.print("Enter Item Price: ");
        double price1 = sc.nextDouble();
        sc.nextLine();

        b.buyItem(item1, price1);

        System.out.print("\nEnter Seller Name: ");
        String sName = sc.nextLine();
        System.out.print("Enter Seller Email: ");
        String sEmail = sc.nextLine();

        Seller s = new Seller(sName, sEmail);

        System.out.print("Enter Item Seller wants to sell: ");
        String item2 = sc.nextLine();
        System.out.print("Enter Item Price: ");
        double price2 = sc.nextDouble();

        s.sellItem(item2, price2);

        sc.close();
    }
}