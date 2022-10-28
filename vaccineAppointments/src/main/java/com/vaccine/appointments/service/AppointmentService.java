package com.vaccine.appointments.service;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class AppointmentService {

	private List <Appointments> appointments = new ArrayList<Appointments>(Arrays.asList(new Appointments("dillip",Arrays.asList(new Vaccine("Moderna",1,"11-Jul-2022::11:30"),new Vaccine("Moderna",2,"11-Aug-2022::11:30"))),
			new Appointments("soumik",Arrays.asList(new Vaccine("Moderna",1,"12-Jul-2022::11:30"),new Vaccine("Moderna",2,"13-Aug-2022::11:30"))), 
			new Appointments("harsit",Arrays.asList(new Vaccine("Moderna",1,"13-Jul-2022::11:30"),new Vaccine("Moderna",2,"14-Aug-2022::11:30")))));


	public List <Appointments> getAllAppointments() {
		return appointments;

	}

	public Appointments getAppoinment(String name) {
		
		return appointments.stream().filter(t ->t.getName().equals(name)).findFirst().get();
		
	}

	public Appointments addAppointment(Appointments appointment) {
		appointments.add(appointment);
		
		return appointment;
	}

	public Appointments updateAppointment(Appointments appointment, String name) {
		// TODO Auto-generated method stub
		for(int i=0; i<appointments.size();i++) {
			if(appointments.get(i).getName().equals(name)) {
				appointments.set(i, appointment);
				break;
			}
		}
			
	
		return appointment;
		
	}

	public void deleteAppointment(String name) {
		// TODO Auto-generated method stub
		appointments.removeIf(t -> t.getName().equals(name));
		
	}
	
	


}


