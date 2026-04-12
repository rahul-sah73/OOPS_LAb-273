// Q33: Write a Java program to create an interface Payment with method pay().
// Implement classes for CreditCard, DebitCard, and UPI.

import java.util.*;

// Interface
interface Payment {
    void pay(double amount);
}

// CreditCard class
class CreditCard implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

// DebitCard class
class DebitCard implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Debit Card");
    }
}

// UPI class
class UPI implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

public class Q33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Payment p;

        System.out.println("1. Credit Card");
        System.out.println("2. Debit Card");
        System.out.println("3. UPI");
        System.out.print("Choose payment method: ");
        int choice = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        if (choice == 1) {
            p = new CreditCard();
        } else if (choice == 2) {
            p = new DebitCard();
        } else {
            p = new UPI();
        }

        p.pay(amount);

        sc.close();
    }
}