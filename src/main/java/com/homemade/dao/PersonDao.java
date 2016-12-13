package com.homemade.dao;

import java.util.List;

import javax.persistence.PersistenceException;

import com.homemade.person.Person;

public interface PersonDao extends Dao {

	Person pesquisar(Long id) throws PersistenceException;

	List<Person> pesquisar() throws PersistenceException;

}
