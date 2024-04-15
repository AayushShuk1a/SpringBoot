package com.employeerestapi.EmployeeRestAPI.dao;


import com.employeerestapi.EmployeeRestAPI.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    private EntityManager entityManager;
    public EmployeeDAOImpl(EntityManager entityManager){
        this.entityManager=entityManager;
    }

    @Override
    public List<Employee> FindAll() {
        TypedQuery<Employee>theQuery=entityManager.createQuery("FROM Employee",Employee.class);

        return theQuery.getResultList();
    }

    @Override
    public Employee GetEmployeeByID(int id) {
        Employee theEmployee=entityManager.find(Employee.class,id);
        return theEmployee;
    }

    @Override
    public Employee save(Employee employee) {
        Employee theEmployee=entityManager.merge(employee);
        return employee;
    }

    @Override
    public void DeleteById(int id) {
        Employee employee=entityManager.find(Employee.class,id);
        entityManager.remove(employee);

    }
}
