package com.employeerestapi.EmployeeRestAPI_usingDataRest.dao;

import com.employeerestapi.EmployeeRestAPI_usingDataRest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;



@RepositoryRestResource(path = "members")
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
