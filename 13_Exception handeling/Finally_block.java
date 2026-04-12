// Q: Demonstrate finally block

class Finally_block {
    public static void main(String[] args) {

        /*
        finally:
        - Always executes
        - Used for cleanup (closing files, DB, etc.)
        */

        try {
            int a = 10 / 0;
        } catch (Exception e) {
            System.out.println("Exception occurred");
        } finally {
            System.out.println("Finally block executed");
        }
    }
}