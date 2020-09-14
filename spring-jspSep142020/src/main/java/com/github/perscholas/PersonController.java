package com.github.perscholas;


import com.sun.org.apache.bcel.internal.generic.NEW;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person-controller")
public class PersonController {
    private PersonService service;

    @Autowired
    public PersonController(PersonService service) {
        this.service = service;
    }

    @PostMapping(value = "/create")
    public ResponseEntity<Person> create(@RequestBody Person person){
        return new ResponseEntity<>(service.create(person), HttpStatus.CREATED);
    }

    @GetMapping(value = "/read/all")
    public ResponseEntity<List<Person>> readAll(){
       return new ResponseEntity<>(service.readAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/read/{id}")
    public ResponseEntity<Person> readById(@PathVariable Long id){
        return new ResponseEntity<>(service.readById(id), HttpStatus.OK);
    }


    @PutMapping(value = "/update/{id}")
    public ResponseEntity<Person> update(@PathVariable Long id,@RequestBody Person newData){
        return new ResponseEntity<>(service.update(id, newData), HttpStatus.OK);
    }


    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<Person> deleteById(Long id){
       return new ResponseEntity<>(service.deleteById(id), HttpStatus.OK);
    }
}
