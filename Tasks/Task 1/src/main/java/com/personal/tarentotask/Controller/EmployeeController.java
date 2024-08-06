package com.personal.tarentotask.Controller;

import com.personal.tarentotask.Model.ResponseModel;
import com.personal.tarentotask.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/department/{department}/hireYear/{year}")
    public ResponseModel getEmployees(@PathVariable String department, @PathVariable int year){
        return employeeService.findEmployees(department, year);
    }
}
