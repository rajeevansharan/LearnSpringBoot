package com.Basic.Learn_SpringBoot;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Todo {
    private Long id;
    private String username;
    private String description;
    private boolean done;
    private LocalDate targetDate;
}
