// RULE: Data type and order must be different

class OverloadRule2 {

    void show(int a) {
        System.out.println("int: " + a);
    }

    void show(String s) {
        System.out.println("String: " + s);
    }

    void show(int a, String s) {
        System.out.println("int + String: " + a + " " + s);
    }

    void show(String s, int a) {
        System.out.println("String + int: " + s + " " + a);
    }
}

public class Rule_Overloading_2 {

    public static void main(String[] args) {

        OverloadRule2 obj = new OverloadRule2();

        obj.show(10);
        obj.show("Hello");
        obj.show(5, "Java");
        obj.show("Code", 100);
    }
}