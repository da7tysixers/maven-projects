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

	//add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	
	//add a estroy method
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: inside method doMyCleanupStuffYoYo");
	}
	
	
}
