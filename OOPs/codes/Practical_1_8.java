package OOPs.codes;

/*
Practical No: 1.8
Title: Command Line Argument Calculation

Practical Statement:
Write a Java program that accepts two numbers as command-line arguments.
Convert these arguments to numeric types and perform a calculation
(such as sum) and print the result.
*/

public class Practical_1_8 {

    public static void main(String[] args) {

        // Check if two arguments are provided
        if (args.length != 2) {
            System.out.println("Please provide exactly two numbers.");
            return;
        }

        // Convert command line arguments to double using wrapper classes
        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);

        // Perform calculation
        double sum = num1 + num2;

        // Display result
        System.out.println("Sum = " + sum);
    }
}