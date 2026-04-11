// Polymorphism = "many forms"
// One method or object behaves in different ways

// Types:
// 1. Method Overloading → same class
// 2. Method Overriding → different classes (parent-child)

// ---------------- OVERLOADING (same class) ----------------
class Overload {

    // same method name, different parameters
    void show(int a) {
        System.out.println("int: " + a);
    }

    void show(int a, int b) {
        System.out.println("sum: " + (a + b));
    }
}

// ---------------- OVERRIDING (different classes) ----------------
class Parent {
    void display() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    // overriding parent method
    void display() {
        System.out.println("Child method");
    }
}

// ---------------- MAIN CLASS ----------------
public class Poly {

    public static void main(String[] args) {

        // Overloading (same class)
        Overload obj1 = new Overload();
        obj1.show(10);
        obj1.show(10, 20);

        // Overriding (different classes)
        Parent obj2 = new Child();
        obj2.display(); // Child method will run
    }
}