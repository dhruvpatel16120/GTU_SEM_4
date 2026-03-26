package OOPs.codes;

/*
Practical No: 3.3
Title: College Admission System using Inner Class
*/

import java.util.Scanner;

class College {

    private String collegeName;

    College(String name) {
        collegeName = name;
    }

    // Non-static inner class
    class Admission {

        String studentName;
        String course;

        void acceptDetails() {
            @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Student Name: ");
            studentName = sc.nextLine();

            System.out.print("Enter Course: ");
            course = sc.nextLine();
        }

        void displayDetails() {
            System.out.println("\nAdmission Details");
            System.out.println("College Name: " + collegeName);
            System.out.println("Student Name: " + studentName);
            System.out.println("Course: " + course);
        }
    }
}

public class Practical_3_3 {

    public static void main(String[] args) {

        College c = new College("IIT Bomby");

        College.Admission a = c.new Admission();

        a.acceptDetails();
        a.displayDetails();
    }
}