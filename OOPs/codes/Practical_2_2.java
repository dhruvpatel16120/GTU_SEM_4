package OOPs.codes;

/*
Practical No: 2.2
Title: Employee Class

Practical Statement:
Create an Employee class with private instance variables employeeName
and employeeSalary. Implement methods readEmployeeData() to take input
from user and displayEmployeeData() to display employee details.
*/

import java.util.Scanner;

class Employee {

    private String employeeName;
    private double employeeSalary;

    void readEmployeeData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        employeeName = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        employeeSalary = sc.nextDouble();
    }

    void displayEmployeeData() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Salary: " + employeeSalary);
    }
}

public class Practical_2_2 {

    public static void main(String[] args) {

        Employee emp = new Employee();

        emp.readEmployeeData();
        emp.displayEmployeeData();
    }
}