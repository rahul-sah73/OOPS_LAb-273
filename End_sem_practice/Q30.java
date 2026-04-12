// Q30: Write a Java program to create interface A with two methods meth1 and meth2.
// Implement this interface in another class named MyClass.

// import java.util.*;

interface A {
    void meth1();
    void meth2();
}

class MyClass implements A {

    @Override
    public void meth1() {
        System.out.println("Method 1 executed");
    }

    @Override
    public void meth2() {
        System.out.println("Method 2 executed");
    }
}

public class Q30 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        obj.meth1();
        obj.meth2();
    }
}