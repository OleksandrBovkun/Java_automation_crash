package org.example;

public class Student {
    private String name;
    int rating;
    private static int number;
    private static int sum;

    public Student() {
        number++;
    }

    public Student (String name){
        this.name = name;
        number++;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
        sum += rating;
    }
    public static double getAvgRating() {
        return (double) sum / number;
    }
    public boolean betterStudent(Student student) {
        return this.getRating() > student.getRating();
    }
    @Override
    public String toString() {
        return "Student [name=\" + name + \", rating=\" + rating + \"]\";\n";
    }
}

