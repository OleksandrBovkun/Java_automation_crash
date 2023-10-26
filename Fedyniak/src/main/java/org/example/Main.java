package org.example;

public class Main {
    public static void main(String[] args) {
        int peopleCount = 5;
        Person[] people = new Person[peopleCount];
        for (int i = 0; i < peopleCount; i++){
            people[i] = new Person();
        }
        for (Person p : people) {
            p.input();
        }
        for (Person p : people) {
            p.output();
        }
    }
}