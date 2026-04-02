package OOPs.codes;

/* Practical No: 6.1
Title: Exception Handling using Command-Line Arguments

Practical Statement:
- Take numerator and denominator from command-line arguments
- Perform division
- Handle all possible runtime errors using exception handling
*/

public class Practical_6_1 {
    public static void main(String[] args) {

        try {
            // Check if arguments are provided
            if (args.length < 2) {
                throw new ArrayIndexOutOfBoundsException("Please provide two numbers");
            }

            // Convert arguments to integers
            int numerator = Integer.parseInt(args[0]);
            int denominator = Integer.parseInt(args[1]);

            // Division
            int result = numerator / denominator;

            // Output
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integer numbers.");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Missing command-line arguments.");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}