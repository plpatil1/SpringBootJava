package com.app.DIDemo6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	
	@Autowired
	@Qualifier("octupusHeart")
	Heart heart;
	
	public Human()
	{
		System.out.println("In Constructor");
	}

	/*
	 * @Autowired
	 *  public Human(@Qualifier("humanHeart") Heart heart) 
	 *  { super();
	 * System.out.println("In Param Constructor"); 
	 * this.heart = heart;
	 *  }
	 */
	
	//@Autowired
	//@Qualifier("octupusHeart")
	public void setHeart(Heart heart) {
		System.out.println("In setter");
		this.heart = heart;
	}

	public void pump()
	{
		if(heart!=null)
		{
			heart.pumping();
			System.out.println("Name = "+heart.getNameOfAnimal()+
					" No of Hearts = "+heart.getNoOfHearts());
		}
		else
			System.out.println("You are Dead!");
	}

	
}
