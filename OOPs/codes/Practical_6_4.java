package OOPs.codes;

/* Practical No: 6.4
Title: Banking Application with Custom Exception

Practical Statement:
- Create class BankAccount
- Initial balance = 1000.00
- deposit() → add money
- withdraw() → subtract money
- If insufficient balance → throw custom exception NotSufficientFundException
*/

 // Custom Exception
class NotSufficientFundException extends Exception {
    public NotSufficientFundException(String message) {
        super(message);
    }
}

// BankAccount class
class BankAccount {

    private double balance;

    // Constructor
    public BankAccount() {
        balance = 1000.00;
    }

    // Deposit method
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: ₹" + amount);
        System.out.println("Current Balance: ₹" + balance);
    }

    // Withdraw method
    public void withdraw(double amount) throws NotSufficientFundException {
        if (amount > balance) {
            throw new NotSufficientFundException("Not Sufficient Fund");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
            System.out.println("Remaining Balance: ₹" + balance);
        }
    }
}

// Main class
public class Practical_6_4 {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        try {
            // Deposit
            acc.deposit(1000.00);

            // Withdrawals
            acc.withdraw(400.00);
            acc.withdraw(300.00);
            acc.withdraw(500.00); // This will throw exception

        } catch (NotSufficientFundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}