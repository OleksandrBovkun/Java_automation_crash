package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;




public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the number of employees to add: ");
        int numberOfEmployees = scanner.nextInt();


        Payable[] employees = new Payable[numberOfEmployees];


        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");
            employees[i] = inputEmployeeData();
        }


        for (Payable employee : employees) {
            employee.calculatePay();
        }


        Arrays.sort(employees, Comparator.comparingDouble(Payable::getAverageMonthlySalary).reversed());


        System.out.println("\nSorted Employees by Average Monthly Salary (Descending Order):");
        for (Payable employee : employees) {
            System.out.println("Employee ID: " + ((Employee) employee).employeeId + ", Average Monthly Salary: " + employee.getAverageMonthlySalary());
        }

        scanner.close();
    }


    private static Payable inputEmployeeData() {
        System.out.print("Enter the type of employee (1 for Hourly, 2 for Fixed): ");
        int employeeType = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the employee ID: ");
        String employeeId = scanner.nextLine();

        switch (employeeType) {
            case 1:
                System.out.print("Enter the hourly rate: ");
                double hourlyRate = scanner.nextDouble();

                System.out.print("Enter the number of hours worked: ");
                int hoursWorked = scanner.nextInt();

                return new HourlyPaidEmployee(employeeId, hourlyRate, hoursWorked);

            case 2:
                System.out.print("Enter the fixed monthly payment: ");
                double fixedMonthlyPayment = scanner.nextDouble();

                return new FixedPaidEmployee(employeeId, fixedMonthlyPayment);

            default:
                System.out.println("Invalid employee type. Defaulting to Hourly.");
                System.out.print("Enter the hourly rate: ");
                hourlyRate = scanner.nextDouble();

                System.out.print("Enter the number of hours worked: ");
                hoursWorked = scanner.nextInt();

                return new HourlyPaidEmployee(employeeId, hourlyRate, hoursWorked);
        }
    }
}

