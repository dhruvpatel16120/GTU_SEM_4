package OOPs.codes;

/*
Practical No: 2.8
Title: Loan EMI Calculator using Method Overloading

Practical Statement:
Calculate EMI for different types of loans using overloaded methods.
*/

class LoanCalculator {

    // Home loan
    void calculateEMI(int principal, int time, float rate) {
        double emi = (principal * rate * time) / (12 * 100);
        System.out.println("Home Loan EMI: " + emi);
    }

    // Vehicle loan
    void calculateEMI(double principal, int time, double rate) {
        double emi = (principal * rate * time) / (12 * 100);
        System.out.println("Vehicle Loan EMI: " + emi);
    }

    // Personal loan with fixed 10% interest
    void calculateEMI(int principal, int time) {
        double rate = 10;
        double emi = (principal * rate * time) / (12 * 100);
        System.out.println("Personal Loan EMI: " + emi);
    }
}

public class Practical_2_8 {

    public static void main(String[] args) {

        LoanCalculator loan = new LoanCalculator();

        loan.calculateEMI(500000, 5, 7.5f);     // Home loan
        loan.calculateEMI(300000.0, 3, 9.0);    // Vehicle loan
        loan.calculateEMI(100000, 2);           // Personal loan
    }
}