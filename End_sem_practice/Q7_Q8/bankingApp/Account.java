// Write a Java program to Create another package bankingApp and try accessing these methods from a subclass.

// File: bankingApp/App.java
package bankingApp;

import banking.Account;

// Subclass
class App extends Account {

    public void testAccess() {

        // public → accessible
        publicMethod();

        // protected → accessible (via inheritance)
        protectedMethod();

        // private → NOT accessible ❌
        // privateMethod();  // ERROR

        // access private indirectly
        accessPrivate();
    }

        public static void main(String[] args) {
        App obj = new App();
        obj.testAccess();
    }
}