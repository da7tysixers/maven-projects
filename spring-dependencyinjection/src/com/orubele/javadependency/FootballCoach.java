package com.orubele.javadependency;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {
	
	private FortuneService fortuneService;

	public FootballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "From the Football coach daily workout";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.fortune();
	}

}
