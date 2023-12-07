package org.task3;


import java.util.*;

public class Main {
    public static void main(String[] args) {

        // task1
        Set<Integer> numbers1 = new HashSet<>();
        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(3);

        Set<Integer> numbers2 = new HashSet<>();
        numbers2.add(1);
        numbers2.add(4);
        numbers2.add(5);

        Set<Integer> unionResult = Task1.union(numbers1,numbers2);
        System.out.println(unionResult);
        Set<Integer> intersectionResult = Task1.intersection(numbers1,numbers2);
        System.out.println(intersectionResult);

        //task2
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Smith", "Alice");
        personMap.put("Johnson", "Alice");
        personMap.put("Johnson", "Bob");
        personMap.put("Jones", "Catherine");
        personMap.put("Brown", "David");
        personMap.put("Davis", "Emma");
        personMap.put("Miller", "Frank");
        personMap.put("Wilson", "Grace");
        personMap.put("Moore", "Henry");
        personMap.put("Taylor", "Isabel");

        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println("LAST NAME: " + entry.getKey() + ", FIRST NAME: " + entry.getValue());
        }

        personMap.values().remove("Catherine");
        System.out.println(personMap);

        //task3

        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student("Smith", "Alice","v1"),
                new Student("Johnson", "Alice","v2"),
                new Student("Williams", "Bob","v1"),
                new Student("Jones", "Catherine","v2"),
                new Student("Taylor", "Isabel","v2")
                ));

        Student.printStudents(students, "v1");

        System.out.println("lastNameCompare");

        Collections.sort(students);
        for (Student st: students){
            System.out.println(st);
        }

        System.out.println("lastNameCompare");
        Collections.sort(students, Student.courseCompare);
        for (Student st: students){
            System.out.println(st);
        }






    }
}
