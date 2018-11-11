package com.hospitalDetails.prmDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospitalDetails.prmDemo.dao.DiseaseDao;
import com.hospitalDetails.prmDemo.entities.Disease;

@RestController
public class DiseaseController {
	@Autowired
	private DiseaseDao dao;
	@RequestMapping("savDis")
	public void savDis(@RequestBody Disease dis){
		dao.save(dis);
		
	}

}
