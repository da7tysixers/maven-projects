package com.orubele.springannotation;

import org.springframework.stereotype.Component;

@Component
public class PingPongCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "The Ping Pong Coachella";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
