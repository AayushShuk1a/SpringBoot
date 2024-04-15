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
}
