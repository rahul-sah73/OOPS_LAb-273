// INTERFACE:
// Used for full abstraction (100% abstraction)

// POINTS:
// ✔ all methods are abstract by default (before Java 8)
// ✔ variables are public static final
// ✔ cannot create object of interface
// ✔ class uses "implements" keyword

interface Animal {

    void eat();
    void sleep();
}

class Dog implements Animal {

    public void eat() {
        System.out.println("Dog eats");
    }

    public void sleep() {
        System.out.println("Dog sleeps");
    }
}

public class Interface_Example {

    public static void main(String[] args) {

        Animal obj = new Dog(); // abstraction
        obj.eat();
        obj.sleep();
    }
}