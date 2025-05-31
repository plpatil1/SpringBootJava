package com.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.app.dao.AccountDAO;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"com.app"})
public class DemoConfig {
	
	@Bean(name = "accDAO")
	public AccountDAO accountDAO()
	{
		return new AccountDAO();
	}

}
