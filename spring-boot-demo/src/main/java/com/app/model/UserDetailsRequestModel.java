package com.app.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDetailsRequestModel {
	
	@NotNull(message = "First name cannot be null")
	private String firstName;
	@NotNull(message = "Last Name cannot be null")
	private String lastName;
	@NotNull(message = "Email cannot be null")
	@Email
	private String email;
	@NotNull(message = "Message cannot be null")
	@Size(min=8,max=16,message = "Password must be equal or greater than 8"
			+ "character and less than 16 characters")
	private String password;
	
	//private String userId;
	
	
	
	
	

}
