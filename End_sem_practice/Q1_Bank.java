// Write a java program to Create a bank transaction program where a method deposit() is overloaded to support cash deposit, cheque deposit, and online transfer.

import java.util.Scanner;

class bank{
    //cash deposite
    void deposite(double amount){
        System.out.println("Cash deposition Successful");
        System.out.println("Amount Deposited: Rs " + amount);
    }

    //checque deposite 
    void deposite(String cq_no , double amount){
        System.out.println("Cheque deposition successful");
        System.out.println("Rs" + amount +" deposited to cheque no " + cq_no);
    }

    //online transfer 
    void deposite(int number , double amount ){
        System.out.println("Online transaction Successful");
        System.out.println("Rs" + amount +" deposited to number  " + number);
    }
}


public class Q1_Bank {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        
        bank b = new bank();

        System.out.println("Select deposition type ");
        System.out.println("1 -> cash deposition");
        System.out.println("2 -> cheque deposition");
        System.out.println("3 -> online transfer");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter amount: ");
                double cash_amount = sc.nextDouble();
                b.deposite(cash_amount);

                break;
            case 2:
                System.out.println("Enter amount");
                double cq_amount = sc.nextDouble();
                sc.nextLine();
                System.out.println("Enter cheque no");
                String chq_no = sc.nextLine();
                b.deposite(chq_no, cq_amount);

                break;

            case 3:
                System.out.print("Enter Amount: ");
                double onlineAmount = sc.nextDouble();
                System.out.print("Enter Number to transfer: ");
                int number = sc.nextInt();
                b.deposite(number , onlineAmount);
                break;
    
            default:
                break;
        }
        sc.close();

    }
    
}
