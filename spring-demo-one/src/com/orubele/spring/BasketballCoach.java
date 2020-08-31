package com.orubele.spring;

public class BasketballCoach implements Coach {
	
	@Override
	public String getDailyWorkout() {
		return "spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return "Chase the ball with your bat and take a break";
	}
	

}
