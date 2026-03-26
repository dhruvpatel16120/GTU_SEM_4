package OOPs.codes;

/*
Practical No: 2.7
Title: Billing System using Method Overloading

Practical Statement:
Generate bills based on customer type using overloaded methods.
*/

import java.util.Scanner;

class BillGenerator {

    // Regular customer
    void generateBill(int itemTotal) {
        System.out.println("Final Bill (Regular Customer): " + itemTotal);
    }

    // Privileged customer with flat discount
    void generateBill(int itemTotal, int discount) {
        int finalBill = itemTotal - discount;
        System.out.println("Final Bill (Privileged Customer): " + finalBill);
    }

    // Festive offer with percentage discount
    void generateBill(int itemTotal, double discountPercent) {
        double finalBill = itemTotal - (itemTotal * discountPercent / 100);
        System.out.println("Final Bill (Festive Offer): " + finalBill);
    }
}

public class Practical_2_7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BillGenerator bill = new BillGenerator();

        System.out.println("1. Regular Customer");
        System.out.println("2. Privileged Customer");
        System.out.println("3. Festive Offer");

        System.out.print("Enter customer type: ");
        int choice = sc.nextInt();

        System.out.print("Enter total item amount: ");
        int amount = sc.nextInt();

        switch (choice) {
            case 1:
                bill.generateBill(amount);
                break;

            case 2:
                System.out.print("Enter flat discount in ruppees: ");
                int discount = sc.nextInt();
                bill.generateBill(amount, discount);
                break;

            case 3:
                System.out.print("Enter discount percentage: ");
                double percent = sc.nextDouble();
                bill.generateBill(amount, percent);
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}