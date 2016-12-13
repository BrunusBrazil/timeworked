package com.homemade.person;

import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.ResourceSupport;

import com.homemade.jorney.Journey;

public class PersonResource extends ResourceSupport{
	
	private String name;
	private Double salary;
	private List<Journey> journeys = new ArrayList<>();

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public List<Journey> getJourneys() {
		return journeys;
	}
	public void setJourneys(List<Journey> journeys) {
		this.journeys = journeys;
	}
	
	
}
