package com.orubele.springannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("fileFortuneService")
	private FortuneService FortuneService;
	
	 public TennisCoach() {
		 System.out.println(">>TennisCoach: inside default constructor");
	 }
	 
	 
//	@Autowired
//	public void doSomeCrazyStuff(FortuneService fortuneService) {
//		System.out.println(">> TennisCoach: inside doSomeCrazyStuff() method");
//		FortuneService = fortuneService;
//	}



	/**
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		FortuneService = fortuneService;
	}

**/
	@Override
	public String getDailyWorkout() {
		
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return FortuneService.getFortune();
	}

}
