package org.task3;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MapTest {
    @Test
    void studentSortByFirstName() {

        Map<String, String> personMap = new HashMap<>();
        personMap.put("Smith", "Alice");
        personMap.put("Jones", "Alice");
        personMap.put("Johnson", "Bob");
        personMap.put("Johnson", "Catherine");
        personMap.put("Johnson", "Emma");

        int actual = personMap.size();
        int expected = 3;
        assertEquals(expected, actual);
    }

}
