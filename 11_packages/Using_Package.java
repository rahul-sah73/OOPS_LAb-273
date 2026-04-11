/*
USING A PACKAGE:

To use a class from another package, we use IMPORT.

WAYS TO IMPORT:
1. import packageName.ClassName;
2. import packageName.*; (all classes)

NOTE:
- must compile properly using folder structure
*/

// importing custom package
import mypackage.UserDefined_Package;

public class Using_Package {

    public static void main(String[] args) {

        UserDefined_Package obj = new UserDefined_Package();
        obj.show();
    }
}