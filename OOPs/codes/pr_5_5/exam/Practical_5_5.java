package OOPs.codes.pr_5_5.exam;

import java.util.Scanner;

/* Main class inside exam package */

public class Practical_5_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter Marks 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter Marks 3: ");
        int m3 = sc.nextInt();

        // Object creation
        Result res = new Result(roll, name, m1, m2, m3);

        // Display Marksheet
        System.out.println("\n----- MARK SHEET -----");
        res.displayResult();

        sc.close();
    }
}