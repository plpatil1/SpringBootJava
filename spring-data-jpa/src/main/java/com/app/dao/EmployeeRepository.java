package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	@Query("select e from Employee e where e.email= :email")
	public Employee getEmpByEmail(String email);
	

}


//Postman -> Rest -> Service -> DAO