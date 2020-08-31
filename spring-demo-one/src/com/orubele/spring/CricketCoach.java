package com.orubele.spring;

public class CricketCoach implements Coach {
	private String emailAddress;
	private String team;
	private FortuneService fortuneService;
	
	
	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside no setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}


	public void setTeam(String team) {
		System.out.println("CricketCoach: inside no setter method - setTeam");
		this.team = team;
	}
	
	
	public String getEmailAddress() {
		return emailAddress;
	}


	public String getTeam() {
		return team;
	}


	public CricketCoach() {
		System.out.println("CricketCoach: inside no arg constructor");
	}
	
	

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside no setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
