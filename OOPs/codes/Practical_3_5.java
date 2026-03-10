package OOPs.codes;

/*
Practical No: 3.5
Title: Volume Calculation using Method Overloading

Practical Statement:
Demonstrate method overloading to calculate volume of
Cube, Rectangular Cube, and Sphere.
*/

class VolumeCalculator {

    // Volume of Cube
    double calculateVolume(double side) {
        return side * side * side;
    }

    // Volume of Rectangular Cube
    double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    // Volume of Sphere
    double calculateVolume(float radius) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}

public class Practical_3_5 {

    public static void main(String[] args) {

        VolumeCalculator vc = new VolumeCalculator();

        double cubeVolume = vc.calculateVolume(5);
        double boxVolume = vc.calculateVolume(4, 3, 2);
        double sphereVolume = vc.calculateVolume(3f);

        System.out.println("Volume of Cube: " + cubeVolume);
        System.out.println("Volume of Rectangular Cube: " + boxVolume);
        System.out.println("Volume of Sphere: " + sphereVolume);
    }
}