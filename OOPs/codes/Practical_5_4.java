package OOPs.codes;

/* Practical No: 5.4
Title: Abstract Class Vehicle

Practical Statement:
- Create abstract class Vehicle with:
    fuelType() → returns fuel type
    noOfWheels() → returns number of wheels
- Create subclasses:
    Car → Petrol/Diesel, 4 wheels
    Bike → Petrol, 2 wheels
- Display details in main method
*/

// Abstract class
abstract class Vehicle {
    abstract String fuelType();
    abstract int noOfWheels();
}

// Subclass Car
class Car extends Vehicle {

    @Override
    String fuelType() {
        return "Petrol/Diesel";
    }

    @Override
    int noOfWheels() {
        return 4;
    }
}

// Subclass Bike
class Bike extends Vehicle {

    @Override
    String fuelType() {
        return "Petrol";
    }

    @Override
    int noOfWheels() {
        return 2;
    }
}

// Main class
public class Practical_5_4 {
    public static void main(String[] args) {

        // Creating objects
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        // Display Car details
        System.out.println("Car Details:");
        System.out.println("Fuel Type: " + car.fuelType());
        System.out.println("Number of Wheels: " + car.noOfWheels());

        System.out.println();

        // Display Bike details
        System.out.println("Bike Details:");
        System.out.println("Fuel Type: " + bike.fuelType());
        System.out.println("Number of Wheels: " + bike.noOfWheels());
    }
}