package com.app;
import org.springframework.beans.factory.annotation.Value;
public class Student {
	
	private String name;
	@Value("SAP")
	private String interestedCourse;
	@Value(value = "${student.hobby}")
	private String hobby;
	
	@Value("Rohan")
	public void setName(String name) {
		this.name = name;
	}
	public void setInterestedCourse(String interestedCourse) {
		this.interestedCourse = interestedCourse;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", interestedCourse=" + interestedCourse + ", hobby=" + hobby + "]";
	}
	
	

}
