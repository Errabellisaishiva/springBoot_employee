package com.jsp.springBoot_employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.springBoot_employee.dao.EmployeeDao;
import com.jsp.springBoot_employee.dto.Employee;
@RestController
public class employeeController {
	/*
	 * method type-post
	 * url--http://localhost:8080/save
	 * body--- raw--json--{

                             "name":"shiva",
                             "pwd":"shivarao",
                             "address":"wrgl",
                             "email":"shiva@gmail.com",
                             "salary":450000.3345
                          }
	 * */
	@Autowired
	EmployeeDao dao;
	
	@PostMapping("/saveemployee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return dao.saveEmployee(employee);
	}
//	/*
//	 * method type-put
//	 * url--http://localhost:8080/update
//	 * body--- raw--json--{
//                           "id":1,
//                           "name":"harsha",
//                           "pwd":"harsha",
//                           "address":"hyd",
//                           "email":"Harsha@gmail.com",
//                           "sal":25000
//                           }
//	 * */
//	@PutMapping("/update")
//	public Employee updateEmployee(@RequestBody Employee employee) {
//		System.out.println(employee);
//		return employee;
//	}
	/*
	 * method type-put
	 * url--http://localhost:8080/delete?id=1
c	 * 
	 * */
	@DeleteMapping("/delete")
	public Employee deleteEmployee(@RequestParam int id) {
		return dao.deleteEmployeeById(id);
	}
	/*
	 * method type-get
	 * url--http://localhost:8080/fetch/1
	 * 
	 * */
	@GetMapping("/fetch")
	public Employee fetchEmployee(@RequestParam int id) {
		return dao.fetchEmployeeById(id);
	}
//	/*
//	 * method type-get
//	 * url--http://localhost:8080/fetchAll
//	 * 
//	 * */
//	@GetMapping("/fetchAll")
//	public List<Employee> fetchAll(){
//		return null;
//	}
//	
	/*
	 * method type-post
	 * url--http://localhost:8080/login?email=harsha@gmail.com&pwd=harsha
	 * 
	 * */
//	@PostMapping("/login")
//	public Employee login(@RequestParam String email,@RequestParam String pwd) {
//		System.out.println("login");
////		System.out.println(email);
////		System.out.println(pwd);
//		return null;
//	}
//	

		
}
	
