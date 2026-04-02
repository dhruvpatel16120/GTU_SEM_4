package OOPs.codes.pr_5_5.exam;

import OOPs.codes.pr_5_5.student.Student;

/* Package: exam
   Class: Result (extends Student)
*/

public class Result extends Student {

    private int marks1, marks2, marks3;

    // Constructor
    public Result(int rollNo, String name, int m1, int m2, int m3) {
        super(rollNo, name);
        this.marks1 = m1;
        this.marks2 = m2;
        this.marks3 = m3;
    }

    // Method to display result
    public void displayResult() {
        displayStudent();

        int total = marks1 + marks2 + marks3;
        double average = total / 3.0;

        System.out.println("Marks 1: " + marks1);
        System.out.println("Marks 2: " + marks2);
        System.out.println("Marks 3: " + marks3);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
}