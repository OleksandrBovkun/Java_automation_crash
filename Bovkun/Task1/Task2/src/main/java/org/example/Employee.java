package org.example;

import java.util.Scanner;

public class Employee {
    private String name;
    private double rate;
    private double hours;
    private static double totalSum = 0.0;

    public Employee() {
    }

    public Employee(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, double rate, double hours) {
        this(name, rate);
        this.hours = hours;
        totalSum += getSalary();
    }

    public double getSalary() {
        return rate * hours;
    }

    public double getBonuses() {
        return 0.1 * getSalary();
    }

    public void displayEmployeeInfo() {
        System.out.println("Name: " + name);
        System.out.println("Rate: " + rate);
        System.out.println("Hours: " + hours);
        System.out.println("Salary: " + getSalary());
    }

    public static double getTotalSum() {
        return totalSum;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Rate: " + rate + "\n" +
                "Hours: " + hours + "\n" +
                "Salary: " + getSalary();
    }
}