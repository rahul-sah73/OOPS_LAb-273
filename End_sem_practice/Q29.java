// Q29: Write a Java program to create a Bank Account class with private attributes 
// and implement deposit, withdraw, and balance checking using encapsulation

import java.util.*;

class BankAccount {
    private String name;
    private int accountNumber;
    private double balance;

    // Constructor
    BankAccount(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Balance check method
    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    // Getter for name (example of encapsulation)
    public String getName() {
        return name;
    }
}

public class Q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();

        System.out.print("Enter account number: ");
        int accNo = sc.nextInt();

        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        BankAccount acc = new BankAccount(name, accNo, balance);

        System.out.print("Enter deposit amount: ");
        double dep = sc.nextDouble();
        acc.deposit(dep);

        System.out.print("Enter withdraw amount: ");
        double wd = sc.nextDouble();
        acc.withdraw(wd);

        acc.checkBalance();

        sc.close();
    }
}