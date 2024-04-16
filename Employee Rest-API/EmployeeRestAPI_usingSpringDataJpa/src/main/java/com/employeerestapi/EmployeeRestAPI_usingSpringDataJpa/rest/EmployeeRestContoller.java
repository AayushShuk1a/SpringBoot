package com.employeerestapi.EmployeeRestAPI_usingSpringDataJpa.rest;


import com.employeerestapi.EmployeeRestAPI_usingSpringDataJpa.entity.Employee;
import com.employeerestapi.EmployeeRestAPI_usingSpringDataJpa.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestContoller {
    private EmployeeService employeeService;
    public EmployeeRestContoller(EmployeeService employeeService){
        this.employeeService=employeeService;
    }

    @GetMapping("/employee")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }

    @GetMapping("/employee/{employeeid}")
    public Employee findUserById(@PathVariable int employeeid){
        return employeeService.findByID(employeeid);
    }

    @PostMapping("/employee")
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.save(employee);
    }

    @PutMapping("/employee")
    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeService.save(employee);
    }

    @DeleteMapping("/employee/{employeeid}")
    public void DeleteEmployee(@PathVariable int employeeid){
        employeeService.Delete(employeeid);
    }
}
