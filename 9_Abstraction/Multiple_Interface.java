// MULTIPLE INTERFACE:
// Java does not support multiple inheritance using classes
// But supports it using interfaces

// A class can implement multiple interfaces

interface Swimmable {
    void swim();
}

interface Flyable {
    void fly();
}

class Duck implements Swimmable, Flyable {

    public void swim() {
        System.out.println("Duck swims");
    }

    public void fly() {
        System.out.println("Duck flies");
    }
}

public class Multiple_Interface {

    public static void main(String[] args) {

        Duck d = new Duck();
        d.swim();
        d.fly();
    }
}