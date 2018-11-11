package com.hospitalDetails.prmDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospitalDetails.prmDemo.dao.ComplaintDao;
import com.hospitalDetails.prmDemo.entities.Complaint;
import com.hospitalDetails.prmDemo.entities.Medication;

@RestController
@RequestMapping("saveComplaint")
public class ComplaintController {
	@Autowired
	private ComplaintDao dao;
	@PostMapping
	public void saveComplaint(@RequestBody Complaint comp){
		List<Medication> listMed=comp.getMed();
		for (Medication medication : listMed) {
			medication.setComplaint(comp);
		}
		dao.save(comp);
		
	}

}
