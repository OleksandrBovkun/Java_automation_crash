package org.softserve.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Student implements Comparable{
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public int compareTo(Object o) {
        return name.compareTo(((Student) o).name) + (course - ((Student) o).course);
    }

    @Override
    public String toString() {
        return "Name: "+name+", course: "+course;
    }

    public void printStudents(List<Student> students, Integer course){
        for (var student : students) {
            if (student.getCourse() == course){
                System.out.println(student);
            }
        }
    }

    static class NameComparator implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            return o1.name.compareTo(o2.name);
        }
    }
    static class CourseComparator implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            return o1.course - o2.course;
        }
    }
    static NameComparator nameComparator = new NameComparator( );
    static CourseComparator courseComparator = new CourseComparator();

    public static Comparator getNameComparator() {
        return nameComparator;
    }
    public static Comparator getCourseComparator() {
        return courseComparator;
    }


    public static void main(String[] args){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Anna",1));
        students.add(new Student("Jaroslav",2));
        students.add(new Student("Oleg",3));
        students.add(new Student("Zina",6));
        students.add(new Student("Boris",5));
        System.out.println("Original");
        System.out.println(students);
        students.sort(Student.getNameComparator());
        System.out.println("Sort by name");
        System.out.println(students);
        students.sort(Student.getCourseComparator());
        System.out.println("Sort by course");
        System.out.println(students);
    }
}
