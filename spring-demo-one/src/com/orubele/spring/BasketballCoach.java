package com.orubele.spring;

public class BasketballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Daily baskeball drills";
	}

	@Override
	public String startRun() {
		return "Run on thread-mill";
	}

}
