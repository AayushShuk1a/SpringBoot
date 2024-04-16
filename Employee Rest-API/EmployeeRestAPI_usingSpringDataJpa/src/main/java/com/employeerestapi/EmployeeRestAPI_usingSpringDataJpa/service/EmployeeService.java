package com.employeerestapi.EmployeeRestAPI_usingSpringDataJpa.service;

import com.employeerestapi.EmployeeRestAPI_usingSpringDataJpa.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee>findAll();

    public Employee save(Employee employee);
    public Employee findByID(int id);

    public void Delete(int id);

}
