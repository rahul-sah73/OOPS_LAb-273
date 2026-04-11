// STATIC METHOD IN INTERFACE:
// ✔ belongs to interface, not object
// ✔ cannot be overridden
// ✔ must be called using interface name

interface Animal {

    void eat();

    static void info() {
        System.out.println("Animal interface");
    }
}

class Dog implements Animal {

    public void eat() {
        System.out.println("Dog eats");
    }
}

public class Static_Method_Interface {

    public static void main(String[] args) {

        Animal.info(); // correct way
    }
}