// private = can be used only inside the same class

class PrivateExample {
    private int num = 10; // only this class can access

    void show() {
        System.out.println("Private num: " + num);
    }
}

public class privat_p {
    public static void main(String[] args) {
        PrivateExample obj = new PrivateExample();
        obj.show(); 
        // obj.num ❌ not allowed (private)
    }
}