package com.hospitalDetails.prmDemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospitalDetails.prmDemo.entities.Disease;
@Repository
public interface DiseaseDao extends JpaRepository<Disease,Long>{

}
