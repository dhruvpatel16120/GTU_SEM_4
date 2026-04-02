package OOPs.codes.pr_5_6.cpack;

import OOPs.codes.pr_5_6.apack.*;

/* Package: cpack
   Class: C (no inheritance)
*/

public class C {

    public void display() {
        System.out.println("\nFrom Class C (Object Access):");

        A obj = new A(10, 20, 30);

        // Accessible
        System.out.println("Public Variable: " + obj.pubVar);

        // Not accessible
        // System.out.println("Protected Variable: " + obj.protVar); // ERROR
        // System.out.println("Private Variable: " + obj.privVar);   // ERROR

        System.out.println("Private Variable (via method): " + obj.getPrivVar());
    }
}