// Q44: Define two interfaces Flyable and Swimmable.
// Create a class Bird implementing Flyable and a class Duck implementing both Flyable and Swimmable.

// import java.util.*;

interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Bird implements Flyable {

    @Override
    public void fly() {
        System.out.println("Bird can fly");
    }
}

class Duck implements Flyable, Swimmable {

    @Override
    public void fly() {
        System.out.println("Duck can fly");
    }

    @Override
    public void swim() {
        System.out.println("Duck can swim");
    }
}

public class Q44 {
    public static void main(String[] args) {

        Bird b = new Bird();
        Duck d = new Duck();

        System.out.println("Bird:");
        b.fly();

        System.out.println("\nDuck:");
        d.fly();
        d.swim();
    }
}