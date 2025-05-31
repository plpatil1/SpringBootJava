package com.app.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "title")
	private String title;

	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name="course_student",
	joinColumns = @JoinColumn(name="course_id"),
	inverseJoinColumns = @JoinColumn(name="student_id"))
	//private List<Student> student;
	private Set<Student> student;

	public Course() {
		super();
	}

	public Course(String title) {
		super();
		this.title = title;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	

	/*
	 * public List<Student> getStudent() { return student; }
	 * 
	 * public void setStudent(List<Student> student) { this.student = student; }
	 */
	
	

	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", student=" + student + "]";
	}

	
	public Set<Student> getStudent() {
		return student;
	}

	public void setStudent(Set<Student> student) {
		this.student = student;
	}

	/*
	 * public void add(Student tempStudent) 
	 * { 
	 * if(student==null)
	 *  { 
	 *  student= new ArrayList<Student>(); }
	 * student.add(tempStudent);
	 * }
	 */
	
	
	public void add(Student tempStudent)
	{
		if(student==null)
		{
			student= new HashSet<Student>();
		}
		
		student.add(tempStudent);
		
	}
	
}
