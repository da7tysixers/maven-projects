package com.orubele.spring;

public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String startRun() {
		return "Run track for 200 meters and stop.";
	}

}
