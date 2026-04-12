import java.util.Scanner;

class Bank {

    // Cash deposit
    void deposit(double amount) {
        System.out.println("Cash Deposit Successful");
        System.out.println("Amount Deposited: ₹" + amount);
    }

    // Cheque deposit
    void deposit(double amount, String chequeNumber) {
        System.out.println("Cheque Deposit Successful");
        System.out.println("Amount Deposited: ₹" + amount);
        System.out.println("Cheque Number: " + chequeNumber);
    }

    // Online transfer deposit
    void deposit(double amount, String transactionId, String bankName) {
        System.out.println("Online Transfer Successful");
        System.out.println("Amount Deposited: ₹" + amount);
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Bank Name: " + bankName);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank b = new Bank();

        System.out.println("Select Deposit Type:");
        System.out.println("1. Cash");
        System.out.println("2. Cheque");
        System.out.println("3. Online Transfer");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter Amount: ");
                double cashAmount = sc.nextDouble();
                b.deposit(cashAmount);
                break;

            case 2:
                System.out.print("Enter Amount: ");
                double chequeAmount = sc.nextDouble();
                System.out.print("Enter Cheque Number: ");
                String chequeNo = sc.next();
                b.deposit(chequeAmount, chequeNo);
                break;

            case 3:
                System.out.print("Enter Amount: ");
                double onlineAmount = sc.nextDouble();
                System.out.print("Enter Transaction ID: ");
                String transactionId = sc.next();
                System.out.print("Enter Bank Name: ");
                String bankName = sc.next();
                b.deposit(onlineAmount, transactionId, bankName);
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}