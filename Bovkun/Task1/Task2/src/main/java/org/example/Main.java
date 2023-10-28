package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter employee " + (i + 1) + " details:");
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Rate: ");
            double rate = scanner.nextDouble();
            System.out.print("Hours: ");
            double hours = scanner.nextDouble();

            employees[i] = new Employee(name, rate, hours);
        }

        System.out.println("Employee Information:");
        for (Employee employee : employees) {
            System.out.println(employee); // This will call the toString method
            System.out.println();
        }

        System.out.println("Total Salary of All Employees: " + Employee.getTotalSum());
    }
}