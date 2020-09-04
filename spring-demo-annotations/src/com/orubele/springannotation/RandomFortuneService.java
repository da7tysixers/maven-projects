package com.orubele.springannotation;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	
	// create an array of strings
	private String[] fortuneData = {
			"Beware of the world",
			"The masses are not asleep",
			"The quick brown fox",
			"Music of the Century"
	};
	
	private Random random = new Random();
	
	@Override
	public String getFortune() {
		//pick a random string from the array
		int randomValue = random.nextInt(fortuneData.length);
		String result = fortuneData[randomValue];
		return result;
	}

}
