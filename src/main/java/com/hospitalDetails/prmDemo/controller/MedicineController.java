package com.hospitalDetails.prmDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospitalDetails.prmDemo.dao.MedicineDao;
import com.hospitalDetails.prmDemo.entities.Medicine;

@RestController
public class MedicineController {
	@Autowired
	private MedicineDao dao;
	@RequestMapping("saveMedicine")
	public void saveMedicine(@RequestBody Medicine medicine){
		dao.save(medicine);
		
	}

}
