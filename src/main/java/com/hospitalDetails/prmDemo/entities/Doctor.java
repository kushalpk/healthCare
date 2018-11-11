package com.hospitalDetails.prmDemo.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Doctor {
	
	private int id;
	private String doctorname;
	private String specialization;
	private Date availableTime;
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDoctorname() {
		return doctorname;
	}
	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public Date getAvailableTime() {
		return availableTime;
	}
	public void setAvailableTime(Date availableTime) {
		this.availableTime = availableTime;
	}
	
	

}
