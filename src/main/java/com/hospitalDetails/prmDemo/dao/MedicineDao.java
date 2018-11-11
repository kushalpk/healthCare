package com.hospitalDetails.prmDemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospitalDetails.prmDemo.entities.Medicine;

public interface MedicineDao extends JpaRepository<Medicine, Long> {

}
