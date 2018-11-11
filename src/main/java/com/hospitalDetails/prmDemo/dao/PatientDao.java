package com.hospitalDetails.prmDemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospitalDetails.prmDemo.entities.Patient;
@Repository
public interface PatientDao extends JpaRepository<Patient, Long> {

}
