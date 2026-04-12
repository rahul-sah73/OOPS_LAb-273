// Write a Java program to design a Bank Account class with private attributes and implement deposit, withdraw, and balance checking using encapsulation

import java.util.Scanner;

class BankAccount {

    // private attributes
    private String name;
    private int accountNumber;
    private double balance;

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid initial balance");
        }
    }

    // deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs " + amount);
        } else {
            System.out.println("Invalid amount");
        }
    }

    // withdraw
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else if (amount <= 0) {
            System.out.println("Invalid amount");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: Rs " + amount);
        }
    }
}

public class Q9_banking{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount();

        System.out.print("Enter Name: ");
        acc.setName(sc.nextLine());

        System.out.print("Enter Account Number: ");
        acc.setAccountNumber(sc.nextInt());

        System.out.print("Enter Initial Balance: ");
        acc.setBalance(sc.nextDouble());

        int choice;

        do {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Display Info");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount: ");
                    acc.deposit(sc.nextDouble());
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    acc.withdraw(sc.nextDouble());
                    break;

                case 3:
                    System.out.println("Current Balance: Rs " + acc.getBalance());
                    break;

                case 4:
                    System.out.println("Name: " + acc.getName());
                    System.out.println("Account No: " + acc.getAccountNumber());
                    break;

                case 5:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);

        sc.close();
    }
}