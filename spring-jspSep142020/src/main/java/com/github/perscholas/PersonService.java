package com.github.perscholas;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService implements PersonServiceInterface {

    private PersonRepository repository;

    @Autowired
    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    @Override
    public Person create(Person person){
        Person personToCreate = repository.save(person);
        return personToCreate;
    }

    @Override
    public List<Person> readAll(){
        Iterable<Person> personList = repository.findAll();
        List<Person> persons = new ArrayList<>();
        personList.forEach(persons::add);
        return persons;

    }

    @Override
    public Person readById(Long id){
        Person personId = repository.findById(id).get();
        return personId;
    }

    @Override
    public Person update(Long id, Person person){
        Person personInDatabase = readById(id);
        personInDatabase.setBirthDate(person.getBirthDate());
        personInDatabase.setLastName(person.getLastName());
        personInDatabase.setFirstName(person.getFirstName());

        return repository.save(personInDatabase);

    }

    @Override
    public Person deleteById(Long id){
        Person personInDatabase = readById(id);
        repository.delete(personInDatabase);
        return personInDatabase;
    }
}
