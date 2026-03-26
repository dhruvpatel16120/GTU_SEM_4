package OOPs.codes;

/*
Practical No: 2.1
Title: Rectangle Class (Area and Perimeter)

Practical Statement:
Define a Java class Rectangle with two double data fields: width and height,
both with default value 1. Implement a no-argument constructor and a constructor
that takes width and height as parameters. Include methods getArea() and
getPerimeter() that return the calculated area and perimeter.
*/

class Rectangle {

    double width = 1;
    double height = 1;

    // No-argument constructor
    Rectangle() {
        System.out.println(" created Rectangle with W: 1 and H: 1");
    }

    // Parameterized constructor
    Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }
}

public class Practical_2_1 {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5, 4);

        System.out.println("Rectangle 1 Area: " + r1.getArea());
        System.out.println("Rectangle 1 Perimeter: " + r1.getPerimeter());

        System.out.println("Rectangle 2 Area: " + r2.getArea());
        System.out.println("Rectangle 2 Perimeter: " + r2.getPerimeter());
    }
}