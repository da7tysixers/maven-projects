package com.orubele.springannotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach, DisposableBean {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService FortuneService;
	
	 public TennisCoach() {
		 System.out.println(">>TennisCoach: inside default constructor");
	 }
	 
	 //define my init method
	 @PostConstruct
	 public void doMyStartupStuff() {
		 System.out.println(">> TennisCoach: inside doMyStartupStuff()");
	 }
	 
	 // define my destroy method
	 @PreDestroy
	 public void doMyCleanupStuff() {
		 System.out.println(">> TennisCoach : inside doMyCleanupStuff()");
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

	@Override
	public void destroy() throws Exception {
		System.out.println(">> inside TennisCoach Destroy method: ");
		
	}

}
