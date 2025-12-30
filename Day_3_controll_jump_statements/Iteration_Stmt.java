import java.util.Scanner;

public class Iteration_Stmt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // for loopp
        for(int a = 1 ; a <= 10 ; a++){
            System.out.println(a);
        }
        
        // while loop 
        System.out.println();

        int i = 1;
        int a = 2;
        while (i <= 10) {
            System.out.println(a * i);
            i++;

        }

        // do while loop -->  this loop executes at leat one time 
        System.out.println();

        int b = 3 ;
        i = 1;
        do{
           System.out.println(b * i);
           i++;
        }while(i <= 10);


    }
}
