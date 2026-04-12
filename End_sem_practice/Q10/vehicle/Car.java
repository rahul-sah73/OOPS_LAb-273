package vehicle;

public class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car starts with key ignition");
    }

    @Override
    public void stop() {
        System.out.println("Car stops");
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.stop();
    }
}