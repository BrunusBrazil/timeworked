package com.homemade.person;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import com.homemade.controller.PersonController;

public class PersonAssembler extends ResourceAssemblerSupport<Person, PersonResource>{

	public PersonAssembler() {
		super(Person.class, PersonResource.class);
	}

	@Override
	public PersonResource toResource(Person person) {
		PersonResource pr = new PersonResource();
	    pr.setName(person.getName());
	    pr.setSalary(person.getSalary());
	    pr.setJourneys(person.getJourneys());
	    Link link = linkTo(PersonController.class).slash(person.getId()).withSelfRel();
		pr.add(link);
	    return pr;
	}
	
	

}
