package com.app.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class DemoSecurityConfig {
	
	@Bean
	InMemoryUserDetailsManager userDetailsManager()
	{
		UserDetails user1 = User.builder()
									.username("rohan")
									.password("{noop}test123")
									.roles("EMPLOYEE")
									.build();
		
		UserDetails user2 = User.builder()
				.username("mayuri")
				.password("{noop}test123")
				.roles("EMPLOYEE","MANAGER")
				.build();
		
		UserDetails user3 = User.builder()
				.username("rahul")
				.password("{noop}test123")
				.roles("EMPLOYEE","MANAGER","ADMIN")
				.build();
		
		return new InMemoryUserDetailsManager(user1,user2,user3);
	}

}
