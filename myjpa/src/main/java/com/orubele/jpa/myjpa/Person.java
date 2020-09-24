package com.orubele.jpa.myjpa;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Entity
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String firstName;
	
	private String lastName;
	
	private Date birthDate;
	
	

	public Person(String firstName, String lastName, Date birthDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Date getBirthDate() {
		return birthDate;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		try {
			return new ObjectMapper().writeValueAsString(this);
		} catch (JsonProcessingException e) {
			throw new RuntimeException();
			
		}
	}
	
	
	
	
}
