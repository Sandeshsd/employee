package com.employee_management_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee_management_system.dto.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer>{

}
