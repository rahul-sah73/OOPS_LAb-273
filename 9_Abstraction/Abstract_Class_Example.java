// ABSTRACT CLASS:
// ✔ cannot be instantiated
// ✔ can have abstract + normal methods
// ✔ supports partial abstraction

abstract class Animal {

    abstract void makeSound(); // abstract

    void sleep() { // normal
        System.out.println("Animal sleeps");
    }
}

class Cat extends Animal {

    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class Abstract_Class_Example {

    public static void main(String[] args) {

        Animal obj = new Cat();
        obj.makeSound();
        obj.sleep();
    }
}