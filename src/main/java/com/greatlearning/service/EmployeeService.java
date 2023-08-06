package com.greatlearning.service;

import java.util.List;

import com.greatlearning.entity.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee employee);

	public List<Employee> listAllEmployees();

	public Employee findEmployeeById(int id);

	public String deleteEmployeeById(int id);

	public Employee updateEmployee(Employee employee);

	public List<Employee> getEmployeeByFirstName(String firstName);

	public List<Employee> sortEmployeeByFirstName(String order);
}
