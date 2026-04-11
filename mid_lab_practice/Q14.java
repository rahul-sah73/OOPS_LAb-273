/*

To Draw a use case diagram to implement Car Rental System Actors such as Customer, Rental Agent, System Use Cases like 
Search Cars, Book Car, Return Car, Extend Rental, Make Payment

              +--------------------------------+
              |        Car Rental System       |
              |                                |
Customer -----| Search Cars                    |
Customer -----| Book Car                       |
Customer -----| Extend Rental                  |
Customer -----| Make Payment                   |
              |                                |
Rental Agent -| Return Car                     |
Rental Agent -| Manage Booking                 |
              |                                |
System -------| Process Payment                |
System -------| Update Car Availability        |
              +--------------------------------+


Write a Java program to Account base class with deposit() and withdraw().SavingsAccount and CurrentAccount override withdraw() 
to apply different rules
*/

import java.util.Scanner;

class Account {
    double balance;

    Account(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount deposited: " + amount);
        System.out.println("Balance: " + balance);
    }

    void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("Amount withdrawn: " + amount);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Account {

    SavingsAccount(double balance) {
        super(balance);
    }

    void withdraw(double amount) {
        if (balance - amount < 500) {
            System.out.println("Withdrawal denied. Minimum balance of 500 required.");
        } else {
            balance = balance - amount;
            System.out.println("Savings Withdrawal: " + amount);
            System.out.println("Balance: " + balance);
        }
    }
}

class CurrentAccount extends Account {

    CurrentAccount(double balance) {
        super(balance);
    }

    void withdraw(double amount) {
        if (amount > balance + 1000) {
            System.out.println("Overdraft limit exceeded.");
        } else {
            balance = balance - amount;
            System.out.println("Current Account Withdrawal: " + amount);
            System.out.println("Balance: " + balance);
        }
    }
}

public class Q14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial Savings balance: ");
        double sb = sc.nextDouble();

        SavingsAccount s = new SavingsAccount(sb);

        System.out.print("Enter amount to deposit in Savings: ");
        double dep = sc.nextDouble();
        s.deposit(dep);

        System.out.print("Enter amount to withdraw from Savings: ");
        double w = sc.nextDouble();
        s.withdraw(w);

        System.out.print("\nEnter initial Current balance: ");
        double cb = sc.nextDouble();

        CurrentAccount c = new CurrentAccount(cb);

        System.out.print("Enter amount to deposit in Current: ");
        double dep2 = sc.nextDouble();
        c.deposit(dep2);

        System.out.print("Enter amount to withdraw from Current: ");
        double w2 = sc.nextDouble();
        c.withdraw(w2);

        sc.close();
    }
}