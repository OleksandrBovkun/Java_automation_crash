package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person[] person = new Person[5];

        for (int i = 0; i < 5; i++) {
            person[i] = new Person();
            System.out.println("Enter information for person " + (i + 1));
            person[i].input();
        }

        System.out.println("Information about people:");
        System.out.println(Arrays.toString(person));

          Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the new name for person " + (i + 1) + ": ");
            String newName = scanner.nextLine();
            person[i].changeName(newName);
        }

        System.out.println("Information about people after name change:");
        System.out.println(Arrays.toString(person));
    }
    }
