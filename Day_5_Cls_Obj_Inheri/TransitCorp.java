// TransitCorp operates a transportation fleet. Every vehicle in their fleet has a registration number, fuel type, and maximum speed. TransitCorp operates three kinds of
//  vehicles, Buses, Trucks, and Vans. Buses have an additional attribute for passenger capacity, Trucks have a cargo weight limit (in tons), and Vans have a boolean for whether they 
// support refrigeration. Each vehicle can start and stop, but the way each vehicle is described differs. A bus mentions its route capacity, a truck mentions its load capability, 
// and a van mentions whether it keeps goods cold. The fleet manager wants to register multiple vehicles and print the details of each. 

class Vechile{
    String regino;
    String fueltype;
    int maxspeed;

    Vechile(String regino , String fueltype , int maxspeed){

        this.regino = regino;
        this.fueltype = fueltype;
        this.maxspeed = maxspeed;


    }

    void start(){
        System.out.println("Starting the vechile");
    }

    void stop(){
        System.out.println("stoping the vechile");
    }

    void showDetails() {
        System.out.println("Registration No : " + regino);
        System.out.println("Fuel Type       : " + fueltype);
        System.out.println("Max Speed       : " + maxspeed);
    }


}

class Buses extends Vechile{

    int capacity ;

    Buses(String regino, String fueltype, int maxspeed , int capacity) {
        super(regino, fueltype, maxspeed);
        this.capacity = capacity;
    }

    void showDetails() {
        super.showDetails();
        System.out.println("Passenger Capacity : " + capacity);
    }

    
}

class Truck extends Vechile {

    int wtlimit ;

    Truck(String regino, String fueltype, int maxspeed , int wtlimit) {
        super(regino, fueltype, maxspeed);
        this.wtlimit = wtlimit;
    }

        void showDetails() {
        super.showDetails();
        System.out.println("Cargo Weight Limit (tons) : " + wtlimit);
    }
    
}

class Vans extends Vechile{

    boolean refrigerator ;

    Vans(String regino, String fueltype, int maxspeed , boolean refrigerator) {
        super(regino, fueltype, maxspeed);
        this.refrigerator = refrigerator;
    }

    void showDetails() {
        super.showDetails();
        System.out.println("Refrigeration Support : " + refrigerator);
    }
}


public class TransitCorp {
    public static void main(String[] args) {

        Buses b1 = new Buses("TN01AB1234", "Diesel", 90, 50);
        Truck t1 = new Truck("TN02CD5678", "Diesel", 80, 20);
        Vans v1 = new Vans("TN03EF9012", "Petrol", 100, true);

        b1.showDetails();
        b1.start();
        b1.stop();

        System.out.println("\n------------------\n");

        t1.showDetails();
        t1.start();
        t1.stop();

        System.out.println("\n------------------\n");

        v1.showDetails();
        v1.start();
        v1.stop();
    }
}
