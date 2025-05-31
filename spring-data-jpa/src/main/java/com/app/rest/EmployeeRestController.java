package com.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Employee;
import com.app.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
	
	@Autowired
	private EmployeeService employeeService ;
	
	/*
	 * @Autowired public EmployeeRestController(EmployeeService employeeService) {
	 * super(); this.employeeService = employeeService; }
	 */

	@GetMapping("/employees")
	public List<Employee> findAll()
	{
		return employeeService.findAll(); 
	}
	
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee theEmployee)
	{
		theEmployee.setId(0);
		employeeService.save(theEmployee);
		return theEmployee;
	}
	
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee theEmployee)
	{
		employeeService.save(theEmployee);
		return theEmployee;
	}
	
	@GetMapping("/employees/{employeeId}")
	public Employee getEmployee(@PathVariable int employeeId)
	{
		Employee theEmployee = employeeService.findById(employeeId);
		if(theEmployee == null)
		{
			throw new RuntimeException("employee id not found - "+employeeId);
		}
		
		return theEmployee;
	}
	
	@DeleteMapping("/employees/{employeeId}")
	public String deleteEmployee(@PathVariable int employeeId)
	{
		Employee theEmployee = employeeService.findById(employeeId);
		if(theEmployee == null)
		{
			throw new RuntimeException("employee id not found - "+employeeId);
		}
		employeeService.deleteById(employeeId);
		return "Deleted employee ID - "+employeeId;
	}
	
	@PostMapping("/employees/email")
	//public Employee getEmpByEmail(@RequestBody Employee theEmployee)
	public Employee getEmpByEmail(@RequestParam String theEmail)
	{
			System.out.println("Email = "+theEmail);
			//String email = theEmployee.getEmail();
			return employeeService.getEmpByEmail(theEmail);
	}
	
}

