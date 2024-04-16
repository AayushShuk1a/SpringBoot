package com.employeerestapi.EmployeeRestAPI_usingSpringDataJpa.dao;

import com.employeerestapi.EmployeeRestAPI_usingSpringDataJpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
