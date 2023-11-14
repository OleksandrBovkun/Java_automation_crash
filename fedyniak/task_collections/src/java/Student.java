package fedyniak.task_collections.src.java;


import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Student implements Comparable<Student>{
    private String firstName;
    private String lastName;
    private String course;

    public Student(String firstName, String lastName,String course){
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }


    @Override
    public String toString(){
        return "FIRST NAME: " + this.getFirstName() + ", LAST NAME: " + this.getLastName() + ", COURSE: " + this.getCourse();
    }

    public static void printStudents(List<Student> students, String targetCourse) {
        System.out.println("Students in Course " + targetCourse + ":");
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (Objects.equals(student.getCourse(), targetCourse)) {
                System.out.println(student);
            }
        }
    }

    public static Comparator<Student> lastNameCompare = (st1, st2) -> (st1.getLastName().compareTo(st2.getLastName()));
    public static Comparator<Student> firstNameCompare = (st1, st2) -> (st1.getFirstName().compareTo(st2.getFirstName()));
    public static Comparator<Student> courseCompare = (st1, st2) -> (st1.getCourse().compareTo(st2.getCourse()));

    public int compareTo(Student st) {
        return (this.getLastName().compareTo(st.getLastName()));

    }
}
