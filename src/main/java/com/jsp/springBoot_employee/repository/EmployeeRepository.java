package com.jsp.springBoot_employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.springBoot_employee.dto.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
