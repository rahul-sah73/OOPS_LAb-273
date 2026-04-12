// Q: Demonstrate checked and unchecked exceptions in Java

import java.io.*;

class Exception_2 {
    public static void main(String[] args) {

        /*
        Checked Exception:
        - Checked at compile time
        - Must handle or declare
        Example: IOException

        Unchecked Exception:
        - Occurs at runtime
        - Not mandatory to handle
        Example: ArithmeticException
        */

        // Unchecked Example
        try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception: " + e);
        }

        // Checked Example
        try {
            FileReader fr = new FileReader("abc.txt");
        } catch (IOException e) {
            System.out.println("Checked Exception: " + e);
        }
    }
}