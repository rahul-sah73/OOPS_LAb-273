// Create an abstract class Employee with abstract method calculateSalary() and implement subclasses Manager and Developer


// Abstract class
abstract class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    // abstract method
    abstract void calculateSalary();
}

// Manager class
class Manager extends Employee {
    double monthlySalary, bonus;

    Manager(String name, double monthlySalary, double bonus) {
        super(name);
        this.monthlySalary = monthlySalary;
        this.bonus = bonus;
    }

    @Override
    void calculateSalary() {
        double total = monthlySalary + bonus;
        System.out.println(name + " (Manager) Salary: Rs " + total);
    }
}

// Developer class
class Developer extends Employee {
    double hoursWorked, ratePerHour;

    Developer(String name, double hoursWorked, double ratePerHour) {
        super(name);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    @Override
    void calculateSalary() {
        double total = hoursWorked * ratePerHour;
        System.out.println(name + " (Developer) Salary: Rs " + total);
    }
}

// Main class
public class Q15_abemployee {
    public static void main(String[] args) {

        Employee e1 = new Manager("Rahul", 50000, 10000);
        Employee e2 = new Developer("Aman", 160, 300);

        e1.calculateSalary();
        e2.calculateSalary();
    }
}