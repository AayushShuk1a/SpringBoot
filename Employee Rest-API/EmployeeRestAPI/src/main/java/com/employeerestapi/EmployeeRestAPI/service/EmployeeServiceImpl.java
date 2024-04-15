package com.employeerestapi.EmployeeRestAPI.service;


import com.employeerestapi.EmployeeRestAPI.dao.EmployeeDAO;
import com.employeerestapi.EmployeeRestAPI.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

   private EmployeeDAO employeeDAO;

   public EmployeeServiceImpl(EmployeeDAO employeeDAO){
       this.employeeDAO=employeeDAO;
   }

    @Override
    public List<Employee> findAll() {
        return employeeDAO.FindAll();
    }
}
