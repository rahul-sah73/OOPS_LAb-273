// . RoyalStay is a hotel chain. When a guest walks in without any prior booking, the front desk assigns them a standard room on the ground floor with a 
// default rate of ₹2000 per night and marks the guest name as "Walk-in Guest." However, when a guest books in advance through the website, they provide 
// their full name, preferred room type, floor number, and an agreed nightly rate at the time of reservation. Recently, the manager also introduced a 
// "Refer a Friend" offer, when an existing guest refers someone, the new guest's reservation is created as an exact copy of the referring guest's 
// booking   details, and only the guest name is changed afterward. 


class Reservation{

    String name;
    String roomtype;
    int floorno;
    int room_rate;

    // constructure  for walk in guest
    Reservation(){
        
        this.name = "Walk-in Guest";
        this.roomtype = "Standered";
        this.floorno = 0;
        this.room_rate = 2000;
    }

    // constructure for reservation guest 
    Reservation(String name , String roomtype , int floorno , int room_rate){
        
        this.name = name ;
        this.roomtype = roomtype;
        this.floorno = floorno;
        this.room_rate = room_rate;
    }

    void Deatils(){
        System.out.println("Guest name    : " + name);
        System.out.println("Room Type     : " + roomtype);
        System.out.println("Floor NO      : " + floorno);
        System.out.println("Room Rate     : " + room_rate); 
        System.out.println("\n--------***----------\n");
    }
}

class Walk_IN_Guest  extends Reservation{

    Walk_IN_Guest(){
        super();
    }

}

class Advance_Booking extends Reservation{

    Advance_Booking(String name , String roomtype , int floorno , int room_rate){
        super(name, roomtype, floorno, room_rate);
    }
}

class Referal  extends Reservation{

    Referal(Reservation refguest , String Newname){
        super(Newname , refguest.roomtype , refguest.floorno ,refguest.room_rate);
    }

}

public class Royal_Stay {

    public static void main (String[] args){

        Walk_IN_Guest guest1 = new Walk_IN_Guest();
        // guest1.Deatils();

        Advance_Booking guest2 = new Advance_Booking("Rahul", "Deluxe", 3, 3000);
        // guest2.Deatils();

        Referal guest3 = new Referal(guest2, "Karan");
        guest3.Deatils();

        Referal gest4 = new Referal(guest1, "Luffy");
        gest4.Deatils();
    }
    
}


