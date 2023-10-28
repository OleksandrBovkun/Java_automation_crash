package org.example;
public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter information for person " + (i + 1) + ":");
            Person person = new Person();
            person.input();
            people[i] = person;
        }

        System.out.println("People Information:");
        for (Person person : people) {
            person.output();
            System.out.println();
        }
    }
}