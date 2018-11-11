package com.hospitalDetails.prmDemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospitalDetails.prmDemo.entities.Visit;
@Repository
public interface VisitDao extends JpaRepository<Visit, Integer>{

}
