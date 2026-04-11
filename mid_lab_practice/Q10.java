/*
To Draw a use case diagram to Identify actors such as Customer and Bank Admin. Define use cases like Login, Transfer Funds, Pay 
Bills, View Account Statement, and Request Loan. Show relationships between customer actions and banking operations.



            Customer                     Bank Admin
               |                             |
               |                             |
               |                             |
      -----------------------------------------------------
      |                Banking System                     |
      |                                                   |
      |   (Login)                <--------- Customer      |
      |                                                   |
      |   (Transfer Funds)       <--------- Customer      |
      |                                                   |
      |   (Pay Bills)            <--------- Customer      |
      |                                                   |
      |   (View Account Statement) <------ Customer      |
      |                                                   |
      |   (Request Loan)         <--------- Customer      |
      |                                   ^
      |                                   |
      |                        (Approve / Manage Loan)
      |                                   ^
      |                                   |
      |                               Bank Admin
      |                                                   |
      -----------------------------------------------------

*/

import java.util.Scanner;

class Book {
    String title, author, ISBN;
    Scanner sc = new Scanner(System.in);

    void input() {
        System.out.println("Enter Title:");
        title = sc.nextLine();

        System.out.println("Enter Author:");
        author = sc.nextLine();

        System.out.println("Enter ISBN:");
        ISBN = sc.nextLine();
    }

    void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
    }
}

class EBook extends Book {
    double fileSize;

    void input() {
        super.input();
        System.out.println("Enter File Size (MB):");
        fileSize = sc.nextDouble();
        sc.nextLine();
    }

    void displayEBook() {
        super.displayBook();
        System.out.println("File Size: " + fileSize + " MB");
    }
}

class PrintedBook extends Book {
    int pageCount;

    void input() {
        super.input();
        System.out.println("Enter Page Count:");
        pageCount = sc.nextInt();
        sc.nextLine();
    }

    void displayPrintedBook() {
        super.displayBook();
        System.out.println("Page Count: " + pageCount);
    }
}

public class Q10 {
    public static void main(String[] args) {

        EBook eb = new EBook();
        PrintedBook pb = new PrintedBook();

        System.out.println("\nEnter EBook Details");
        eb.input();
        eb.displayEBook();

        System.out.println("\nEnter Printed Book Details");
        pb.input();
        pb.displayPrintedBook();
    }
}