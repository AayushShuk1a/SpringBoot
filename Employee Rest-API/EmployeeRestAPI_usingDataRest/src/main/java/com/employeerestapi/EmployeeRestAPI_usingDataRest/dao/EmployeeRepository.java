package com.employeerestapi.EmployeeRestAPI_usingDataRest.dao;

import com.employeerestapi.EmployeeRestAPI_usingDataRest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
