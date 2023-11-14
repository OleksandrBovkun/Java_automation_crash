package org.task2;


import lombok.*;
import lombok.extern.java.Log;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@ToString
@Log
public class Student {
//     прізвище, ім'я, номер залікової книжки, група
    @NonNull
    private String firstName;
    @NonNull
    private String lastName;
    private String scoreBookNumber;
    private List <String> groups;
    private List <Discipline> disciplines;


    public void addGroup(String group){
        groups.add(group);
    }
    public void addGroups(List <String> addGroups){
        groups.addAll(addGroups);
    }


    public void removeGroup(String group){
        groups.remove(group);
    }
    public void removeGroup(List <String> removeGroups){
        for (String group: removeGroups){
            groups.remove(group);
        }
    }

}
