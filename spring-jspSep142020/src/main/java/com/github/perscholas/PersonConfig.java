package com.github.perscholas;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Configuration
public class PersonConfig {

    @Autowired
    PersonRepository repository;


    @PostConstruct
    public void setup(){
        Person person1 = new Person();
        person1.setFirstName("Emmanuel");
        person1.setLastName("Orubele");
        person1.setBirthDate(new Date());
        // add person to database
        repository.save(person1);
        List<Person> person2 = Arrays.asList(new Person(),
                new Person(),
                new Person(),
                new Person());

        for (Person person : person2) {
            repository.save(person);
        }
    }
}
