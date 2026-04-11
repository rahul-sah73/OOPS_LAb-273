/*
ENCAPSULATION (IMPORTANT THEORY)

Encapsulation means wrapping data (variables) and methods (functions)
together into a single unit called a class.

MAIN IDEA:
- Protect data from direct access
- Only allow access through methods

WHY WE USE ENCAPSULATION:
1. Data Hiding → hide internal details
2. Security → prevent unauthorized access
3. Controlled Access → use getter/setter
4. Maintainability → easy to update code

RULE:
- Make variables PRIVATE
- Provide PUBLIC getter and setter methods
*/

class Student {

    // PRIVATE VARIABLES (DATA HIDING)
    // These cannot be accessed directly from outside class
    private String name;
    private int age;

    // GETTER METHOD → used to READ data
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // SETTER METHOD → used to UPDATE data
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Encapsulation_Basics {

    public static void main(String[] args) {

        Student s = new Student();

        // accessing data using setter
        s.setName("Rahul");
        s.setAge(20);

        // accessing data using getter
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());

        // s.name ❌ not allowed (private)
    }
}