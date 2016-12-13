package com.homemade.person;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.PersistenceException;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.homemade.dao.GenericDaoImpl;
import com.homemade.dao.PersonDao;

@Repository("personDao")
@Transactional
public class PersonDaoImpl extends GenericDaoImpl implements PersonDao {

	public Person pesquisar(Long id) throws PersistenceException {
		Person p = null;
		
		StringBuilder query = new StringBuilder(20);
		query.append("select p from Person p where p.id = ").append(id);

		try {
			p = (Person) getEm().createQuery(query.toString()).getSingleResult();

		} catch (NoResultException noResultException) {
			throw noResultException;
		} catch (Exception e) {
			throw new PersistenceException(e);
		}

		return p;
	}

	@SuppressWarnings("unchecked")
	public List<Person> pesquisar() throws PersistenceException {
		 List<Person>  p = null;
		StringBuilder query = new StringBuilder(20);
		query.append("select p from Person p");

		try {
			p  = (List<Person>) getEm().createQuery(query.toString()).getResultList();
		} catch (NoResultException noResultException) {
			throw noResultException;
		} catch (Exception e) {
			throw new PersistenceException(e);
		}
		return p;
	}

}