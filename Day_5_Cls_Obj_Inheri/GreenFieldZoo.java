// The Greenfield Zoo maintains a classification of its animals. Every animal in the zoo has a name, age, and diet type. The zoo houses Mammals, Birds, and Reptiles. Mammals have an 
// additional attribute for fur color, Birds have wingspan, and Reptiles have a boolean indicating whether they are venomous. All three categories share the common behavior of eating 
// and sleeping, but each displays its own unique behavior. Mammals run, Birds fly, and Reptiles crawl. The zookeeper wants a system where he can create different animals and see 
// their details and behaviors. 

class Animal{
    String name ;
    int age ;
    String diettype;

    Animal(String name , int age , String diettype){
        this.name = name ;
        this.age = age;
        this.diettype = diettype;

    }

    void eat(){
        System.out.println(name  + " is eating ");
    }
    void sleep(){
        System.out.println(name  + " is sleeping ");
    }

    void ShowDetails(){
        System.out.println("Name : " + name );
        System.out.println("Age  : " + age );
        System.out.println("Diet Type  : " + diettype);
    }

}

class Mammals extends Animal{

    String furcolor ;

    Mammals(String name , int age , String diettype , String furcolor){

        super(name , age ,diettype );
        this.furcolor = furcolor ;
    }

    void ShowDetails(){
        super.ShowDetails();
        System.out.println("Fur Color : " + furcolor );
    }
    void behaviour(){
        System.out.println("Mammals Run");
    }
    
}

class Birds extends Animal {
    double winigspan ;

    Birds(String name , int age , String diettype , double winigspan){
        
        super(name , age ,diettype );
        this.winigspan = winigspan;

    }

    void behaviour(){
    System.out.println(name + " flies.");
}

    void ShowDetails(){
        super.ShowDetails();
        System.out.println("Wing span is  : " + winigspan);
    }
}

class Reptiles extends Animal{
    
    boolean venomous ;
    Reptiles(String name , int age , String diettype , boolean venomous){
    
        super(name , age ,diettype );
        this.venomous = venomous ;
    }
    void behaviour(){
    System.out.println(name + " crawls.");
}

    void ShowDetails(){
        super.ShowDetails();
        System.out.println("Is it venomous  :  " + venomous);
    }
}


public class GreenFieldZoo {
    public static void main(String[] args) {
        
 // Mammal
        Mammals m1 = new Mammals("Dog", 5, "Omnivore", "White");
        m1.ShowDetails();
        m1.eat();
        m1.sleep();
        m1.behaviour();

        System.out.println("\n-----------------\n");

        // Bird
        Birds b1 = new Birds("Eagle", 3, "Carnivore", 2.5);
        b1.ShowDetails();
        b1.eat();
        b1.sleep();
        b1.behaviour();

        System.out.println("\n-----------------\n");

        // Reptile
        Reptiles r1 = new Reptiles("Snake", 2, "Carnivore", true);
        r1.ShowDetails();
        r1.eat();
        r1.sleep();
        r1.behaviour();
    }
    
}
