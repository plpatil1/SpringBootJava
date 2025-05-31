package com.app;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.dao.AccountDAO;

public class App {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		AccountDAO accountDAO = context.getBean("accDAO", AccountDAO.class);
		accountDAO.addAccount();
		accountDAO.doWork(10, 20);
		context.close();
		
	}

}
