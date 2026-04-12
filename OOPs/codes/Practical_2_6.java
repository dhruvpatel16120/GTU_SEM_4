package OOPs.codes;

/*
Practical No: 2.6
Title: BankAccount Search System

Practical Statement:
Create BankAccount class with accountId, accountHolderName, and balance.
Create an array of accounts and search an account by accountId.
*/

import java.util.Scanner;

class BankAccount {

    String accountId;
    String accountHolderName;
    double balance;
 
    void assignValues(String id, String name, double bal) {
        accountId = id;
        accountHolderName = name;
        balance = bal;
    }

    void displayValues() {
        System.out.println("Account ID: " + accountId);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("-------------------------");
    }
}

public class Practical_2_6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // array of objects
        BankAccount[] accounts = new BankAccount[5];

        // Create objects
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new BankAccount();

            System.out.print("Enter Account ID: ");
            String id = sc.nextLine();

            System.out.print("Enter Account Holder Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Balance: ");
            double bal = sc.nextDouble();
            sc.nextLine();

            accounts[i].assignValues(id, name, bal);
        }

        System.out.println("\nAll Accounts:");
        
        for (BankAccount acc : accounts) {
            acc.displayValues();
        }

        // Search account
        System.out.print("\nEnter Account ID to search: ");
        String searchId = sc.nextLine();

        boolean found = false;

        for (BankAccount acc : accounts) {
            if (acc.accountId.equals(searchId)) {
                System.out.println("\nAccount Found:");
                acc.displayValues();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Account not found.");
        }

        sc.close();
    }
}