package org.example;

public class Pearson {
    String name;
    int birthYear;
    public Pearson (String name, int birthYear){
        this.name=name;
        this.birthYear = birthYear;
    }
    public Pearson (){
    }
    public int age(){
        return 2023-this.birthYear;
    }
    public void input (String name, int birthYear){
        this.name =name;
        this.birthYear = birthYear;
    }
    public void output(){
        System.out.print("Person \nname: ");
        System.out.println(this.name);
        System.out.print("birth year: ");
        System.out.println(this.birthYear);
        System.out.println();
    }
    public void changeName(String name){
        this.name=name;
    }
}
