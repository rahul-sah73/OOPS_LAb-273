//  QuickBite is a food delivery startup. When a customer places an order, the system needs to create an order record. Sometimes a customer just taps 
//  "Quick //  Order," and the system creates an order with a default item ("Veg Combo"), quantity (1), and delivery address set to "To be updated." Other
//  times the  customer specifies only the item name and quantity, and the address is auto-filled from their profile as "Home Address on File." In the 
//  most detailed  scenario, the customer provides the item name, quantity, a custom delivery address, and a special cooking instruction. The restaurant 
//  owner wants a  single Order system that handles all three types of order creation seamlessly.

class order{
    String item;
    int quantity ;
    String Address;
    String Specialinstruction ;

    // quick order 
    order(){

        this.item = "Veg Combo";
        this.quantity = 1;
        this.Address = "To be Updated";
        this.Specialinstruction = "None";
    }

    // specifies  item name and quantity 
    order(String item , int quantity){
        this.item = item ;
        this.quantity = quantity;
        this.Address = "Home Address on File";
        this.Specialinstruction = "None";

    }

    // most detail 
    order(String item , int quantity , String Address , String Specialinstruction){
        this.item = item ;
        this.quantity = quantity ;
        this.Address = Address ;
        this.Specialinstruction = Specialinstruction ;
    }

    void Order_Summary(){
        System.out.println("Item name      : " + item);
        System.out.println("Item quantity  : " + quantity);
        System.out.println("Address        : " + Address);
        System.out.println("Special Instruction : " + Specialinstruction);
        System.out.println("\n---------------------------\n");
    }
}

public class Quick_Bite {

    public static void main(String[] args){

        // Quick Order
        order order1 = new order();
        order1.Order_Summary();

        // Item + Quantity only
        order order2 = new order("Burger", 2);
        order2.Order_Summary();

        // Full Detailed Order
        order order3 = new order("Pizza", 3, 
                "Anna Nagar, Chennai", 
                "Extra cheese, less spicy");
        order3.Order_Summary();


    }
}