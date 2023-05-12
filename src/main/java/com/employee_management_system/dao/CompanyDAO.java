package com.employee_management_system.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee_management_system.dto.Company;
import com.employee_management_system.dto.Employee;
import com.employee_management_system.repository.CompanyRepository;

@Repository
public class CompanyDAO {

	@Autowired
	private CompanyRepository repository;
	
	public Company saveCompany(Company company) {
		return repository.save(company);
	}
	public Company getCompanyById(int companyId) {
		Optional<Company> optional= repository.findById(companyId);
		if(optional.isEmpty()) {
			return null;
		}else {
		return optional.get();
		}
	}
	public Company updateCompany(int companyId,Company company) {
		Optional<Company> optional= repository.findById(companyId);
		if(optional.isEmpty()) {
			return null;
		}else {
             company.setCompanyId(companyId);
             return repository.save(company);
		}
	}
	public Company deleteCompany(int companyId) {
		Optional<Company> optional= repository.findById(companyId);
		if(optional.isEmpty()) {
			return null;
		}else {
              repository.deleteById(companyId);
              return optional.get();
		}
	}
}
