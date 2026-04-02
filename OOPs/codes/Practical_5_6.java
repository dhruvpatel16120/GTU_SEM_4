package OOPs.codes;

/*
Practical No: 5.6
Title:

Practical Statement:
5.6 Write a Java program using four different packages to demonstrate the use of access
specifiers.
● Package apack:
o Define a class A with three variables:
▪ public int pubVar
▪ protected int protVar
▪ private int privVar
o Provide a constructor to initialize them.
● Package bpack:
o Define a class B that extends A.
o Create a display() method that tries to access variables of A using
inheritance.
● Package cpack:
o Define a class C with a display() method.
o Inside display(), create an object of class A and try to access its variables.
● Package dpack:
o Define a class ProtectedDemo with main().
o Create objects of class B and class C.
o Call their respective display() methods to show which variables are
accessible and which are not.

*/

public class Practical_5_6 {

    public static void main(String[] args) {

        // Write your code here
        System.err.println("Please run the main method in ProtectedDemo class inside dpack package to see the results.");

    }

}
