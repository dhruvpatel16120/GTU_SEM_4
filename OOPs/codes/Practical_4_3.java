package OOPs.codes;

/*
Practical No: 4.3
Title: Method Overriding Example
*/

class Employee {

    String name = "Dhruv";
    String department = "IT";

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
    }
}

class Manager extends Employee {

    int teamSize = 10;

    @Override
    void displayDetails() {
        System.out.println("Manager Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
    }
}

public class Practical_4_3 {

    public static void main(String[] args) {

        Employee e = new Employee();
        Manager m = new Manager();

        e.displayDetails();
        System.out.println("-------------");
        m.displayDetails();
    }
}