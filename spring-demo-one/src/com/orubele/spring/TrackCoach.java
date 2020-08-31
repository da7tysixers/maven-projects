package com.orubele.spring;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach(com.orubele.spring.FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It: " +  fortuneService.getFortune();
	}

}
