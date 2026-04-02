package OOPs.codes;

/* Practical No: 9.5
Title: Generic Method to Search Element in LinkedList

Practical Statement:
- Create generic method searchElement()
- Accept LinkedList<T> and element T
- Return true if element exists, else false
- Test with Integer and String
*/

import java.util.LinkedList;

// Main class
public class Practical_9_5 {

    // Generic method
    public static <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);
    }

    public static void main(String[] args) {

        // LinkedList for roll numbers
        LinkedList<Integer> rollList = new LinkedList<>();
        rollList.add(101);
        rollList.add(102);
        rollList.add(103);

        // LinkedList for names
        LinkedList<String> nameList = new LinkedList<>();
        nameList.add("Dhruv");
        nameList.add("Rahul");
        nameList.add("Priya");

        // Search in Integer list
        System.out.println("Searching 102 in roll numbers: "
                + searchElement(rollList, 102));

        // Search in String list
        System.out.println("Searching 'Rahul' in names: "
                + searchElement(nameList, "Rahul"));

        // Searching non-existing element
        System.out.println("Searching 999 in roll numbers: "
                + searchElement(rollList, 999));
    }
}