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

import com.employee_management_system.dto.Company;
import com.employee_management_system.service.CompanyService;

@RestController
@RequestMapping("/company")
public class CompanyController {

	@Autowired
	private CompanyService companyService;
	
	@PostMapping
	public Company saveCompany(@RequestBody Company company) {
		return companyService.saveCompany(company);
	}
	
	@GetMapping
	public Company getCompany(@RequestParam int companyId) {
		return companyService.getCompanyById(companyId);
	}
	@PutMapping
	public Company upadaCompany(@RequestParam int companyId, @RequestBody Company company) {
		return companyService.updateCompany(companyId, company);
	}
	@DeleteMapping
	public Company deleteCompany(@RequestParam int companyId) {
		return companyService.deleteCompany(companyId);
	}
	
}
