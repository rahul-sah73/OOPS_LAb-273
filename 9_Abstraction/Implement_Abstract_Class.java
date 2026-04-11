// IMPLEMENTING ABSTRACT CLASS:
// ✔ child class must implement all abstract methods
// ✔ otherwise child class must also be abstract

abstract class Animal {

    abstract void makeSound();

    void sleep() {
        System.out.println("Animal is sleeping...");
    }
}

class Dog extends Animal {

    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Implement_Abstract_Class {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.makeSound();
        d.sleep();
    }
}