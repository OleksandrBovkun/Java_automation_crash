package fedyniak.task_inheritance.src.java.org.example.t2.employees;

import fedyniak.task_inheritance.src.java.org.example.t2.Employee;
import fedyniak.task_inheritance.src.java.org.example.t2.Payment;

public class SalariedEmployee extends Employee implements Payment {
    private String socialSecurityNumber;
    private Integer hourlyRate;
    private Integer workedHours;

    public SalariedEmployee(String firstName, String lastName, Integer age, String employeeId,
                            Integer hourlyRate, Integer workedHours) {
        super(firstName, lastName, age, employeeId);
        this.hourlyRate=hourlyRate;
        this.workedHours=workedHours;
    }


    @Override
    public Integer calculatePay() {
        return this.hourlyRate * this.workedHours;
    }

    public Integer getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(Integer hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public Integer getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(Integer workedHours) {
        this.workedHours = workedHours;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public String toString(){
        return this.getLastName() + " " + this.getFirstName() +
                ":\n\tAge: " + this.getAge() +
                "\n\tEmployeeId:" + this.getEmployeeId() +
                "\n\tHourly rate: " + this.getHourlyRate() +
                "\n\tworked hours: " + this.getWorkedHours() +
                "\n\tpayment: " + this.calculatePay() +
                "\n\tSocial security number: " + this.getSocialSecurityNumber() ;
    }

}
