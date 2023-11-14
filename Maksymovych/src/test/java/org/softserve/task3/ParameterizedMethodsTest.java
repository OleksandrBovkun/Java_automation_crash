package org.softserve.task3;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ParameterizedMethodsTest {

    @Test
    void union() {
        var set1 = new HashSet<Integer>(List.of(3,1,2));
        var set2 = new HashSet<Integer>(List.of(4,3,5));

        var actual = ParameterizedMethods.union(set1,set2);
        var expected = new HashSet<Integer>(List.of(1,2,3,4,5));

        assertEquals(expected,actual);
    }

    @Test
    void intersect() {
        var set2 = new HashSet<Integer>(List.of(3,1,2));
        var set1 = new HashSet<Integer>(List.of(4,3,5));

        var actual = ParameterizedMethods.intersect(set1,set2);
        var expected = new HashSet<Integer>(List.of(3));

        assertEquals(expected,actual);
    }
}