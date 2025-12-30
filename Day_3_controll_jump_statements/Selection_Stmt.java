import java.util.Scanner;

public class Selection_Stmt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a +b ;
        // if 

        if (a > b ){
            System.out.println("a is grater than b");
        }

        // IF-ElSE

        if (a > b ){
            System.out.println("a is grater than b");
        }
        else{
            System.out.println("a is less than b");
        }
        
        // if else if ladder 
        
        if (a > b ){
            System.out.println("a is grater than b");
        }
        else if(a == b){
            System.out.println("a is equal to b");
        }
        else{
            System.out.println("a is less than b");
        }

       // int even = sum % 2 ;
        // Switch Case
        switch (sum % 2) {
            case 0:
                System.out.println("even sum");
                break;
        
            default:
                System.out.println("odd sum");
                break;
        }

        
    }
}
