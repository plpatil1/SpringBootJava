package com.app.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.app.dao.EmployeeRepository;
import com.app.entity.Employee;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	/*
	 * @Autowired public EmployeeServiceImpl(EmployeeRepository employeeRepository)
	 * { this.employeeRepository = employeeRepository; }
	 */

	@Override
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}

	@Override
	public void save(Employee theEmployee) {
		// TODO Auto-generated method stub
		employeeRepository.save(theEmployee);
	}

	@Override
	public void deleteById(int thId) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(thId);
	}

	@Override
	public Employee findById(int thID) {
		// TODO Auto-generated method stub
		
		Optional<Employee> e = employeeRepository.findById(thID);
		Employee theEmployee = e.get();
		return theEmployee;
	}

	@Override
	public Employee getEmpByEmail(String email) {
		// TODO Auto-generated method stub
		return employeeRepository.getEmpByEmail(email);
	}

}
