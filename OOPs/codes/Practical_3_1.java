package OOPs.codes;

/*
Practical No: 3.1
Title: Static Variable, Static Block and Instance Block

Practical Statement:
Create a class University with static variable totalStudents.
Use static block to initialize universityName and instance block
to display message when object is created.
*/

class University {

    static int totalStudents = 0;
    static String universityName;

    // Static block
    static {
        universityName = "GTU";
        System.out.println("Static block executed.");
        System.out.println("University Name: " + universityName);
    }

    // Instance block
    {
        System.out.println("A new student object is created.");
    }

    // Constructor
    University() {
        totalStudents++;
    }

    static int getTotalStudents() {
        return totalStudents;
    }
}

public class Practical_3_1 {

    public static void main(String[] args) {

        University s1 = new University();
        University s2 = new University();
        University s3 = new University();

        System.out.println("Total Students: " + University.getTotalStudents());
        
    }
}