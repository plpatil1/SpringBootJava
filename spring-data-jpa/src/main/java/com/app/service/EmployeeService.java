package com.app.service;

import java.util.List;
import com.app.entity.Employee;

public interface EmployeeService {
	
	public List<Employee> findAll();
	public Employee findById(int thID);
	public void save(Employee theEmployee);
	public void deleteById(int thId);
	public Employee getEmpByEmail(String email);

}
