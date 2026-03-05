/*
    JAVA PROGRAM TO EXPLAIN:
    1. Class
    2. Object
    3. Inheritance

    ----------------------------------------------------
    WHAT IS A CLASS ?
    A class is a blueprint or template used to create objects.
    It defines properties (variables) and behaviors (methods).

    Example:
    If "Car" is a class, then color, speed are properties
    and drive(), stop() are behaviors.

    WHY DO WE NEED A CLASS ?
    - To organize code
    - To reuse code
    - To represent real world objects in programs
*/

/* Parent Class (Base Class) */
class Animal {

    // Property (variable)
    String name;

    /*
        Method of the class
        This method defines behavior of Animal
    */
    void eat() {
        System.out.println(name + " is eating.");
    }
}

/*
    WHAT IS INHERITANCE ?
    Inheritance means one class can use the properties
    and methods of another class.

    WHY DO WE NEED INHERITANCE ?
    - Code reuse
    - Reduces duplicate code
    - Creates relationship between classes

    Syntax:
    class ChildClass extends ParentClass
*/

/* Child Class inheriting Animal class */
class Dog extends Animal {

    // New method specific to Dog
    void bark() {
        System.out.println(name + " is barking.");
    }
}

/*
    WHAT IS AN OBJECT ?
    An object is an instance of a class.
    It represents a real-world entity.

    Example:
    If "Dog" is a class,
    then "Tommy" can be an object of Dog.

    WHY DO WE NEED OBJECTS ?
    - To access class variables and methods
    - To represent real-world things
*/

/* Main class to run the program */
public class Cls_Inheri_Obj {

    public static void main(String[] args) {

        /*
            Creating an Object

            Syntax:
            ClassName objectName = new ClassName();
        */

        Dog d1 = new Dog();   // object of Dog class

        // Assigning value to variable
        d1.name = "Tommy";

        // Calling methods
        d1.eat();   // inherited from Animal class
        d1.bark();  // method of Dog class
    }
}