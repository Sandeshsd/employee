package com.employee_management_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employee_management_system.dto.Employee;
import com.employee_management_system.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;

	@PostMapping
	public Employee saveEmployee(@RequestBody Employee employee,@RequestParam int companyId) {
		return service.saveEmployee(employee,companyId);
	}
	@GetMapping
	public Employee getEmployeeById( @RequestParam int employeeId) {
		return service.getEmployeeById(employeeId);
	}
	@PutMapping
	public Employee updateEmployee( @RequestParam int employeeId,@RequestBody Employee employee) {
		return service.updateEmployee(employeeId, employee);
	}
	@DeleteMapping
	public void deleteEmployee(@RequestParam int employeeId) {
		 service.deleteEmployee(employeeId);
	}
	
}
