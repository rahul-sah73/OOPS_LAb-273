/*
DATA HIDING:

Data hiding means hiding internal data from outside world.
This is done using PRIVATE access modifier.

IMPORTANT:
- Private data cannot be accessed directly
- It can only be accessed through public methods

ADVANTAGE:
✔ Prevents direct modification
✔ Protects important data
*/

class BankAccount {

    private double balance; // hidden data

    // Setter method → used to update balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Getter method → used to read balance
    public double getBalance() {
        return balance;
    }
}

public class Data_Hiding {

    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        acc.setBalance(10000);
        System.out.println("Balance: " + acc.getBalance());

        // acc.balance ❌ ERROR (private)
    }
}