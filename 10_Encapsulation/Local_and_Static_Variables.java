/*
LOCAL vs GLOBAL VARIABLES (IMPORTANT THEORY)

LOCAL VARIABLES:
- Declared inside method
- Created when method starts
- Destroyed when method ends
- Cannot use access modifiers

GLOBAL VARIABLES:
- Java does NOT support true global variables
- Instead we use:
   1. Instance variables
   2. Static variables

STATIC VARIABLES:
- Shared by all objects
- Behave like global variables
*/

class Demo {

    int instanceVar = 10; // instance variable

    static int staticVar = 0; // global-like variable

    void show() {

        int localVar = 5; // local variable

        System.out.println("Local: " + localVar);
        System.out.println("Instance: " + instanceVar);
    }

    Demo() {
        staticVar++; // count objects
    }
}

public class Local_and_Static_Variables {

    public static void main(String[] args) {

        Demo d1 = new Demo();
        Demo d2 = new Demo();

        d1.show();

        System.out.println("Static count: " + Demo.staticVar);
    }
}