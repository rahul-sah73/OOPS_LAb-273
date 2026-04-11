// default = can be used inside same package only

class DefaultExample {
    int num = 20; // no modifier = default

    void show() {
        System.out.println("Default num: " + num);
    }
}

public class default_d {
    public static void main(String[] args) {
        DefaultExample obj = new DefaultExample();
        obj.show();
        System.out.println(obj.num); // allowed in same package
    }
}