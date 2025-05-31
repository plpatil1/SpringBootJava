package com.app.beans;

import org.springframework.stereotype.Component;

import com.app.utility.FortuneService;

@Component
public class HappyFortuneService implements FortuneService {
	
	public HappyFortuneService()
	{
		System.out.println("In HAppy");
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Today is your Lucky Day!!!";
	}

}
