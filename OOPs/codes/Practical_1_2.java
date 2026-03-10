package OOPs.codes;

/*
Practical No: 1.2
Title: Solving Two Linear Equations using Cramer's Rule

Practical Statement:
Write a Java program to solve a system of two linear equations
ax + by = e
cx + dy = f

The program should prompt the user to enter coefficients
a, b, c, d, e, f and calculate x and y using Cramer's Rule.

Cramer's Rule:
D  = ad − bc
Dx = ed − bf
Dy = af − ce

x = Dx / D
y = Dy / D

Include error handling if D = 0 (system has no unique solution).
*/

import java.util.Scanner;

public class Practical_1_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a, b, c, d, e, f;
        double D, Dx, Dy, x, y;

        // Taking coefficients from user
        System.out.print("Enter coefficient a: ");
        a = sc.nextDouble();

        System.out.print("Enter coefficient b: ");
        b = sc.nextDouble();

        System.out.print("Enter coefficient c: ");
        c = sc.nextDouble();

        System.out.print("Enter coefficient d: ");
        d = sc.nextDouble();

        System.out.print("Enter value e: ");
        e = sc.nextDouble();

        System.out.print("Enter value f: ");
        f = sc.nextDouble();

        // Calculate determinants
        D = (a * d) - (b * c);
        Dx = (e * d) - (b * f);
        Dy = (a * f) - (e * c);

        // Error handling
        if (D == 0) {
            System.out.println("The equation has no unique solution (D = 0).");
        } else {
            x = Dx / D;
            y = Dy / D;

            System.out.printf("Value of x = %.2f\n", x);
            System.out.printf("Value of y = %.2f\n", y);
        }

        sc.close();
    }
}