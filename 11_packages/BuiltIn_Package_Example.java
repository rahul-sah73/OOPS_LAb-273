/*
BUILT-IN PACKAGES:

These are predefined packages provided by Java.

EXAMPLES:
- java.lang → core classes (String, Math, System)
- java.util → utilities (ArrayList, Scanner, Date)
- java.io → file handling
- java.sql → database
- java.net → networking

NOTE:
- java.lang is automatically imported
- others need import keyword
*/

// importing built-in package
import java.util.ArrayList;

public class BuiltIn_Package_Example {

    public static void main(String[] args) {

        // using ArrayList from java.util
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");

        System.out.println(list);
    }
}