package com.employeerestapi.EmployeeRestAPI.service;

import com.employeerestapi.EmployeeRestAPI.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee>findAll();

    public Employee findById(int id);

    public Employee save(Employee employee);

    public void Delete(int id);
}
