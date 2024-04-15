package com.employeerestapi.EmployeeRestAPI.service;


import com.employeerestapi.EmployeeRestAPI.dao.EmployeeDAO;
import com.employeerestapi.EmployeeRestAPI.entity.Employee;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Override
    public Employee findById(int id) {
        return employeeDAO.GetEmployeeByID(id);
    }

    @Transactional
    @Override
    public Employee save(Employee employee) {
        return employeeDAO.save(employee);
    }

    @Transactional
    @Override
    public void Delete(int id) {
       employeeDAO.DeleteById(id);

    }
}
