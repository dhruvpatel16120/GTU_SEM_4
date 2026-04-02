package OOPs.codes;

/* Practical No: 5.1
Title: Student Division Classification using Interface
Practical Statement:
Given an interface Classify with a method String getDivision(double average).
Implement this method in a class Result such that:
- Returns "First Division" if average is 60 or more
- Otherwise returns "No Division"
*/

import java.util.Scanner;

// Interface
interface Classify {
    String getDivision(double average);
}

// Implementation class
class Result implements Classify {

    @Override
    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else {
            return "No Division";
        }
    }
}

// Main class
public class Practical_5_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter average marks: ");
        double avg = sc.nextDouble();

        // Object creation
        Result res = new Result();

        // Calling method
        String division = res.getDivision(avg);

        // Output
        System.out.println("Division: " + division);

        sc.close();
    }
}