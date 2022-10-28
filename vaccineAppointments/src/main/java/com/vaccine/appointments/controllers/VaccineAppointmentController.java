package com.vaccine.appointments.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vaccine.appointments.service.AppointmentService;
import com.vaccine.appointments.service.Appointments;



@RestController
public class VaccineAppointmentController {
	
	@Autowired
	private AppointmentService appointmentService;

	@RequestMapping("/appointments")
	public List<Appointments> getAppointmets(){
		return appointmentService.getAllAppointments();
	}
	
	@RequestMapping("appointments/{name}")
	public Appointments getAppointment(@PathVariable String name) {
		
		
		return appointmentService.getAppoinment(name);
	}
	
	@RequestMapping(method=RequestMethod.POST , value="/appointments")
	public Appointments addAppointment(@RequestBody Appointments appointment) {
		
		Appointments resApp=appointmentService.addAppointment(appointment);
		
		return resApp;
		
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/appointments/{name}")
	public Appointments updateAppointment (@RequestBody Appointments appointment) {
		Appointments resApp=appointmentService.updateAppointment(appointment,appointment.getName());	
		return resApp;
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/appointments/{name}")
	public void deleteAppointment(@PathVariable String name) {
		appointmentService.deleteAppointment(name);
		
	}

}
