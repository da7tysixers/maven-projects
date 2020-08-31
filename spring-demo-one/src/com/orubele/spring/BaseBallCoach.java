package com.orubele.spring;

public class BaseBallCoach implements Coach {
	
		// define a private field for the dependency
		private FortuneService fortuneService;
		
		
		// define a constructor for dependency injection
		public BaseBallCoach(FortuneService fortuneService) {
			this.fortuneService = fortuneService;
		}


	@Override
	public String getDailyWorkout() {
		return "Sprint 5 hours everyday";
	}

	@Override
	public String getDailyFortune() {	
		// use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}

}
