package org.softserve.task3;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class personMapTaskTest {

    @Test
    void isAllNameUnique1() {
        var personMap = new HashMap<String,String>();
        personMap.put("LastName","FirstName");
        personMap.put("Biden","Joe");
        personMap.put("Trump","Donald");
        personMap.put("Obama","Barack");
        personMap.put("Bush","George");
        personMap.put("Clinton","Bill");
        personMap.put("Bush senior","George");
        personMap.put("Reagan","Ronald");
        personMap.put("Carter","James");
        personMap.put("Ford","Gerald");

        var actual = personMapTask.isAllNameUnique(personMap);

        var expected = false;

        assertEquals(expected,actual);
    }
    @Test
    void isAllNameUnique2() {
        var personMap = new HashMap<String,String>();
        personMap.put("LastName","FirstName");
        personMap.put("Biden","Joe");
        personMap.put("Trump","Donald");
        personMap.put("Obama","Barack");
        personMap.put("Bush","George");
        personMap.put("Clinton","Bill");
        personMap.put("Bush senior","George2");
        personMap.put("Reagan","Ronald");
        personMap.put("Carter","James");
        personMap.put("Ford","Gerald");

        var actual = personMapTask.isAllNameUnique(personMap);

        var expected = true;

        assertEquals(expected,actual);
    }
}