import java.util.Scanner;

public class Operation {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // Arithematic Operators 
        System.out.println("enter 1st number ");
        int num1 = sc.nextInt();
        System.out.println("enter 2nd number ");
        int num2 = sc.nextInt();

        
        // Addition 
        int sum = num1 + num2;
        System.out.println("your addition of numbers is " + sum);
        
        //Subtraction 
        int sub = num1 - num2;
        System.out.println("your subtraction of numbers is " + sub);
        
        //Multiplication
        int product = num1 * num2 ;
        System.out.println("your product of numbers is " + product);
        
        //Division
        float div = num1 / num2;
        System.out.println("your divsion of numbers is " + div);
        
        //modules
        int mod = num1 % num2 ;
        System.out.println("your modulus of numbers is " + mod);


        // Unarry operator 

        //increament 
        System.out.println("++ increaser by 1 , num1 becomes" + ++num1 );
        //decreament 
        System.out.println("-- decrease by 1 , now num1 becomes" + --num1);

        //relational operator 
        System.out.println(num1 + " < " + num2 + " is " + (num1 < num2));
        System.out.println(num1 + " <= " + num2 + " is " +(num1 <= num2));
        System.out.println(num1 + " > " + num2 + " is " + (num1 > num2));
        System.out.println(num1 + " >= " + num2 + " is " +(num1 > num2));
        System.out.println(num1 + " == " + num2 + " is " + (num1 == num2));
        System.out.println(num1 + " != " + num2 + " is " + (num1 != num2));        

        // logical operator 

       // && ( and ) , || ( or ) , ! ( not )  are used in condional statment 
    }
}
