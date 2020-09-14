package com.github.perscholas;

import com.github.perscholas.Person;

import java.util.List;

public interface PersonServiceInterface {
    Person create(Person person);

    List<Person> readAll();

    Person readById(Long id);

    Person update(Long id, Person person);

    Person deleteById(Long id);
}
