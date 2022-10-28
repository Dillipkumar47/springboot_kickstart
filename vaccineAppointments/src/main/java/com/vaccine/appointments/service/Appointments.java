package com.vaccine.appointments.service;

import java.util.List;

public class Appointments {
	
	private String name;
	private List<Vaccine> vaccine;

	
	public Appointments() {

	}
	public Appointments(String name, List<Vaccine> vaccine) {
		super();
		this.name = name;
		this.vaccine = vaccine;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Vaccine> getVaccine() {
		return vaccine;
	}
	public void setVaccine(List<Vaccine> vaccine) {
		this.vaccine = vaccine;
	}


	}
	


