package com.app.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
	
	public void addAccount()
	{
		System.out.println("Adding an Account");
	}
	
	public void doWork(int a,int b)
	{
		System.out.println("Doing AccountDAO work");
	}

}
