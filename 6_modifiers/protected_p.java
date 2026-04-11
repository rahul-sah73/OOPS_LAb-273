// protected = same package + child class (inheritance)

class Parent {
    protected int num = 30;

    protected void show() {
        System.out.println("Protected num: " + num);
    }
}

class Child extends Parent {
    void display() {
        System.out.println(num); // allowed (inherited)
        show();
    }
}

public class protected_p{
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}