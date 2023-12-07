package com.company;

abstract class Employee implements Payable {
    String employeeId;

    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }
    public abstract double getAverageMonthlySalary();
}


