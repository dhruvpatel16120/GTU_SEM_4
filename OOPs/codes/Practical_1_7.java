package OOPs.codes;

/*
Practical No: 1.7
Title: Area of Triangle using Heron's Formula

Practical Statement:
Write a program that takes the lengths of three sides of a triangle as input.
Validate if the sides can form a triangle (sum of any two sides must be greater
than the third side). If valid, calculate the area using Heron's formula.
*/

import java.util.Scanner;

public class Practical_1_7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side a: ");
        double a = sc.nextDouble();

        System.out.print("Enter side b: ");
        double b = sc.nextDouble();

        System.out.print("Enter side c: ");
        double c = sc.nextDouble();

        // Check triangle validity
        if ((a + b > c) && (a + c > b) && (b + c > a)) {

            double s = (a + b + c) / 2;

            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            System.out.printf("Area of triangle = %.2f\n", area);

        } else {
            System.out.println("The given sides cannot form a triangle.");
        }

        sc.close();
    }
}