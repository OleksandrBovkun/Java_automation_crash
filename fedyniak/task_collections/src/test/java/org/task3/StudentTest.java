package org.task3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {

    @Test
    void studentSortByLastName() {
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student("Smith", "Bob","v1"),
                new Student("Johnson", "Alice","v2"),
                new Student("Williams", "Bob","v1"),
                new Student("Jones", "Catherine","v2"),
                new Student("Taylor", "Isabel","v2")
        ));

        Collections.sort(students, Student.lastNameCompare);
        List<String> names_actual = new ArrayList<>();
        List<String> names_expected = new ArrayList<>(Arrays.asList(
                "Alice","Bob","Bob","Catherine","Isabel"
        ));
        for (Student st: students){
            names_actual.add(st.getLastName());
        }
        assertEquals(names_expected, names_actual);
    }

    @Test
    void studentSortByFirstName() {
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student("Smith", "Bob","v1"),
                new Student("Johnson", "Alice","v2"),
                new Student("Williams", "Bob","v1"),
                new Student("Jones", "Catherine","v2"),
                new Student("Taylor", "Isabel","v2")
        ));

        Collections.sort(students, Student.firstNameCompare );
        List<String> names_actual = new ArrayList<>();
        List<String> names_expected = new ArrayList<>(Arrays.asList(
                "Johnson", "Jones", "Smith", "Taylor", "Williams"
        ));
        for (Student st: students){
            names_actual.add(st.getFirstName());;
        }
        assertEquals(names_expected, names_actual);
    }





}
