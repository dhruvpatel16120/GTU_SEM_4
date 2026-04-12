package OOPs.codes;

/*
Practical No: 3.2
Title: BankAccount Interest Calculation

Practical Statement:
Design a BankAccount class with static interest_rate.
Provide method to calculate interest and static method to update rate.
*/

class BankAccount {

    String account_holder_name;
    double balance;

    static double interest_rate = 5.0;

    BankAccount(String name, double bal) {
        account_holder_name = name;
        balance = bal;
    }

    void calculateInterest() {
        double interest = balance * interest_rate / 100;
        System.out.println("Account Holder: " + account_holder_name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Earned: " + interest);
        System.out.println("----------------------");
    }

    static void updateInterestRate(double newRate) {
        interest_rate = newRate;
    }
}

public class Practical_3_2 {

    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("Dhruv", 50000.0);
        BankAccount acc2 = new BankAccount("Rahul", 80000.0);

        System.out.println("Interest with current rate:");
        acc1.calculateInterest();
        acc2.calculateInterest();

        BankAccount.updateInterestRate(6.5);

        System.out.println("After updating interest rate:");

        acc1.calculateInterest();
        acc2.calculateInterest();
    }
}