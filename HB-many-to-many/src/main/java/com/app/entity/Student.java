package com.app.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="email")
	private String email;
	
	@ManyToMany(cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
	@JoinTable(name="course_student",joinColumns = @JoinColumn(name="student_id"),
	inverseJoinColumns = @JoinColumn(name="course_id"))
	//private List<Course> courses;
	private Set<Course> courses;
	
	
	//Generate default n param COnstructor, Getters and setters and toString
	public Student() {}

	public Student(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	
	/*
	 * public List<Course> getCourses() { return courses; }
	 * 
	 * public void setCourses(List<Course> courses) { this.courses = courses; }
	 */
	
	

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ "]";
	}
	
	
	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	/*
	 * public void add(Course tempCourse)
	 *  { 
	 *  if(courses==null) 
	 *  { 
	 *  courses= new ArrayList<Course>(); 
	 *  }
	 * courses.add(tempCourse);
	 * 
	 * }
	 */
	
	public void add(Course tempCourse)
	{
		if(courses==null)
		{
			courses= new HashSet<Course>();
		}
		
		courses.add(tempCourse);
		
	}
	
}
