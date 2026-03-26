package OOPs.codes;

/*
Practical No: 1.5
Title: ATM Currency Note Calculator

Practical Statement:
Simulate a simple ATM or cashier. Given an integer amount to be dispensed,
calculate and display the minimum number of currency notes of denominations
100, 50, 10, 5, 2, and 1 that would be given to the user.
*/

import java.util.Scanner;

public class Practical_1_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int amount = sc.nextInt();

        int notes100 = amount / 100;
        amount = amount % 100; 

        int notes50 = amount / 50;
        amount = amount % 50;

        int notes10 = amount / 10;
        amount = amount % 10;

        int notes5 = amount / 5;
        amount = amount % 5;

        int notes2 = amount / 2;
        amount = amount % 2;

        int notes1 = amount;

        System.out.println("Minimum notes required:");

        System.out.println("100 : " + notes100);
        System.out.println("50  : " + notes50);
        System.out.println("10  : " + notes10);
        System.out.println("5   : " + notes5);
        System.out.println("2   : " + notes2);
        System.out.println("1   : " + notes1);

        sc.close();
    }
}