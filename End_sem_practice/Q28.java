// Q28: Write a Java program to create Account base class with deposit() and withdraw().
// Savings Account and Current Account override withdraw() to apply different rules.

import java.util.*;

class Account {
    double balance;

    Account(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void display() {
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    double minBalance = 500;

    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    void withdraw(double amount) {
        if (balance - amount >= minBalance) {
            balance -= amount;
            System.out.println("Savings Withdrawn: " + amount);
        } else {
            System.out.println("Cannot withdraw. Minimum balance must be maintained.");
        }
    }
}

class CurrentAccount extends Account {
    double overdraftLimit = 1000;

    CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    void withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
            System.out.println("Current Withdrawn: " + amount);
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }
}

public class Q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        System.out.print("Choose account type: ");
        int choice = sc.nextInt();

        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        Account acc;

        if (choice == 1) {
            acc = new SavingsAccount(balance);
        } else {
            acc = new CurrentAccount(balance);
        }

        System.out.print("Enter deposit amount: ");
        double dep = sc.nextDouble();
        acc.deposit(dep);

        System.out.print("Enter withdraw amount: ");
        double wd = sc.nextDouble();
        acc.withdraw(wd);

        acc.display();

        sc.close();
    }
}