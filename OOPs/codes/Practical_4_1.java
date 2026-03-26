package OOPs.codes;

/*
Practical No: 4.1
Title: Shape Inheritance Example
*/

class Shape {

    double d1, d2;

    void getData(double a, double b) {
        d1 = a;
        d2 = b;
    }
}

class Triangle extends Shape {

    double area() {
        return 0.5 * d1 * d2; // 1/2*a*b
    }
}

class Rectangle extends Shape {

    double area() {
        return d1 * d2;
    }
}

public class Practical_4_1 {

    public static void main(String[] args) {

        Triangle t = new Triangle();
        t.getData(10, 5);
        System.out.println("Triangle Area: " + t.area());

        Rectangle r = new Rectangle();
        r.getData(8.0, 4.0);
        System.out.println("Rectangle Area: " + r.area());
    }
}