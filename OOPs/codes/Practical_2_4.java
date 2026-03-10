package OOPs.codes;

/*
Practical No: 2.4
Title: Point Class with Constructors

Practical Statement:
Create a class Point representing a 2D point (x, y).
Implement default constructor, parameterized constructor,
and copy constructor. Include display() method.
*/

class Point {

    int x;
    int y;

    // Default constructor
    Point() {
        x = 5;
        y = 5;
    }

    // Parameterized constructor
    Point(int a, int b) {
        x = a;
        y = b;
    }

    // Copy constructor
    Point(Point p) {
        x = p.x;
        y = p.y;
    }

    void display() {
        System.out.println("Point coordinates: (" + x + ", " + y + ")");
    }
}

public class Practical_2_4 {

    public static void main(String[] args) {

        Point p1 = new Point();          // default constructor
        Point p2 = new Point(10, 20);    // parameterized constructor
        Point p3 = new Point(p2);        // copy constructor

        System.out.print("Point 1: ");
        p1.display();

        System.out.print("Point 2: ");
        p2.display();

        System.out.print("Point 3 (Copy of Point 2): ");
        p3.display();
    }
}