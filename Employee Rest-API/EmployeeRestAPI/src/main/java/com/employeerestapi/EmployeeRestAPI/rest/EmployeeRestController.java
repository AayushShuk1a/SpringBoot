package com.employeerestapi.EmployeeRestAPI.rest;

import com.employeerestapi.EmployeeRestAPI.dao.EmployeeDAO;
import com.employeerestapi.EmployeeRestAPI.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    public List<Employee>employees;

    private EmployeeDAO employeeDAO;
    public EmployeeRestController(EmployeeDAO employeeDAO){
        this.employeeDAO=employeeDAO;
    }

    @GetMapping("/employees")
    public List<Employee>findAllEmployees(){
        return employeeDAO.FindAll();
    }
}
