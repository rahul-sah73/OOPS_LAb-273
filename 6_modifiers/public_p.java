// public = can be used anywhere (any class, any package)

class PublicExample {
    public int num = 40;

    public void show() {
        System.out.println("Public num: " + num);
    }
}

public class public_p {
    public static void main(String[] args) {
        PublicExample obj = new PublicExample();
        obj.show();
        System.out.println(obj.num); // allowed everywhere
    }
}