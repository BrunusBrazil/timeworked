package com.homemade.jorney;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.homemade.person.Person;

@Entity
@Table(name="journey")
public class Journey {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long id;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="person_id")
	public Person person;
	
	@Column(name="e1")
	public Date e1;
	
	@Column(name="e2")
	public Date e2;
	
	@Column(name="s1")
	public Date s1;
	
	@Column(name="s2")
	public Date s2;

	//gettes and setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Date getE1() {
		return e1;
	}

	public void setE1(Date e1) {
		this.e1 = e1;
	}

	public Date getE2() {
		return e2;
	}

	public void setE2(Date e2) {
		this.e2 = e2;
	}

	public Date getS1() {
		return s1;
	}

	public void setS1(Date s1) {
		this.s1 = s1;
	}

	public Date getS2() {
		return s2;
	}

	public void setS2(Date s2) {
		this.s2 = s2;
	}
	
	 
}
