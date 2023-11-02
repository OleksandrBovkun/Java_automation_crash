package fedyniak.task2.src.main.java.org.example;

import lombok.*;

import java.time.Year;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@ToString

public class Group {
    @NonNull
    private String number;
    @NonNull
    private Year creationYear;

    private List<Student> students;

    public void addStudent(Student student) {
            student.addGroup(number);
            students.add(student);
    }

    public void addStudents(List<Student> studentList) {
        for (Student student: studentList) {
            addStudent(student);

        }
    }

    public void deleteStudent(Student student){
        if (students.contains(student)){
            student.removeGroup(number);
            students.remove(student);



        }
    }

    public void deleteStudents(List<Student> studentList){
        for (Student student: studentList) {
            deleteStudent(student);
        }
    }


}

