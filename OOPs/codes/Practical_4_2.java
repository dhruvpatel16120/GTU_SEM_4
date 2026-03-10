package OOPs.codes;

/*
Practical No: 4.2
Title: BankAccount using Inheritance
*/

class BankAccount {

    String accountNumber;
    String accountHolderName;
    double balance;

    void openAccount(String accNo, String name, double bal) {
        accountNumber = accNo;
        accountHolderName = name;
        balance = bal;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        balance -= amount;
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }
}

class SavingAccount extends BankAccount {

    void calculateInterest(double rate) {
        double interest = balance * rate / 100;
        System.out.println("Interest Earned: " + interest);
    }
}

class FixedDepositAccount extends BankAccount {

    void maturityAmount(double rate, int years) {
        double maturity = balance + (balance * rate * years / 100);
        System.out.println("Maturity Amount: " + maturity);
    }
}

public class Practical_4_2 {

    public static void main(String[] args) {

        SavingAccount sa = new SavingAccount();
        sa.openAccount("A101", "Dhruv", 50000);
        sa.deposit(5000);
        sa.checkBalance();
        sa.calculateInterest(5);

        FixedDepositAccount fd = new FixedDepositAccount();
        fd.openAccount("A102", "Rahul", 80000);
        fd.maturityAmount(7, 3);
    }
}