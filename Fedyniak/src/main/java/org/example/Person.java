package org.example;

import java.time.Year;
import java.util.Objects;
import java.util.Scanner;



public class Person {
    private String name;
    private int birthYear;

    public Person(){}
    public Person(String name){
        this.name = name;
    }
    public Person(String name, int birthYear){
        this.name = name;
        this.birthYear = birthYear;

    }


    private void setName(String name) {
        this.name = name;
    }
    private void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    public int getBirthYear() {
        return this.birthYear;
    }
    public String getName() {
        return this.name;
    }


    public int age(){
        return Year.now().getValue() - this.birthYear;
    }

    public void input(){
        changeName();
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.println("Enter birth year (integer only): ");
            String inputBirthYear = in.nextLine();
            if (!Objects.equals(inputBirthYear, "")){
                try {
                    int inputBirthYearInt = Integer.parseInt(inputBirthYear);
                    setBirthYear(inputBirthYearInt);
                    break;
                }catch (NumberFormatException exception){
                    System.out.println("Incorrect input - birth year should be integer only!");
                }
            } else {
                break;
            }
        }
    }
    public void output(){
        System.out.println("Name: " + getName());
        System.out.println("Birth year: " + getBirthYear());
        System.out.println("Age: " + age());
    }


    public void changeName(){
        Scanner in = new Scanner(System.in);
        System.out.println("Press enter to leave unchanged : ");
        System.out.println("Enter name: ");
        String inputName = in.nextLine();
        if (!Objects.equals(inputName, "")){
            setName(inputName);
        }
    }


}
