package OOPs.codes.pr_5_6.bpack;

import OOPs.codes.pr_5_6.apack.*;

/* Package: bpack
   Class: B (inherits A)
*/

public class B extends A {

    public B(int pub, int prot, int priv) {
        super(pub, prot, priv);
    }

    public void display() {
        System.out.println("From Class B (Inheritance):");

        // Accessible
        System.out.println("Public Variable: " + pubVar);
        System.out.println("Protected Variable: " + protVar);

        // Not accessible directly
        // System.out.println("Private Variable: " + privVar); // ERROR

        System.out.println("Private Variable (via method): " + getPrivVar());
    }
}