/*
ACCESS CONTROL IN PACKAGES (VERY IMPORTANT)

There are 4 access modifiers:
1. private
2. default
3. protected
4. public

VISIBILITY TABLE:

1. Same Class:
   ✔ private, default, protected, public

2. Same Package:
   ✔ default, protected, public
   ❌ private

3. Different Package (subclass):
   ✔ protected, public
   ❌ private, default

4. Different Package (non-subclass):
   ✔ public
   ❌ private, default, protected

IMPORTANT:
- protected works in subclass even in different package
- default works only in same package
*/

class Example {

    private int a = 10;
    int b = 20; // default
    protected int c = 30;
    public int d = 40;

    void show() {
        System.out.println(a + " " + b + " " + c + " " + d);
    }
}

public class Package_Access_Control {

    public static void main(String[] args) {

        Example obj = new Example();
        obj.show();
    }
}