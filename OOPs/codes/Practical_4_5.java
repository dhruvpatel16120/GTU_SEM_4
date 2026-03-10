package OOPs.codes;

/*
Practical No: 4.5
Title: Online Payment System using Method Overriding
*/

import java.util.Scanner;

// Superclass
class Payment {

    void processPayment(int amount) {
        System.out.println("Processing payment...");
    }
}

// Subclass for Credit Card
class CreditCardPayment extends Payment {

    @Override
    void processPayment(int amount) {
        System.out.println("Payment of Rs." + amount + " done using Credit Card");
    }
}

// Subclass for UPI
class UPIPayment extends Payment {

    @Override
    void processPayment(int amount) {
        System.out.println("Payment of Rs." + amount + " done using UPI");
    }
}

public class Practical_4_5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Payment Method:");
        System.out.println("1. Credit Card");
        System.out.println("2. UPI");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter payment amount: ");
        int amount = sc.nextInt();

        Payment p;

        if (choice == 1) {
            p = new CreditCardPayment();
        } else if (choice == 2) {
            p = new UPIPayment();
        } else {
            System.out.println("Invalid payment method.");
            sc.close();
            return;
        }

        p.processPayment(amount);

        sc.close();
    }
}