/*
Dynamic Method Dispatch (Runtime Polymorphism)

Meaning (in simple words):
Dynamic method dispatch means the method call is decided at runtime (when program runs),
not at compile time.

It is used when a parent class reference points to a child class object.
The method that gets called depends on the object, not the reference type.

Why we use it:
It helps us to use one common reference and call different methods
depending on which object is used.

*/

class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Dynamic_1{
    public static void main(String[] args) {

        // Parent class reference
        Animal a;

        // Object of Dog
        a = new Dog();
        a.sound();   // Dog method will run

        // Object of Cat
        a = new Cat();
        a.sound();   // Cat method will run
    }
}

/*
Simple explanation of example:

1. We have a parent class Animal.
2. Dog and Cat are child classes.
3. Both override the sound() method.

4. We create a reference 'a' of type Animal.
5. But we assign different objects (Dog, Cat).

6. When we call a.sound():
   - It runs Dog's method when object is Dog
   - It runs Cat's method when object is Cat

So method is decided at runtime → Dynamic Method Dispatch.
*/