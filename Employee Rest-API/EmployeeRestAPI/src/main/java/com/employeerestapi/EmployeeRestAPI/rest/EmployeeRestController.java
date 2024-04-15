package com.employeerestapi.EmployeeRestAPI.rest;

import com.employeerestapi.EmployeeRestAPI.entity.Employee;
import com.employeerestapi.EmployeeRestAPI.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    public List<Employee>employees;

   private EmployeeService employeeService;

   @Autowired
   public EmployeeRestController(EmployeeService employeeService){
       this.employeeService=employeeService;
   }

    @GetMapping("/employees")
    public List<Employee>findAllEmployee(){
       return employeeService.findAll();
    }

    @GetMapping("/employees/{employeeID}")
    public Employee getEmployeeById(@PathVariable int employeeID){
       Employee theEmployee=employeeService.findById(employeeID);

       if(theEmployee==null){
           throw new RuntimeException("Employee Not Found");
       }
       return theEmployee;
    }

    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee employee){
       employee.setId(0);
       Employee theEmployee=employeeService.save(employee);
       return theEmployee;
    }

    @PutMapping("/employee")
    public Employee UpdateEmployee(@RequestBody Employee employee){
       Employee theEmployee=employeeService.save(employee);
       return theEmployee;
    }


    @DeleteMapping("/employee/{employeeID}")
    public void DeleteEmployee(@PathVariable int employeeID){
       employeeService.Delete(employeeID);
    }

}



