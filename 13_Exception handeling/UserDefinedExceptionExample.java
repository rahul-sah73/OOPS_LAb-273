// Q: Create user-defined exception

class MyException extends Exception {
    public MyException(String msg) {
        super(msg);
    }
}

class UserDefinedExceptionExample {
    public static void main(String[] args) {

        /*
        User-defined Exception:
        - Custom exception created by programmer
        - Extend Exception class
        */

        try {
            int marks = 30;

            if (marks < 40) {
                throw new MyException("Failed");
            }

            System.out.println("Passed");

        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}