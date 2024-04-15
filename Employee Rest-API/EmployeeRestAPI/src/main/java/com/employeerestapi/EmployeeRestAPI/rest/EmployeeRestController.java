package com.employeerestapi.EmployeeRestAPI.rest;

import com.employeerestapi.EmployeeRestAPI.entity.Employee;
import com.employeerestapi.EmployeeRestAPI.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    public List<Employee>employees;

   private EmployeeService employeeService;

   @Autowired
   public EmployeeRestController(EmployeeService employeeService){
       this.employeeService=employeeService;
   }

    @GetMapping("/employees")
    public List<Employee>findAllEmployee(){
       return employeeService.findAll();
    }

}
