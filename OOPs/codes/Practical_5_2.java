package OOPs.codes;

/* Practical No: 5.2
Title: Multiple Interface Implementation (Exam & Classify)
Practical Statement:
- Create an interface Exam with method: boolean isPassed(int mark)
- Create an interface Classify with method: String getDivision(double average)
- Implement both interfaces in class Result
- Demonstrate both methods in main
*/

import java.util.Scanner;

// Interface 1
interface Exam {
    boolean isPassed(int mark);
}

// Interface 2
interface Classify {
    String getDivision(double average);
}

// Class implementing both interfaces
class Result implements Exam, Classify {

    // Implementation of Exam interface
    @Override
    public boolean isPassed(int mark) {
        return mark >= 40; // pass condition
    }

    // Implementation of Classify interface
    @Override
    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else if (average >= 50) {
            return "Second Division";
        } else if (average >= 40) {
            return "Third Division";
        } else {
            return "Fail";
        }
    }
}

// Main class
public class Practical_5_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter marks: ");
        int mark = sc.nextInt();

        System.out.print("Enter average: ");
        double avg = sc.nextDouble();

        // Object creation
        Result res = new Result();

        // Calling methods
        boolean passStatus = res.isPassed(mark);
        String division = res.getDivision(avg);

        // Output
        System.out.println("Pass Status: " + (passStatus ? "Passed" : "Failed"));
        System.out.println("Division: " + division);

        sc.close();
    }
}