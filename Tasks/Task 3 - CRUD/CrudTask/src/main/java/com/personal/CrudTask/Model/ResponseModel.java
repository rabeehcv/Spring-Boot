package com.personal.CrudTask.Model;

import com.personal.CrudTask.Entity.Person;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class ResponseModel {
    private String message;
    private Person person;
}
