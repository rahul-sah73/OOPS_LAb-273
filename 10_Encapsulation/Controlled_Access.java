/*
CONTROLLED ACCESS:

Encapsulation allows us to control how data is accessed or modified.

We can apply CONDITIONS inside setter methods.

Example:
- Do not allow negative age
- Do not allow invalid values

This improves:
✔ Data safety
✔ Data correctness
*/

class Person {

    private int age;

    // Setter with validation
    public void setAge(int age) {

        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age! Cannot be negative.");
        }
    }

    // Getter
    public int getAge() {
        return age;
    }
}

public class Controlled_Access {

    public static void main(String[] args) {

        Person p = new Person();

        p.setAge(25);   // valid
        System.out.println(p.getAge());

        p.setAge(-10);  // invalid
    }
}