package com.orubele.jpa.myjpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/person-controller")
public class PersonController {
	
	@Autowired
	private PersonService service;
	
	@PostMapping(value = "/create")
	public ResponseEntity<Person> create(@RequestBody Person person){
		return new ResponseEntity<>(service.create(person), HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Person> readById(@PathVariable Long id){
		return new ResponseEntity<>(service.readById(id), HttpStatus.OK);
	}
    
	
	@GetMapping(value = "/read/all")
	public ResponseEntity<List<Person>> readAll(){
		return new ResponseEntity<>(service.readAll(), HttpStatus.OK);
	}
	
	
	@PutMapping(value = "/update/{id}")
	public ResponseEntity<Person> updateById(@PathVariable Long id, @RequestBody Person newData){
		return new ResponseEntity<>(service.update(id, newData), HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<Person> deleteById(@PathVariable Long id){
		return new ResponseEntity<>(service.deleteById(id), HttpStatus.OK);
	}
}
