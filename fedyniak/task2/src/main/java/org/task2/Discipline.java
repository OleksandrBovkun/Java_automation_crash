package org.task2;

import lombok.*;
import lombok.extern.java.Log;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@ToString
@Log
public class Discipline {
    @NonNull
    private String name;
    @NonNull
    private LocalDate date;
    private LocalDate passDate;
    @NonNull
    private DisciplineTypeEnum type;
    private Integer mark;
    private boolean passed;



}
