package com.employee_management_system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee_management_system.dao.CompanyDAO;
import com.employee_management_system.dao.EmployeeDAO;
import com.employee_management_system.dto.Company;
import com.employee_management_system.dto.Employee;

@Service
public class EmployeeService {
  

	@Autowired
	private EmployeeDAO employeeDAO;
	
	@Autowired
	private CompanyDAO dao;
	
	public Employee saveEmployee(Employee employee,int companyId) {
		Company company=dao.getCompanyById(companyId);
		if(company!=null) {
			List<Employee> employees=company.getEmployee();
			employees.add(employee);
			company.setEmployee(employees);
		Employee employee2=	employeeDAO.saveEmployee(employee);
			dao.saveCompany(company);
		return employee2;
	}else {
		return null;
	}
	}
	public Employee getEmployeeById(int employeeId) {
	  return employeeDAO.getEmployeeById(employeeId);
	}
	public Employee updateEmployee(int employeeId,Employee employee) {
		return employeeDAO.updateEmployee(employeeId, employee);
	}
	public void deleteEmployee(int employeeId) {
		 employeeDAO.deleteEmplyee(employeeId);
	}
}
