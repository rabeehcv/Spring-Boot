package com.personal.CrudTask.Controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.personal.CrudTask.Entity.Person;
import com.personal.CrudTask.Model.ResponseModel;
import com.personal.CrudTask.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class PersonController {

    @Autowired
    PersonService personService;

    @PostMapping("/create")
    public ResponseModel addPerson(@RequestBody Object person) throws JsonProcessingException{
        return personService.addPerson(person);
    }
    @PatchMapping("/update")
    public ResponseModel updateEmployee(@RequestBody Object person) throws JsonProcessingException{
        return personService.updatePerson(person);
    }
    @GetMapping("/findAll")
    public ArrayList<Person> getAllEmployee(){
        return personService.findAllPerson();
    }
    @GetMapping("/findAll/{id}")
    public Person findAllEmployeeById(@PathVariable long id){
        return personService.findPersonById(id);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseModel delete(@PathVariable long id){
        return personService.deleteAllData(id);
    }
}
