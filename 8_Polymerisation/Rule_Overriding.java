// RULES OF METHOD OVERRIDING:

// 1. Method name and parameters must be same
// 2. Return type must be same
// 3. Access modifier can be same or more open (not more restrictive)
// 4. static method cannot be overridden
// 5. final method cannot be overridden
// 6. private method cannot be overridden
// 7. constructor cannot be overridden
// 8. We can use super keyword to call parent method


class Parent {

    public void show() {
        System.out.println("Parent method");
    }

    static void display() {
        System.out.println("Static method (not overridden)");
    }

    final void finalMethod() {
        System.out.println("Final method (not overridden)");
    }

    private void privateMethod() {
        System.out.println("Private method");
    }
}

class Child extends Parent {

    public void show() {
        super.show();
        System.out.println("Child method");
    }
}

// Separate main class (clean structure)
public class Rule_Overriding {

    public static void main(String[] args) {

        Parent obj = new Child();

        obj.show();        // overridden
        obj.display();     // parent static
        obj.finalMethod(); // parent final
    }
}