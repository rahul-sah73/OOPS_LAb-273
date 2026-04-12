package vehicle;

public class Bike implements Vehicle {

    @Override
    public void start() {
        System.out.println("Bike starts with kick/self start");
    }

    @Override
    public void stop() {
        System.out.println("Bike stops");
    }

    public static void main(String[] args) {
        Bike b = new Bike();
        b.start();
        b.stop();
    }
}