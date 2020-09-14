package com.orubele.javadependency;

import org.springframework.stereotype.Component;

@Component
public class CrazyFortuneService implements FortuneService {

	@Override
	public String fortune() {

		return "You have won 200 fortune service";
	}

}
