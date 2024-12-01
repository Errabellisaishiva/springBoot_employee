package com.jsp.springBoot_employee.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.springBoot_employee.dto.Employee;
import com.jsp.springBoot_employee.repository.EmployeeRepository;

@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepository employeeRepository;
	
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	public Employee fetchEmployeeById(int id) {
		Optional<Employee> db=employeeRepository.findById(id);
		if(db.isPresent()) {
			Employee e=db.get();
			return e;
		}else
			return null;
	}
	public Employee deleteEmployeeById(int id) {
		Optional<Employee> db=employeeRepository.findById(id);
		if(db.isPresent()) {
			Employee e=db.get();
			employeeRepository.delete(e);
			return e;
		}else
			return null;
	}

}
