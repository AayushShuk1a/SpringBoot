package com.luv2code.springboot.thymeleafdemo.controller;

import com.luv2code.springboot.thymeleafdemo.entity.Employee;
import com.luv2code.springboot.thymeleafdemo.service.EmployeeService;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService){
		this.employeeService=employeeService;
	}

	@GetMapping("/showformadd")
	public String ShowFormToAdd(Model theModel){
		Employee employee=new Employee();
		theModel.addAttribute("employee",employee);
		return "employee/employee-form";
	}

	@GetMapping("/list")
	public String listEmployees(Model theModel) {

		List<Employee>employeeList=employeeService.findAll();

		// add to the spring model
		theModel.addAttribute("employees",employeeList);


		return "employee/list-employees";
	}


	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute("employees")Employee employee){
		employeeService.save(employee);

		return "redirect:/employees/list";
	}

}









