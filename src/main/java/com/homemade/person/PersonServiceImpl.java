package com.homemade.person;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.homemade.dao.PersonDao;
import com.homemade.service.PersonService;

@Service(value="personService")
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	@Qualifier("personDao")
	PersonDao dao;
	
	@Override
	public Person gravar(Object object) throws Exception  {
		Person p = null;
		try {
			p = (Person) dao.gravar(object);
		} catch (Exception e) {
			throw new Exception("Test");
		}
		return p;
	}

	@Override
	public Person pesquisar(Long id) throws Exception {
		Person p = null;
			try {
				p =  dao.pesquisar(id);
			} catch (Exception e) {
				//TODO: TRATAR EXCPTION
				e.getStackTrace();
			}
		return p;
	}

	@Override
	public List<Person> pesquisar() throws Exception {
		List<Person> p = null;
		try {
			p =  dao.pesquisar();
		} catch (Exception e) {
			//TODO: TRATAR EXCPTION
			e.getStackTrace();
		}
		return p;
	}

}
