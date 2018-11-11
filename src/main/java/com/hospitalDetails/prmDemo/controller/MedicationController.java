package com.hospitalDetails.prmDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospitalDetails.prmDemo.dao.MedicationDao;
import com.hospitalDetails.prmDemo.entities.Medication;

@RestController
public class MedicationController {
@Autowired
	private MedicationDao dao;
@RequestMapping("saveMed")
	public void saveMed(@RequestBody Medication medi){
		dao.save(medi);
	}
}
