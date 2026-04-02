package OOPs.codes;

/* Practical No: 6.3
Title: Average Calculation with Exception Handling

Practical Statement:
- Method average(String[] values)
- Convert strings → double and calculate average
- Throw:
    NullPointerException → if element is null
    NumberFormatException → if invalid number
- Use throws in method declaration
- Demonstrate using try-catch-finally
*/

public class Practical_6_3 {

    // Method with throws clause
    public static double average(String[] values)
            throws NullPointerException, NumberFormatException {

        double sum = 0;

        for (int i = 0; i < values.length; i++) {

            // Check null
            if (values[i] == null) {
                throw new NullPointerException("Null value found at index " + i);
            }

            // Convert string to double
            double num = Double.parseDouble(values[i]);

            sum += num;
        }

        return sum / values.length;
    }

    // Main method
    public static void main(String[] args) {

        // Test cases
        String[] validData = {"10", "20", "30"};
        String[] invalidData = {"10", "abc", "30"};
        String[] nullData = {"10", null, "30"};

        // 1. Valid Input
        try {
            System.out.println("Average (Valid): " + average(validData));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Valid test completed\n");
        }

        // 2. Invalid Number
        try {
            System.out.println("Average (Invalid Number): " + average(invalidData));
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Invalid number test completed\n");
        }

        // 3. Null Value
        try {
            System.out.println("Average (Null Value): " + average(nullData));
        } catch (NullPointerException e) {
            System.out.println("Error: Null value encountered");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Null test completed");
        }
    }
}