package com.orubele.learning.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.orubele.learning.jpa.entity.User;
import com.orubele.learning.jpa.service.UserDAOService;

@Component
public class UserDOAServiceCommandLineRunner implements CommandLineRunner {
	private static final Logger log = 
	LoggerFactory.getLogger(UserDOAServiceCommandLineRunner.class);

	
	@Autowired
	private UserDAOService userDoaService;

	@Override
	public void run(String... args) throws Exception {
		User user = new User("Jack", "Admin");
		long insert = userDoaService.insert(user);
		log.info("New User is created " + user);
	}

}
