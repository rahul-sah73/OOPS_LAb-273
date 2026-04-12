// Q: Demonstrate throw and throws keyword

class Throw_Throws {

    // throws → declares exception
    static void checkAge(int age) throws Exception {

        if (age < 18) {
            // throw → manually throwing exception
            throw new Exception("Not eligible");
        } else {
            System.out.println("Eligible");
        }
    }

    public static void main(String[] args) {

        /*
        throw:
        - Used to explicitly throw exception
        - Used inside method
        - Followed by object

        throws:
        - Used in method signature
        - Declares exception
        */

        try {
            checkAge(15);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}