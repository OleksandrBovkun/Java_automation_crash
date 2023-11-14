package t2.employees;


import t2.Employee;
import t2.Payment;

public class ContractEmployee extends Employee implements Payment {
    private String federalTaxIdMember;
    private Integer fixedMonthlyPayment;
    public ContractEmployee(String firstName, String lastName, Integer age, String employeeId,
                            String federalTaxIdMember, Integer fixedMonthlyPayment) {
        super(firstName, lastName, age, employeeId);
        this.federalTaxIdMember = federalTaxIdMember;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    public Integer getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }
    public void setFixedMonthlyPayment(Integer fixedMonthlyPayment) {
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }
    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }
    public void setFederalTaxIdMember(String federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;
    }

    @Override
    public Integer calculatePay() {
        return null;
    }

    @Override
    public String toString(){
        return this.getLastName() + " " + this.getFirstName() +
                ":\n\tAge: " + this.getAge() +
                "\n\tEmployeeId: " + this.getEmployeeId() +
                "\n\tfixed monthly payment: " + this.getFixedMonthlyPayment() +
                "\n\tfederal tax id member: " + this.getFederalTaxIdMember();
    }
}
