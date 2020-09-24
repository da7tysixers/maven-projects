package com.orubele.jpa.myjpa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class PersonService {
	
	@Autowired
	private PersonRepository repository;
	
	
	public Person create(Person person) {
		return repository.save(person);
		
	}
	
	public Person readById(Long id) {
		Person person = repository.findById(id).get();
		return person;
	}
	
	
	public List<Person> readAll() {
		Iterable<Person> personIterabe = repository.findAll();
		List<Person> personList = new ArrayList<Person>();
		personIterabe.forEach(personList::add);
		return personList;
	}
	
	public Person update(Long id, Person newData) {
		Person person = readById(id);
		person.setFirstName(newData.getFirstName());
		person.setLastName(newData.getLastName());
		person.setBirthDate(newData.getBirthDate());
		repository.save(person);
		return person;
	}
	
	
	public Person deleteById(Long id) {
		Person personToBeDeleted = readById(id);
		repository.delete(personToBeDeleted);
		return personToBeDeleted;
	}

}
