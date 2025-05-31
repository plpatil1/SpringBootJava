package com.app.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
//@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Instructor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String email;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "instructor_details_id")
	private InstructorDetails instructorDetails;
	
	
	
	public Instructor(String firstName, String lastName, String email, InstructorDetails instructorDetails) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.instructorDetails = instructorDetails;
	}



	public Instructor(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	
	

}
