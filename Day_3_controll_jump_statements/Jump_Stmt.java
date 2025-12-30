public class Jump_Stmt {
    public static void main(String[] args){


        // break statement --> if the condition are satisfied and and you dont want to run after that
        // then we use  beake statement to exit out the loop 
        

        // continue statement --> used to ignore or if condition is true any statement after this will not execute
        for (int i = 0; i < 15; i++) {
            if ( i == 10) {
                continue; // continue Statement
            }
            
            if (i == 13) {
                break;   // Break Statement
            }

            System.out.println(i);
        }

    }
}
