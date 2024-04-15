package com.employeerestapi.EmployeeRestAPI.dao;


import com.employeerestapi.EmployeeRestAPI.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee>FindAll();
}
