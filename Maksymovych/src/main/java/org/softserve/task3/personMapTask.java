package org.softserve.task3;

import java.util.HashMap;
import java.util.Map;

public class personMapTask {

    public static boolean isAllNameUnique(Map<String,String> personMap){
        return personMap.values().stream().distinct().count() == personMap.values().size();
    }
    public static void main(String[] args){
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
        System.out.print("There are at less two persons with the same firstName among these 10 people? ");
        if (isAllNameUnique(personMap)){
            System.out.println("No");
        }else {
            System.out.println("Yes");
        }
        personMap.remove("LastName","FirstName");
        System.out.println(personMap);
    }
}
