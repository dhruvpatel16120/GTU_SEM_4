package OOPs.codes.pr_5_6.dpack;

import OOPs.codes.pr_5_6.bpack.B;
import OOPs.codes.pr_5_6.cpack.C;

/* Package: dpack
   Main Class: ProtectedDemo
*/

public class ProtectedDemo {
    public static void main(String[] args) {

        B b = new B(1, 2, 3);
        C c = new C();

        b.display();
        c.display();
    }
}