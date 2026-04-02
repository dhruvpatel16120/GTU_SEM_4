package OOPs.codes;

/* Practical No: 6.2
Title: Voting Eligibility using Exception Handling

Practical Statement:
- Create class VotingApp with method checkEligibility(int age)
- If age < 18 → throw IllegalArgumentException
- Use try-catch-finally in main
- finally block prints: "Validation process completed"
*/

import java.util.Scanner;

class VotingApp {

    // Method to check eligibility
    public void checkEligibility(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }
}

// Main class
public class Practical_6_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        VotingApp app = new VotingApp();

        try {
            // Input
            System.out.print("Enter age: ");
            int age = sc.nextInt();

            // Method call
            app.checkEligibility(age);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());

        } finally {
            System.out.println("Validation process completed");
            sc.close();
        }
    }
}