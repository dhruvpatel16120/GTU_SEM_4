package OOPs.codes;

/* Practical No: 5.3
Title: Online Order Processing System (Partial Interface Implementation)

Practical Statement:
- Create interface Order with methods:
    placeOrder(String item, int qty)
    cancelOrder(int orderId)
    generateBill()
- Create abstract class PartialOrder that implements Order and only defines placeOrder()
- Create FinalOrder class that implements remaining methods
- Take user input and allow bill generation or cancellation
*/

import java.util.Scanner;

// Interface
interface Order {
    void placeOrder(String item, int qty);
    void cancelOrder(int orderId);
    void generateBill();
}

// Abstract class (Partial Implementation)
abstract class PartialOrder implements Order {
    String itemName;
    int quantity;
    int orderId;

    @Override
    public void placeOrder(String item, int qty) {
        this.itemName = item;
        this.quantity = qty;
        this.orderId = (int)(Math.random() * 1000); // random order ID
        System.out.println("Order Placed Successfully!");
        System.out.println("Order ID: " + orderId);
    }
}

// Concrete class
class FinalOrder extends PartialOrder {

    @Override
    public void cancelOrder(int orderId) {
        if (this.orderId == orderId) {
            System.out.println("Order " + orderId + " has been cancelled.");
        } else {
            System.out.println("Invalid Order ID!");
        }
    }

    @Override
    public void generateBill() {
        double pricePerItem = 100; // fixed price
        double total = quantity * pricePerItem;

        System.out.println("\n----- BILL -----");
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per item: ₹" + pricePerItem);
        System.out.println("Total Amount: ₹" + total);
    }
}

// Main class
public class Practical_5_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FinalOrder order = new FinalOrder();

        // Input order details
        System.out.print("Enter item name: ");
        String item = sc.nextLine();

        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        // Place order
        order.placeOrder(item, qty);

        // Menu
        System.out.println("\n1. Generate Bill");
        System.out.println("2. Cancel Order");
        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            order.generateBill();
        } else if (choice == 2) {
            System.out.print("Enter Order ID to cancel: ");
            int id = sc.nextInt();
            order.cancelOrder(id);
        } else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}