package org.example;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static <T>Set<T> union(Set<T> set1, Set<T> set2){
        Set<T> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;

    }
    public static <T>Set<T> intersect(Set<T> set1, Set<T> set2){
        Set<T> unionSet = new HashSet<>(set1);
        unionSet.retainAll(set2);
        return unionSet;
    }
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(9);
        set2.add(8);
        set2.add(2);

        Set<Integer> union = union(set1, set2);

        // check element is present or not. if not loop will
        // break.
        for (Integer integer : union) {
            System.out.println(integer);
        }

        System.out.println(' ');

        Set<Integer> intersect = intersect(set1, set2);

        // check element is present or not. if not loop will
        // break.
        for (Integer integer : intersect) {
            System.out.println(integer);
        }


    }
}