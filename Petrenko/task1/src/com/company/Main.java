package com.company;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[5];

        for (int i = 0; i < 5; i++) {
            people[i] = new Person();
            System.out.println("Enter information for person " + (i + 1));
            people[i].input();
        }

        System.out.println("Information about people:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Person " + (i + 1));
            people[i].output();
        }
    }
}