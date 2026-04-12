// Q37: Write a Java program to develop an abstract class Appliance with abstract method turnOn() 
// and implement subclasses such as WashingMachine and Refrigerator.

// import java.util.*;

abstract class Appliance {
    abstract void turnOn();
}

class WashingMachine extends Appliance {

    @Override
    void turnOn() {
        System.out.println("Washing Machine is now ON");
    }
}

class Refrigerator extends Appliance {

    @Override
    void turnOn() {
        System.out.println("Refrigerator is now ON");
    }
}

public class Q37 {
    public static void main(String[] args) {
        Appliance a1 = new WashingMachine();
        Appliance a2 = new Refrigerator();

        System.out.println("Washing Machine:");
        a1.turnOn();

        System.out.println("\nRefrigerator:");
        a2.turnOn();
    }
}