package org.softserve.task3;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ParameterizedMethods {
    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        set1.addAll(set2);
        return set1;
    }
    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        set1.retainAll(set2);
        return set1;
    }

    public static void main(String[] args){
        var set1 = new HashSet<Integer>(List.of(3,1,2));
        var set2 = new HashSet<Integer>(List.of(4,3,5));

        var result = ParameterizedMethods.union(set1,set2);
        System.out.println(result);
    }
}
