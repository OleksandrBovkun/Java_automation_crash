package com.company;
import java.util.Scanner;

class Person {
    private String name;
    private int birthYear;


    public Person() {
    }


    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getBirthYear() {
        return birthYear;
    }


    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }


    public int age() {
        return java.time.Year.now().getValue() - birthYear;
    }


    private void inputName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name (letters and spaces only): ");
        String input = scanner.nextLine();

        if (input.matches("[a-zA-Z\\s]+")) {
            this.name = input;
        } else {
            System.out.println("Invalid input. Please enter a name with letters and spaces only.");
            inputName();
        }
    }


    private void inputBirthYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the birth year (between 1900 and " + java.time.Year.now().getValue() + "): ");
        String input = scanner.next();

        try {
            int year = Integer.parseInt(input);

            if (year >= 1900 && year <= java.time.Year.now().getValue()) {
                this.birthYear = year;
            } else {
                System.out.println("Invalid input. Please enter a valid year between 1900 and " + java.time.Year.now().getValue() + ".");
                inputBirthYear();
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid year (numbers only).");
            inputBirthYear();
        }
    }

    public void input() {
        inputName();
        inputBirthYear();
    }


    public void output() {
        System.out.println("Name: " + name);
        System.out.println("Birth Year: " + birthYear);
        System.out.println("Age: " + age());
    }


    public void changeName(String newName) {
        this.name = newName;
    }
}