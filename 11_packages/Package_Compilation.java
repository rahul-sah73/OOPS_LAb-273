/*
CREATING PACKAGE (STEP-BY-STEP):

STEP 1: Declare package
    package mypackage;

STEP 2: Write class

STEP 3: Compile using command:
    javac -d . ClassName.java

- -d → creates directory for package
- . → current directory

STEP 4: Run program:
    java packageName.ClassName

EXAMPLE:
    javac -d . UserDefined_Package.java
    java mypackage.UserDefined_Package
*/

public class Package_Compilation {

    public static void main(String[] args) {

        System.out.println("Use javac -d . to create package folder");
    }
}