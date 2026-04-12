// Q: Demonstrate multiple catch blocks and hierarchy

class MultipleCatchExample {
    public static void main(String[] args) {

        /*
        Multiple Catch:
        - One try can have multiple catch blocks
        - Specific exception first, general later
        */

        try {
            int arr[] = {1, 2, 3};
            System.out.println(arr[5]); // ArrayIndexOutOfBounds

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array error: " + e);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error");

        } catch (Exception e) {
            System.out.println("General exception");
        }
    }
}