package org.example;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Oleg");
        student1.setRating(4);
        Student student2 = new Student("Anna");
        student2.setRating(5);
        Student student3 = new Student();
        student3.setName("Mary");
        student3.setRating(4);
        System.out.println("Out students");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println();
        System.out.print("Student 1 has better rating than student2 ");
        System.out.println(student1.betterStudent(student2));
        System.out.println();
        System.out.printf("Average rating is " + "%.2f", Student.getAvgRating());
    }
}
