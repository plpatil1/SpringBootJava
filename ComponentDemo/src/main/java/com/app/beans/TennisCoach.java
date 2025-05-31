package com.app.beans;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.app.utility.Coach;
import com.app.utility.FortuneService;

@Component
public class TennisCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public TennisCoach(@Qualifier("happyFortuneService") FortuneService fortuneService) {
		super();
		System.out.println("In Param Tennis");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run 5k";
	}

	@Override
	public String getFortuneService() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
