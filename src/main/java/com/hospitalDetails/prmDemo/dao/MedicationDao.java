package com.hospitalDetails.prmDemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospitalDetails.prmDemo.entities.Medication;
@Repository
public interface MedicationDao extends JpaRepository<Medication, Long>{

}
