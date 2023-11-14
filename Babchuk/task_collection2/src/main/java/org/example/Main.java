package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> mapA = new HashMap<>();
        mapA.put("Kostiuk", "Jana");
        mapA.put("Barwinskii", "Orest");
        mapA.put("Shevchenko", "Julia");
        mapA.put("Kobylianskii", "Pavlo");
        mapA.put("Vyshnia", "Pavlo");
        mapA.put("Grushevskii", "Kateryna");
        mapA.put("Pavlo", "Alina");
        mapA.put("Lypa", "Taras");
        mapA.put("Lishchyna", "Ostap");
        mapA.put("Zhyto", "Olga");
        System.out.println("Old hashMap");
        for (Map.Entry<String, String> entry : mapA.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        int c=0;
        for (Map.Entry<String, String> entry : mapA.entrySet()) {
            if(entry.getValue().equals("Pavlo")){
                c++;
            }
        }
        System.out.print("\nAmount of Pavlo: ");
        System.out.println(c);


        String returned_value = String.valueOf(' ');
        for (Map.Entry<String, String> entry : mapA.entrySet()) {
            if(entry.getValue().equals("Orest")){
                returned_value = entry.getKey();
            }
        }
        returned_value = mapA.remove(returned_value);
        System.out.println("Returned value is: "+ returned_value+"\n");


        System.out.println("New hashMap");
        for (Map.Entry<String, String> entry : mapA.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}