package fedyniak.task_inheritance.src.java.org.example.t2;

public class Employee {
    private String firstName;
    private String lastName;
    private Integer age;
    private String employeeId;

    public Employee(String firstName, String lastName,  Integer age, String employeeId) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.employeeId=employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
