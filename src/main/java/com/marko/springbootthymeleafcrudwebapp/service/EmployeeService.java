package com.marko.springbootthymeleafcrudwebapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.marko.springbootthymeleafcrudwebapp.model.Employee;

@Service
public interface EmployeeService {

	List<Employee>listAllEmployees();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(long id);
	void deleteEmployeeById(long id);
}
