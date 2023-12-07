package com.company;

public class HourlyPaidEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    public HourlyPaidEmployee(String employeeId, double hourlyRate, int hoursWorked) {
        super(employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void calculatePay() {
        double averageMonthlySalary = hourlyRate * hoursWorked;
        System.out.println("Employee ID: " + employeeId + ", Average Monthly Salary: " + averageMonthlySalary);
    }

    @Override
    public double getAverageMonthlySalary() {
        return hourlyRate * hoursWorked;
    }
}