package com.employee_management_system.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee_management_system.dto.Employee;
import com.employee_management_system.repository.EmployeeRepository;

@Repository
public class EmployeeDAO {
	
	@Autowired
	private EmployeeRepository repository;
	
	public Employee saveEmployee(Employee employee) {
		return repository.save(employee);
	}
	public Employee getEmployeeById(int employeeId) {
		Optional<Employee> optional= repository.findById(employeeId);
		if(optional.isEmpty()) {
			return null;
		}else {
			return optional.get();
		 
	}
	}
    public Employee updateEmployee(int employeeId, Employee employee) {
    	Employee employee2=getEmployeeById(employeeId);
    	if(employee2!=null) {
    		employee.setEmployeeId(employeeId);
    		return repository.save(employee);
    	}else {
    		return null;
    	}
    }
	public void deleteEmplyee(int employeeId) {
		Employee employee2=getEmployeeById(employeeId);
		if(employee2!=null) {
		repository.deleteById(employeeId);
		}
	}
}
