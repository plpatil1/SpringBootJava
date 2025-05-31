package com.app.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table
public class InstructorDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String youtube_channel;
	@Column
	private String hobby;
	/*
	 * @OneToOne(cascade = CascadeType.ALL, mappedBy = "instructorDetails") private
	 * Instructor instructor;
	 */
	
	public InstructorDetails(String youtube_channel, String hobby) {
		super();
		this.youtube_channel = youtube_channel;
		this.hobby = hobby;
	}

	/*
	 * public InstructorDetails(String youtube_channel, String hobby, Instructor
	 * instructor) { super(); this.youtube_channel = youtube_channel; this.hobby =
	 * hobby; this.instructor = instructor; }
	 */
	
	
	

}
