// Q: Write a Java program demonstrating complete exception handling concepts

import java.io.*;
import java.util.*;

class Exception_basic {
    public static void main(String[] args) {

        /*
        ================= EXCEPTION HANDLING - FULL THEORY =================

        1. What is Exception?
        - An exception is a problem that occurs during program execution.
        - It disrupts normal flow of program.

        2. Reasons:
        - Invalid input (ArithmeticException)
        - File not found (FileNotFoundException)
        - Network issues
        - Memory issues (OutOfMemoryError)

        3. If NOT handled:
        - Program terminates abruptly
        - Remaining code will not execute

        4. Flow:
        Problem -> Exception Created -> Exception Thrown -> Exception Handled

        5. Error vs Exception:
        - Error: Cannot recover (e.g., JVM crash)
        - Exception: Can recover using try-catch

        6. Hierarchy:
        Object
           ↓
        Throwable
           ↓
        ├── Exception (Handled)
        │     ├── Checked
        │     └── Unchecked
        └── Error (Not handled usually)

        7. Types:
        - Checked: Compile-time (IOException)
        - Unchecked: Runtime (ArithmeticException)

        8. Keywords:
        try → risky code
        catch → handle exception
        finally → always executes
        throw → manually throw
        throws → declare exception

        ================================================================
        */

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter number: ");
            int a = sc.nextInt();

            int result = 100 / a; // may cause ArithmeticException
            System.out.println("Result: " + result);

            File f = new File("test.txt");
            Scanner fileScanner = new Scanner(f); // may cause FileNotFoundException

            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }

            fileScanner.close();

        } catch (ArithmeticException e) {
            System.out.println("Divide by zero error: " + e);

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e);

        } catch (Exception e) {
            System.out.println("General exception: " + e);

        } finally {
            System.out.println("This block always executes");
        }

        sc.close();
    }
}