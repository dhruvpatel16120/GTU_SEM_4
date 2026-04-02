package OOPs.codes;

/* Practical No: 9.4
Title: Generic Class Box<T>

Practical Statement:
- Create generic class Box<T>
- Method addItem(T item) → store items in ArrayList<T>
- Demonstrate:
    Box<String> → names
    Box<Integer> → roll numbers
*/

import java.util.ArrayList;

// Generic Class
class Box<T> {

    private ArrayList<T> items = new ArrayList<>();

    // Method to add item
    public void addItem(T item) {
        items.add(item);
    }

    // Method to display items
    public void displayItems() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}

// Main class
public class Practical_9_4 {
    public static void main(String[] args) {

        // Box for names
        Box<String> nameBox = new Box<>();
        nameBox.addItem("Dhruv");
        nameBox.addItem("Rahul");
        nameBox.addItem("Priya");

        // Box for roll numbers
        Box<Integer> rollBox = new Box<>();
        rollBox.addItem(101);
        rollBox.addItem(102);
        rollBox.addItem(103);

        // Display
        System.out.println("Names:");
        nameBox.displayItems();

        System.out.println("\nRoll Numbers:");
        rollBox.displayItems();
    }
}