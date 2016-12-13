package com.homemade.service;

import java.util.List;

import com.homemade.person.Person;

public interface PersonService {
	public Person gravar(Object obj)throws Exception;
	public Person pesquisar(Long id) throws Exception;
	public List<Person> pesquisar() throws Exception;
	
}
