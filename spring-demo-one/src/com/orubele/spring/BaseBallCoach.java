package com.orubele.spring;

public class BaseBallCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Sprint 5 hours everyday";
	}

	@Override
	public String startRun() {
		return "Chase the ball with your bat and take a break";
	}

}
