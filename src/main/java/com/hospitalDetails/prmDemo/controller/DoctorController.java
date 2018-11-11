package com.hospitalDetails.prmDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospitalDetails.prmDemo.dao.DoctorDao;
import com.hospitalDetails.prmDemo.entities.Doctor;

@RestController
public class DoctorController {
	@Autowired
	private DoctorDao dao;
	@RequestMapping("saveDoc")
	public void saveDoc(@RequestBody Doctor doc){
		dao.save(doc);
		
	}

}
