// ABSTRACTION:
// Hiding internal details and showing only important features

// WHY USE:
// ✔ reduces complexity
// ✔ increases security
// ✔ improves code reuse and maintenance

// TYPES OF ABSTRACTION IN JAVA:
// 1. Abstract Class → partial abstraction (0–100%)
// 2. Interface → full abstraction (100%)

// -------- USING ABSTRACT CLASS --------
abstract class Animal {

    // abstract method → no body (must be implemented by child)
    abstract void makeSound();

    // concrete method → has body
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {

    // must implement abstract method
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Abstraction_Basics {

    public static void main(String[] args) {

        // cannot create object of abstract class
        Animal obj = new Dog(); // abstraction
        obj.makeSound();
        obj.sleep();
    }
}