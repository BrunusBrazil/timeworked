package com.homemade.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.homemade.person.Person;
import com.homemade.person.PersonAssembler;
import com.homemade.person.PersonResource;
import com.homemade.service.PersonService;

@RestController
@RequestMapping(value="Person")
public class PersonController {
	
	@Autowired
	@Qualifier("personService")
	PersonService service;
	
	@RequestMapping(value="/", method = RequestMethod.POST)
	public ResponseEntity<PersonResource> create(@RequestBody Person person) throws Exception{
		Person p = service.gravar(person);
		PersonAssembler pa  = new PersonAssembler();
		PersonResource pr = pa.toResource(p); 
		return new ResponseEntity<PersonResource>(pr, HttpStatus.CREATED);
	}

	@RequestMapping(value="/{pesonId}", method = RequestMethod.GET)
	public ResponseEntity<PersonResource> show(@PathVariable Long pesonId) throws Exception{
		Person p  = service.pesquisar(pesonId);
		PersonAssembler  pa =  new PersonAssembler();
		PersonResource pr =  pa.toResource(p);
		return new ResponseEntity<PersonResource>(pr, HttpStatus.OK);
	}
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public ResponseEntity<List<PersonResource>> showAll() throws Exception{
		List<Person> p  = service.pesquisar();
		PersonAssembler  pa =  new PersonAssembler();
		List<PersonResource> pr =  pa.toResources(p);
		return  ResponseEntity.ok(pr);
	}
	
	
	
	
	
	
}
