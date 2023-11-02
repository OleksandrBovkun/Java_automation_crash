package fedyniak.task2.src.main.java.org.example;


import fedyniak.task2.src.main.java.org.example.enums.DisciplineTypeEnum;

import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Student petro = new Student(
                "petro",
                "vovchuck",
                "123-qwe",
                new ArrayList<>(),
                new ArrayList<>(Arrays.asList(
                        new Discipline("math",LocalDate.of(2024, 11, 2 ),
                                DisciplineTypeEnum.EXAM ),
                        new Discipline("math",LocalDate.of(2024, 11, 5 ),
                                DisciplineTypeEnum.CREDIT )
                        )));

        Group ipz = new Group();
        ipz.setNumber("ipz");
        ipz.setCreationYear(Year.now());
        ipz.setStudents(new ArrayList<>());

        ipz.addStudent(petro);

        List<Student> knStudents = new ArrayList<>();

        Student vlad = new Student(
                "vlad",
                "kochak",
                "123-qsw",
                new ArrayList<>(),
                new ArrayList<>(Arrays.asList(
                    new Discipline("math",LocalDate.of(2024, 11, 2 ),
                            DisciplineTypeEnum.EXAM ),
                    new Discipline("math",LocalDate.of(2024, 11, 5 ),
                            DisciplineTypeEnum.CREDIT )
                )));
        Student ihor = new Student(
                "ihor",
                "fedorchuck",
                "123-qsq",
                new ArrayList<>(),
                new ArrayList<>(Arrays.asList(
                    new Discipline("math",LocalDate.of(2024, 11, 2 ),
                            DisciplineTypeEnum.EXAM ),
                    new Discipline("math",LocalDate.of(2024, 11, 5 ),
                            DisciplineTypeEnum.CREDIT )
                    )));

        knStudents.add(vlad);
        knStudents.add(ihor);

        Group kn = new Group("kn", Year.of(2024), knStudents);

        System.out.println(ipz);
        System.out.println(kn);



        kn.deleteStudent(ihor);
        System.out.println(kn);
        System.out.println(ihor);


    }
}
