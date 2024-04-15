package com.employeerestapi.EmployeeRestAPI.dao;


import com.employeerestapi.EmployeeRestAPI.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee>FindAll();

    public Employee GetEmployeeByID(int id);

    public Employee save(Employee employee);

    void DeleteById(int id);

}
