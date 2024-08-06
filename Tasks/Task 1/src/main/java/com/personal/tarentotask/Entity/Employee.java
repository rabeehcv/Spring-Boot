package com.personal.tarentotask.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_seq")
    @SequenceGenerator(name = "employee_seq", sequenceName = "data.employee_id_seq", allocationSize = 1)
    private long id;

    private String name;
    private String department;
    private LocalDate hiredate;

    public Employee(){
        super();
    }
}

