package OOPs.codes;

/*
Practical No: 1.3
Title: Check Vowel or Consonant

Practical Statement:
Write a Java program that prompts the user to enter a single letter (character).
Determine whether the entered character is a vowel (a, e, i, o, u, case-insensitive)
or a consonant, and display the result.
*/

import java.util.Scanner;

public class Practical_1_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a single character: ");
        char ch = sc.next().charAt(0);

        // Convert to lowercase for case-insensitive comparison
        ch = Character.toLowerCase(ch);

        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
            System.out.println("The entered character is a Vowel.");
        }
        else if ((ch >= 'a' && ch <= 'z')) {
            System.out.println("The entered character is a Consonant.");
        }
        else {
            System.out.println("Invalid input. Please enter a letter.");
        }

        sc.close();
    }
}