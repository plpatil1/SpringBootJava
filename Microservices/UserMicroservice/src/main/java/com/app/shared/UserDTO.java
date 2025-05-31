package com.app.shared;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public class UserDTO {
		
		private String firstName;
		private String lastName;
		private String email;
		private String password;
		private String userId;
		private String encryptedPassword;
		
		

	}



