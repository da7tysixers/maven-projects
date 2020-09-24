package com.orubele.jpa.myjpa;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfig {
	
	@Autowired
	private PersonRepository repository;
	
	@PostConstruct
	public void setup() {
		List<Person> personList = Arrays.asList(
				new Person("Emmanuel", "Orubele", new Date()),
				new Person("Ma'Kyah", "Orubele", new Date()),
				new Person()
				);
		
		repository.saveAll(personList);
	}
	
	

}
