package OOPs.codes;

/* Practical No: 9.6
Title: Generic Method for Sorting List

Practical Statement:
- Create generic method sortList(List<T>)
- T extends Comparable<T>
- Sort elements using Collections.sort()
- Demonstrate with Integer and String lists
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practical_9_6 {

    // Generic method
    public static <T extends Comparable<T>> void sortList(List<T> list) {
        Collections.sort(list);
    }

    public static void main(String[] args) {

        // Integer list
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(45);
        numbers.add(12);
        numbers.add(78);
        numbers.add(23);

        // String list
        ArrayList<String> names = new ArrayList<>();
        names.add("Dhruv");
        names.add("Rahul");
        names.add("Priya");
        names.add("Amit");

        // Before sorting
        System.out.println("Before Sorting (Numbers): " + numbers);
        System.out.println("Before Sorting (Names): " + names);

        // Sorting
        sortList(numbers);
        sortList(names);

        // After sorting
        System.out.println("\nAfter Sorting (Numbers): " + numbers);
        System.out.println("After Sorting (Names): " + names);
    }
}