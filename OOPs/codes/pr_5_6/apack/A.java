package OOPs.codes.pr_5_6.apack;

/* Package: apack
   Class: A
*/

public class A {

    public int pubVar;
    protected int protVar;
    private int privVar;

    // Constructor
    public A(int pub, int prot, int priv) {
        this.pubVar = pub;
        this.protVar = prot;
        this.privVar = priv;
    }

    // Method to access private variable inside same class
    public int getPrivVar() {
        return privVar;
    }
}