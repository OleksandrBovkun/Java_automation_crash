package org.softserve.task2;

import java.util.Arrays;
import java.util.Comparator;

interface Calculation {
    int calculatePay();
}

public abstract class Employee implements Calculation {
    protected String Name;
    protected String employeeld;

    public Employee(String name) {
        this.Name = name;
    }
    @Override
    public String toString() {
        return "Name: "+this.Name+", Salary: "+calculatePay();
    }
}

class SalariedEmployee extends Employee {
    String socialSecurityNumber;
    private int hourlyRate;
    private int numberHoursWorked;

    public SalariedEmployee(String name, int hourlyRate, int numberHoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.numberHoursWorked = numberHoursWorked;
    }

    @Override
    public int calculatePay() {
        return this.hourlyRate*this.numberHoursWorked;
    }
}

class ContractEmployee extends Employee {
    String federalTaxIdMember;
    private int fixedMonthlyPayment;

    public ContractEmployee(String name, int fixedMonthlyPayment) {
        super(name);
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public int calculatePay() {
        return this.fixedMonthlyPayment;
    }
}

class Main2 {
    public static void main(String[] args){
        Employee[] Employees = new Employee[] {
                new SalariedEmployee("John",2,150),
                new ContractEmployee("Andrew",500),
                new SalariedEmployee("Nikolas",3,700),
                new ContractEmployee("Andrew",1200),
        };

        Comparator<Employee> descendingComparator = (o1, o2) -> Integer.compare(o2.calculatePay(), o1.calculatePay());
        Arrays.sort(Employees, descendingComparator);

        for (var emp:Employees) {
            System.out.println(emp);
        }
    }
}