package com.personal.tarentotask.Model;

import com.personal.tarentotask.Entity.Employee;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Getter
@Setter
public class ResponseModel {
    private String message = "No data is Found";
    private List<Employee> employee;

}
