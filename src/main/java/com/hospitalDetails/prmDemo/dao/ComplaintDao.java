package com.hospitalDetails.prmDemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospitalDetails.prmDemo.entities.Complaint;
@Repository
public interface ComplaintDao extends JpaRepository<Complaint, Integer>{

}
