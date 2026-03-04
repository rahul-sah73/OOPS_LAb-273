// SmartGadgets Inc. manufactures smart home devices. Every device produced on the assembly line initially has a default device name ("SG-Device"), a 
// default status ("Inactive"), and a firmware version ("v1.0"). During quality testing, the tester configures each device by providing a custom device 
// name and firmware version, but the status remains "Inactive." When a customer purchases the device from the store, the sales system creates the device
//  record with a device name, firmware version, and sets the status to "Active." The engineering team wants the program to display all the details 
//   whenever any device is created at any stage.


class Device {
    String name ;
    String status ;
    String version ;


// default values 
Device(){
    this.name = "SG-Device";
    this.status = "Inactive";
    this.version = "v1.0";
}


//testing 
Device(String name , String version ){

    this.name = name;
    this.status = "Inactive";
    this.version = version;

}

// customer puchase 
Device(Device system )  {
    this.name = system.name;
    this.status = "Active";
    this.version = system.version;

}

void About(){
    System.out.println("Decive name     : " + name );
    System.out.println("Device status   : " + status);
    System.out.println("Device version  : " + version);
    System.out.println("\n--------------------------\n");
}
}

public class Smart_Gadgets {
    public static void main(String[] args) {

        Device d1 = new Device();
        d1.About();

        Device d2 = new Device("oppo", "v3.12");
        d2.About();

        Device d3 = new Device(d2);
        d3.About();
    }
}
