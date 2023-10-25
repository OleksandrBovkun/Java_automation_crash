package com.company;

import java.util.Scanner;

public class Person {
    private String name;
    private int birthYear;

    // Default constructor
    public Person() {
    }

    // Constructor with 2 parameters
    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for birthYear
    public int getBirthYear() {
        return birthYear;
    }

    // Setter for birthYear
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    // Method to calculate the age
    public int age() {
        return java.time.Year.now().getValue() - birthYear;
    }

    // Method to input information about the person
    public void input() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the name (letters and spaces only): ");
            String input = scanner.nextLine();

            boolean valid = true;
            for (char c : input.toCharArray()) {
                if ((!Character.isLetter(c)) && (c != ' ')) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                this.name = input;
                break; // Break the loop if a valid name is entered
            } else {
                System.out.println("Invalid input. Please enter a name with letters and spaces only.");
            }
        }
        while (true) {
            System.out.print("Enter the birth year (between 1900 and " + java.time.Year.now().getValue() + "): ");
            String input = scanner.next();

            try {
                int year = Integer.parseInt(input);
                if ((year >= 1900) && (year <= java.time.Year.now().getValue())) {
                    this.birthYear = year;
                    break; // Break the loop if a valid year is entered
                } else {
                    System.out.println("Invalid input. Please enter a valid year between 1900 and " + java.time.Year.now().getValue() + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid year (numbers only).");
            }
        }
    }

    // Method to output information about the person
    public void output() {
        System.out.println("Name: " + name);
        System.out.println("Birth Year: " + birthYear);
        System.out.println("Age: " + age());
    }

    // Method to change the name of the person
    public void changeName(String newName) {
        this.name = newName;
    }

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
