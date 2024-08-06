package com.personal.tarentotask.Service;

import com.personal.tarentotask.Entity.Employee;
import com.personal.tarentotask.Model.ResponseModel;
import com.personal.tarentotask.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public ResponseModel findEmployees(String department, int year){
        ResponseModel responseModel = new ResponseModel();
        List<Employee> employee = employeeRepository.findEmployees(department, year);
        responseModel.setEmployee(employee);
        if(!employee.isEmpty()){
            responseModel.setMessage("Data Found!");
        }
        return responseModel;
    }

}
