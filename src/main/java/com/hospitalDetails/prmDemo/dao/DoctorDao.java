package com.hospitalDetails.prmDemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospitalDetails.prmDemo.entities.Doctor;
@Repository
public interface DoctorDao extends JpaRepository<Doctor, Integer>{

}
