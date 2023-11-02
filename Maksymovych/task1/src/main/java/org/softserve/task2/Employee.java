package org.softserve.task2;


public abstract class Employee {
    protected String Name;
    protected String employeeld;

    public Employee(String name) {
        this.Name = name;
    }
}

interface Calculation {
    int calculatePay();
}

class SalariedEmployee extends Employee implements Calculation {
    String socialSecurityNumber;
    private int hourlyRate;
    private int numberHoursWorked;

    public SalariedEmployee(String name) {
        super(name);
    }

    public SalariedEmployee(String name, int hourlyRate, int numberHoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.numberHoursWorked = numberHoursWorked;
    }

    @Override
    public int calculatePay() {
        return this.hourlyRate*this.numberHoursWorked;
    }

    @Override
    public String toString() {
        return "Name: "+this.Name+", Salary: "+calculatePay();
    }
}

class ContractEmployee extends Employee implements Calculation {
    String federalTaxIdMember;
    private int fixedMonthlyPayment;

    public ContractEmployee(String name) {
        super(name);
    }

    public ContractEmployee(String name, int fixedMonthlyPayment) {
        super(name);
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public int calculatePay() {
        return this.fixedMonthlyPayment;
    }

    @Override
    public String toString() {
        return "Name: "+this.Name+", Salary: "+calculatePay();
    }
}

class Main2 {
    public static void main(String[] args){
        Employee[] Employees = new Employee[] {
                new SalariedEmployee("John",2,150),
                new ContractEmployee("Andrew",500),
        };

        for (var emp:Employees) {
            System.out.println(emp);
        }
    }
}