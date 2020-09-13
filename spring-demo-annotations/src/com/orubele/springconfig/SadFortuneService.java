package com.orubele.springconfig;

import com.orubele.springconfig.FortuneService;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {	
		return "Today is a sad day";
	}

}
