package fedyniak.task_inheritance.src.java.org.example.t2;

import fedyniak.task_inheritance.src.java.org.example.t2.employees.ContractEmployee;
import fedyniak.task_inheritance.src.java.org.example.t2.employees.SalariedEmployee;

public class Main {
    public static void main(String[] args) {
        Employee [] employees = new Employee[2];
        employees[0] = new SalariedEmployee(
                "petro", "ravievsky", 22, "123", 85, 160);
        employees[1] = new ContractEmployee(
                "andriy", "lyshyk", 24, "321", "114d",
                20_000);


        for(Employee employee: employees){
            System.out.println(employee);
        }

    }
}
