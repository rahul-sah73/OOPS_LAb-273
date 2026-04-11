/*
READ-ONLY DATA:

If we provide ONLY getter and NO setter,
then data becomes READ-ONLY.

Means:
- Value can be read
- Value cannot be changed

USE CASE:
- ID numbers
- Fixed values
*/

class Employee {

    private int id = 101;

    // only getter (no setter)
    public int getId() {
        return id;
    }
}

public class Read_Only_Data {

    public static void main(String[] args) {

        Employee e = new Employee();

        System.out.println("Employee ID: " + e.getId());

        // cannot modify id
        // e.id ❌ not allowed
    }
}