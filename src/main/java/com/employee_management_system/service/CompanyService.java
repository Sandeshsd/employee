package com.employee_management_system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee_management_system.dao.CompanyDAO;
import com.employee_management_system.dto.Company;

@Service
public class CompanyService {

	@Autowired
	private CompanyDAO companyDAO;
	
   public Company saveCompany(Company company) {
	   return companyDAO.saveCompany(company);
    }
   public Company getCompanyById(int companyId) {
	   return companyDAO.getCompanyById(companyId);
    }
   public Company updateCompany(int companyId,Company company) {
	   return companyDAO.updateCompany(companyId, company);
	
}
   public Company deleteCompany(int companyId) {
	   return companyDAO.deleteCompany(companyId);
   }
}
