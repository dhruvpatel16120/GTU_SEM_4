package OOPs.codes;

/* Practical No: 9.1
Title: ArrayList Operations with Marks

Practical Statement:
- Use ArrayList<Integer> to store marks
- Add at least 5 marks
- Display all marks
- Find highest and lowest using Collections
*/

import java.util.ArrayList;
import java.util.Collections;

public class Practical_9_1 {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<Integer> marks = new ArrayList<>();

        // Add marks
        marks.add(85);
        marks.add(72);
        marks.add(90);
        marks.add(66);
        marks.add(78);

        // Display marks
        System.out.println("Student Marks:");
        for (int m : marks) {
            System.out.println(m);
        }

        // Find highest and lowest
        int max = Collections.max(marks);
        int min = Collections.min(marks);

        // Output
        System.out.println("\nHighest Marks: " + max);
        System.out.println("Lowest Marks: " + min);
    }
}