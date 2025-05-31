package com.app;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
	
	@Autowired
	Heart heart;
	
	public Human()
	{
		System.out.println("In Constructor");
	}

	//@Autowired
	public Human(Heart heart) {
		super();
		System.out.println("In Param Constructor");
		this.heart = heart;
	}
	
	//@Autowired
	public void setHeart(Heart heart) {
		System.out.println("In setter");
		this.heart = heart;
	}

	public void pump()
	{
		if(heart!=null)
			heart.pumping();
		else
			System.out.println("You are Dead!");
	}

	
}
