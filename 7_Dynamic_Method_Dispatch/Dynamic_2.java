/*
Dynamic Method Dispatch with different methods in child class

Simple meaning:
Parent class reference can only call methods that are in parent class.
Even if child has extra methods, we cannot call them using parent reference.

Important point:
Only overridden methods are decided at runtime.
New methods in child class cannot be called directly.

*/

class Animal{
    void sound(){
        System.out.println("Animal making sound ");
    }
}

class cat extends Animal {

    void sound(){
        System.out.println("cat making sound");
    }

    void eat(){
        System.out.println("cat is eating ");
    }
}

public class Dynamic_2{

    public static void main(String[] args){
        Animal a ;
        a = new cat();
        a.sound();

        // a.eat();  will not run  because eat is not in animal class

    }
}

/*
Simple explanation:

1. Animal has method sound().
2. Dog overrides sound() and also has a new method eat().

3. We use Animal reference:
   Animal a = new Dog();

4. a.sound() works because sound() is in parent class.

5. a.eat() does NOT work because eat() is not in parent class.

6. To use eat(), we convert:
   Dog d = (Dog) a;

7. Now d.eat() works.

Key idea:
- Runtime decides overridden methods (like sound()).
- But new methods (like eat()) need casting.
*/