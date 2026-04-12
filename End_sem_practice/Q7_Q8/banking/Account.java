// Write a Java program to create a package banking with a class Account that has private, protected, and public  methods.

package banking;

public class Account {

    // private method
    private void privateMethod() {
        System.out.println("This is a PRIVATE method");
    }

    // protected method
    protected void protectedMethod() {
        System.out.println("This is a PROTECTED method");
    }

    // public method
    public void publicMethod() {
        System.out.println("This is a PUBLIC method");
    }

    // method to access private method inside same class
    public void accessPrivate() {
        privateMethod();
    }

    // main method (to run individually)
    public static void main(String[] args) {
        Account obj = new Account();

        obj.publicMethod();     // accessible
        obj.protectedMethod();  // accessible (same package)
        obj.accessPrivate();    // accessing private indirectly
    }
}