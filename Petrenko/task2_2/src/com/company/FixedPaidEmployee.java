package com.company;


public class FixedPaidEmployee extends Employee {
    double fixedMonthlyPayment;

    public FixedPaidEmployee(String employeeId, double fixedMonthlyPayment) {
        super(employeeId);
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public void calculatePay() {
        System.out.println("Employee ID: " + employeeId + ", Average Monthly Salary: " + fixedMonthlyPayment);
    }

    @Override
    public double getAverageMonthlySalary() {
        return fixedMonthlyPayment;
    }
}
