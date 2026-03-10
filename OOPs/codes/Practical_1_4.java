package OOPs.codes;

/*
Practical No: 1.4
Title: BMI Calculator

Practical Statement:
Develop a Java application that calculates a person's Body Mass Index (BMI).
The program should ask the user for their weight in pounds and height in inches.
Convert these values to kilograms and meters respectively
(1 pound = 0.45359237 kg, 1 inch = 0.0254 meters)
and then calculate BMI = weight(kg) / (height(m))^2.
Display the calculated BMI.
*/

import java.util.Scanner;

public class Practical_1_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weightPounds = sc.nextDouble();

        System.out.print("Enter height in inches: ");
        double heightInches = sc.nextDouble();

        // Convert units
        double weightKg = weightPounds * 0.45359237;
        double heightMeters = heightInches * 0.0254;

        // Calculate BMI
        double bmi = weightKg / (heightMeters * heightMeters);

        System.out.printf("Your BMI is: %.2f\n", bmi);

        sc.close();
    }
}