package com.personal.CrudTask.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.personal.CrudTask.Entity.Person;
import com.personal.CrudTask.Model.ResponseModel;
import com.personal.CrudTask.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public ArrayList<Person> findAllPerson() {
        return (ArrayList<Person>) personRepository.findAll();
    }

    public Person findPersonById(long id) {
        Optional<Person> opt = personRepository.findById(id);
        if (opt.isPresent()) {
            return opt.get();
        } else {
            return null;
        }
    }

    public ResponseModel addPerson(Object person) throws JsonProcessingException {
        ResponseModel responseModel = new ResponseModel();
        ObjectMapper objectMapper = new ObjectMapper();
        String request = objectMapper.writeValueAsString(person); // converts person of the type Object to Json String
        JsonNode requestNode = objectMapper.readTree(request); // converts Json string to a Json Node structure
        JsonNode personData = requestNode.get("request"); // retrieves the specific node containing person data (personData) from the main requestNode.

        Person personObject = new Person();
        personObject.setName(personData.get("name").asText());
        personObject.setCity(personData.get("city").asText());
        personObject.setDepartment(personData.get("department").asText());
        personRepository.save(personObject);
        responseModel.setMessage("Person data added successfully");
        responseModel.setPerson(personObject);
        return responseModel;
    }

    public ResponseModel updatePerson(Object person) throws JsonProcessingException {
        ResponseModel responseModel = new ResponseModel();
        ObjectMapper objectMapper = new ObjectMapper();
        String request = objectMapper.writeValueAsString(person);
        JsonNode requestNode = objectMapper.readTree(request);
        JsonNode personData = requestNode.get("request");

        Person personObject = new Person();
        long id = personData.get("id").asLong();
        Optional<Person> personOptional = personRepository.findById(id);
        if (personOptional.isPresent()) {
            personObject.setId(id);
            personObject.setName(personData.get("name").asText());
            personObject.setCity(personData.get("city").asText());
            personObject.setDepartment(personData.get("department").asText());
        }
        personRepository.save(personObject);
        responseModel.setMessage("Person data updated successfully");
        responseModel.setPerson(personObject);
        return responseModel;
    }

    public ResponseModel deleteAllData(long id) {
        ResponseModel responseModel = new ResponseModel();
        Optional<Person> personOptional = personRepository.findById(id);
        if (personOptional.isPresent()) {
            personRepository.deleteById(id);
        }
        responseModel.setMessage("Person data deleted successfully ");
        return responseModel;
    }
}
