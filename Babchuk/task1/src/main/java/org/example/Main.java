package org.example;

public class Main {
    public static void main(String[] args) {
        Pearson student1 = new Pearson("Iryna", 2004);
        Pearson student2 = new Pearson();
        student1.output();
        System.out.println(student1.age());
        student2.input("Oleg", 1999);
        student2.output();
        student2.changeName("Olga");
        student2.output();

    }
}