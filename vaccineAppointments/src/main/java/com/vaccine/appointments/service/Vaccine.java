package com.vaccine.appointments.service;

public class Vaccine {
	
	private String vaccineType;
	private int dose;
	private String timeslot;
	
	
	public String getVaccineType() {
		return vaccineType;
	}
	public void setVaccineType(String vaccineType) {
		this.vaccineType = vaccineType;
	}
	public int getDose() {
		return dose;
	}
	public void setDose(int dose) {
		this.dose = dose;
	}
	public String getTimeslot() {
		return timeslot;
	}
	public void setTimeslot(String timeslot) {
		this.timeslot = timeslot;
	}
	public Vaccine(String vaccineType, int dose, String timeslot) {
		super();
		this.vaccineType = vaccineType;
		this.dose = dose;
		this.timeslot=timeslot;
	}
	
	public Vaccine() {
		
	}
	

}
