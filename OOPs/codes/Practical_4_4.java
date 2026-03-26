package OOPs.codes;

/*
Practical No: 4.4
Title: Vehicle Inheritance System
*/

class Vehicle {

    protected String vehicleNumber;
    protected String brand;
    protected String fuelType;

    Vehicle(String v, String b, String f) {
        vehicleNumber = v;
        brand = b;
        fuelType = f;
    }

    void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle {

    int numberOfSeats;
    boolean ACavailable;

    Car(String v, String b, String f, int seats, boolean ac) {
        super(v, b, f);
        numberOfSeats = seats;
        ACavailable = ac;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Seats: " + numberOfSeats);
        System.out.println("AC Available: " + ACavailable);
    }
}

class ElectricCar extends Car {

    int batteryCapacity;
    int chargingTime;

    ElectricCar(String v, String b, int seats, boolean ac, int battery, int chargeTime) {
        super(v, b, "Electric", seats, ac);
        batteryCapacity = battery;
        chargingTime = chargeTime;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Charging Time: " + chargingTime + " hours");
    }
}

public class Practical_4_4 {

    public static void main(String[] args) {

        Vehicle v = new Car("GJ01AB1234", "Toyota", "Petrol", 5, true);

        v.displayDetails();

        if (v instanceof Car) {
            Car c = (Car) v;
            System.out.println("Upcasting and Downcasting Successful");
            c.displayDetails();
        }

        ElectricCar ec = new ElectricCar("GJ02EV9999", "Tesla", 5, true, 75, 2);
        System.out.println("\nElectric Car Details:");
        ec.displayDetails();
    }
}