/*
To Draw a class diagram to Design classes for customers, accounts, transactions, and loans. To Show relationships such as customers 
owning accounts, accounts having transactions, and loans being issued. To Include attributes like account number, balance, 
transaction type, and loan amount.
*/


/*

+--------------------+
|      Customer      |
+--------------------+
| customerID         |
| customerName       |
| address            |
| phoneNumber        |
+--------------------+
| openAccount()      |
| requestLoan()      |
+--------------------+
        |
        | owns
        | 1..*
        v
+--------------------+
|      Account       |
+--------------------+
| accountNumber      |
| balance            |
| accountType        |
+--------------------+
| deposit()          |
| withdraw()         |
| checkBalance()     |
+--------------------+
        |
        | has
        | 1..*
        v
+--------------------+
|    Transaction     |
+--------------------+
| transactionID      |
| transactionType    |
| amount             |
| date               |
+--------------------+
| processTransaction()|
+--------------------+

        |
        | issues
        | 1..*
        v
+--------------------+
|        Loan        |
+--------------------+
| loanID             |
| loanAmount         |
| interestRate       |
| duration           |
+--------------------+
| approveLoan()      |
| calculateInterest()|
+--------------------+  

*/

/*

Write a java program to Create a base class Animal with a method makeSound(). Create subclasses Dog and Cat that override 
makeSound(). Demonstrate runtime polymorphism by calling makeSound() using a reference of Animal.


*/


import java.util.Scanner;

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class Q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter choice (1-Dog, 2-Cat):");
        int choice = sc.nextInt();

        Animal a;

        if (choice == 1) {
            a = new Dog();
        } else {
            a = new Cat();
        }

        a.makeSound();

        sc.close();
    }
}