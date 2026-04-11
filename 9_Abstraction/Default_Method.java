// DEFAULT METHOD (Java 8 feature):
// Interface can have methods with body using "default"

// ✔ not compulsory to override
// ✔ helps to add new methods without breaking code

interface Animal {

    void eat();
    void sleep();

    default void breathe() {
        System.out.println("Animal breathes");
    }
}

class Dog implements Animal {

    public void eat() {
        System.out.println("Dog eats");
    }

    public void sleep() {
        System.out.println("Dog sleeps");
    }
}

public class Default_Method {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.breathe(); // using default method
    }
}