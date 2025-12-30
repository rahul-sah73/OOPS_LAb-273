import java.util.Scanner;

public class Odd {
    public static void main(String[] args )
    {
        Scanner ip = new Scanner(System.in);

        System.out.println("enter a ");
        int a = ip.nextInt();
        System.out.println("enter b ");
        int b = ip.nextInt();
        if (a > b ){

            System.out.println("a is greater ");
        }
        else if (b > a){
            System.out.println("b is greater ");

        }
        else {
            System.out.println("both are equall");
        }
    }
}
