package com.hospitalDetails.prmDemo.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospitalDetails.prmDemo.dao.AppointmentDao;
import com.hospitalDetails.prmDemo.entities.Appointment;

@RestController
public class AppointmentController {
	@Autowired
	private AppointmentDao dao;
	@RequestMapping("saveApp")
	public void saveApp(@RequestBody Appointment app){
		app.setTime(new Date());
		dao.save(app);
	}

}
