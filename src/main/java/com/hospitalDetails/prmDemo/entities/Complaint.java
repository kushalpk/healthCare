package com.hospitalDetails.prmDemo.entities;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Complaint {
	private int id;
	private String problem;
	
	private List<Disease> disease;
	private Visit visit;
	private List<Medication> med;
	
	
	
	
	@OneToMany(mappedBy="complaint",cascade=CascadeType.ALL)
	public List<Medication> getMed() {
		return med;
	}
	public void setMed(List<Medication> med) {
		this.med = med;
	}
	@ManyToMany
	@JoinTable(name="comp_Dise",joinColumns={@JoinColumn(name="cid")},inverseJoinColumns={@JoinColumn(name="disId")})
	public List<Disease> getDisease() {
		return disease;
	}
	public void setDisease(List<Disease> disease) {
		this.disease = disease;
	}
	@ManyToOne
	@JoinColumn(name="vid")
	public Visit getVisit() {
		return visit;
	}
	public void setVisit(Visit visit) {
		this.visit = visit;
	}
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProblem() {
		return problem;
	}
	public void setProblem(String problem) {
		this.problem = problem;
	}
	

}
