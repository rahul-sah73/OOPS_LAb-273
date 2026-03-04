class person{
    String name;
    int age;
    
    //constructor --> Constructor is a special type of method that is automatically called when object is created
    // why to use  ?  -->  to initialize variables , set initial values when object is created 

    person(String name , int age){
        this.name = name;
        this.age = age;    // initialising variables 
    }

    // Methods --> Method is a function define inside a class that performs a specific task 
    
    void display(){  // non returnig type of  method 
        System.out.println("Name  : " + name );
        System.out.println("Age   : " + age);
    }

    int Age(){  // returning type method 
        return age;
    }

    // overloading --> Defining multiple methods with same naem in the same class  but with different parameter 
    
    void work(){
        System.out.println(name + " is working ");
    }

    void work(String job){
        System.out.println(name + "is working as " + job);
    }

}

class Student extends person {
    String course ;
    Student(String name , int age , String course ){
        super(name , age );   // using super key word to call the parent constructor 
        this.course = course ;
    }
  
    // Method overrinding --> a child class redefines a method of the parent class 

    void display(){
        super.display();  // calling parent method 
        System.out.println("Course   : " + course);
    }

}



public class Constructor_Methods_1 {

    public static void main(String[] args) {

         Student s = new Student("Rahul", 20, "Computer Science");

        s.display();            // overriding + super
        s.work();               // overloading
        s.work("Software Developer"); // overloading
    }
}
    
