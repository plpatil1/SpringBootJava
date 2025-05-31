package com.app;

import java.io.File;
import java.io.IOException;
import com.app.bean.Student;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
	
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
		ObjectMapper objectMapper = new ObjectMapper();
		Student student = objectMapper.readValue(new File("data/sample.json"), Student.class);
		System.out.println("FirstName: "+student.getFirstName());
		System.out.println("Active: "+student.isActive());
		
	}
}
