package com.orubele.learning.jpa;

import java.util.Optional;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.orubele.learning.jpa.entity.User;
import com.orubele.learning.jpa.service.UserDAOService;
import com.orubele.learning.jpa.service.UserRepository;


@Component
public class UserRepositoryCommandLineRunner2 implements CommandLineRunner {
	private static final Logger log = 
	LoggerFactory.getLogger(UserRepositoryCommandLineRunner2.class);

	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User user = new User("Jill", "Admin");
		userRepository.save(user);
		log.info("New User is created " + user);
		
		Optional<User> userWithIdOne = userRepository.findById(1l);
		log.info("User is retrieved: " + userWithIdOne);
		
		List<User> userList= userRepository.findAll();
		log.info("All user: " + userList);
		
	}
	
	

}
