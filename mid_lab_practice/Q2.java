// To Draw a class diagram to Create classes for users, products, orders, and payments. To Show relationships such as users placing 
// orders, orders containing products, and payment processing.Include attributes like product name, price, order ID, and payment status.
// +----------------+
// |      User      |
// +----------------+
// | userId         |
// | name           |
// | email          |
// | address        |
// +----------------+
// | placeOrder()   |
// | viewOrders()   |
// +----------------+
//         |
//         | places
//         | 1..*
//         v
// +----------------+
// |     Order      |
// +----------------+
// | orderId        |
// | orderDate      |
// | totalAmount    |
// | orderStatus    |
// +----------------+
// | addProduct()   |
// | removeProduct()|
// | calculateTotal()|
// +----------------+
//         |
//         | contains
//         | 1..*
//         v
// +----------------+
// |    Product     |
// +----------------+
// | productId      |
// | productName    |
// | price          |
// | stock          |
// +----------------+
// | updatePrice()  |
// | checkStock()   |
// +----------------+

//         |
//         | processed by
//         | 1
//         v
// +----------------+
// |    Payment     |
// +----------------+
// | paymentId      |
// | paymentMethod  |
// | paymentStatus  |
// | amount         |
// +----------------+
// | processPayment()|
// | refundPayment() |
// +----------------+

// Write a Java program to Create a Shape class and its subclasses Circle, Rectangle, Triangle. Implement method overriding to 
// calculate and display the area of different shapes.

import java.util.Scanner;
class Shape{

    void calculatearea(String name){
        System.out.println("Area  Calculation  for  " + name );
    }

}

class Circle extends Shape{
    double radius;
    void input(Scanner sc){
        System.out.println("Enter radius ");
        radius = sc.nextDouble();
    }

    void calculatearea(){
        double area = 3.14 * radius * radius ;
        super.calculatearea("circle");
        System.out.println(area);
    }
    
}

class Rectangle extends Shape{
    double length , breadth ;
    void input(Scanner sc) {
        System.out.println("Enter length ");
        length = sc.nextDouble();
        System.out.println("Enter breadth");
        breadth = sc.nextDouble();
    }

    void calculatearea(){
        double area  = length *  breadth ;
        super.calculatearea("Rectangle");
        System.out.println(area);
    }
}

class Triangle extends Shape{
    double base , height   ;
    void input(Scanner sc) {
        System.out.println("Enter Base");
        base = sc.nextDouble();
        System.out.println("Enter Height ");
        height = sc.nextDouble();
    }

    void calculatearea(){
        double area  = 0.5 * base  *  height  ;
        super.calculatearea("Triangle");
        System.out.println(area);
    }
}




public class Q2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Circle c = new Circle();
        c.input(sc);
        c.calculatearea();

        Rectangle r = new Rectangle();
        r.input(sc);
        r.calculatearea();

        Triangle t = new Triangle();
        t.input(sc);
        t.calculatearea();

        sc.close();
    }
}
