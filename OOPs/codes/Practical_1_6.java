package OOPs.codes;

/*
Practical No: 1.6
Title: Add One to Each Digit

Practical Statement:
Write a Java program that accepts a five-digit integer from the keyboard.
Create a new number by adding one to each digit of the input number.
Example: Input 12391 → Output 23402
*/

import java.util.Scanner;

public class Practical_1_6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a five-digit number: ");
        int num = sc.nextInt();

        int result = 0;
        int place = 1;

        while (num > 0) {

            int digit = num % 10; // get last digit from right
            digit = (digit + 1) % 10;   // add 1 in digit with all posible values

            result = result + digit * place; // create result with +1 in input

            place = place * 10; // update the position of value
            num = num / 10; //remove last digit
        }

        System.out.println("New number after adding 1 to each digit: " + result);

        sc.close();
    }
}