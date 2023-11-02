package org.softserve;

import java.util.ArrayList;
import java.util.Scanner;

public class Person {
    private String name;
    private int birthYear;

    public Person() {}

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

    public int age(){
        return java.time.Year.now().getValue() - this.getBirthYear();
    }

    public void input(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public void output(){
        System.out.println("My name - " + this.getName() + ", i`m " + this.age() + " y.o");
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> listPerson = new ArrayList<>();
        for (int i=0;i<5;i++){
            System.out.println("----------------iteration: "+(i+1)+"----------------");
            System.out.print("Enter your name: ");
            String inputName = scanner.nextLine();
            System.out.print("Enter your Birth Year: ");
            int inputYear = scanner.nextInt();
            scanner.nextLine();
            Person person = new Person();
            person.input(inputName, inputYear);

            listPerson.add(person);
        }
        scanner.close();
        System.out.println("----------------OUTPUT----------------");
        for (var item:listPerson) {
            item.output();
        }
    }
}
