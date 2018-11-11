package com.hospitalDetails.prmDemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospitalDetails.prmDemo.dao.PatientDao;
import com.hospitalDetails.prmDemo.entities.Patient;

@RestController
@RequestMapping("savePat")
@CrossOrigin
public class PatientController {
	@Autowired
	private PatientDao dao;
	@PostMapping
	public void savePat(@RequestBody Patient pat){
		dao.save(pat);
		
	}
	@GetMapping("/all")
	public List<Patient> getPat(){
		return dao.findAll();
		
	}
	@GetMapping("/{id}")
	public Patient getRec(@PathVariable(name="id") Long id){
		Optional<Patient> patient =dao.findById(id);
		return patient.get();
	}
	@DeleteMapping("/delete/{id}")
	public void delRec(@PathVariable(name="id") Long id){
		dao.deleteById(id);
	}
	
	

}
