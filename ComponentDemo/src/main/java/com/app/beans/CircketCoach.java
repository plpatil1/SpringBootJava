package com.app.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.app.utility.Coach;
import com.app.utility.FortuneService;

@Component("cricket")
@Scope("prototype")
public class CircketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public CircketCoach()
	{
		System.out.println("In Cricket");
	}
	
	@Autowired
	public CircketCoach(@Qualifier("sadFortuneService") FortuneService fortuneService) {
		super();
		System.out.println("In Param Cricket");
		this.fortuneService = fortuneService;
	}
	
	

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practise Bowling";
	}

	@Override
	public String getFortuneService() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
