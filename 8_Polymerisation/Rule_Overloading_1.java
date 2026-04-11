// RULES OF METHOD OVERLOADING:
// ✔ Same method name
// ✔ Different parameters (number/type/order)
// ❌ Cannot change only return type

class OverloadRule1 {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    /*
    ❌ NOT ALLOWED:
    int add(int a, int b) { return a + b; }
    double add(int a, int b) { return a + b; }
    */
}

public class Rule_Overloading_1 {

    public static void main(String[] args) {

        OverloadRule1 obj = new OverloadRule1();

        System.out.println(obj.add(2, 3));
        System.out.println(obj.add(2, 3, 4));
    }
}