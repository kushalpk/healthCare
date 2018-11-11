package com.hospitalDetails.prmDemo.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Medication {
	private Long id;
	private Medicine medicne;
	private String howtoUse;
	private Integer quantity;
	private Integer duration;
	private Complaint complaint;
	@ManyToOne
	@JoinColumn(name="cid")
	public Complaint getComplaint() {
		return complaint;
	}
	public void setComplaint(Complaint complaint) {
		this.complaint = complaint;
	}
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@ManyToOne
	@JoinColumn(name="mid")
	public Medicine getMedicne() {
		return medicne;
	}
	public void setMedicne(Medicine medicne) {
		this.medicne = medicne;
	}
	public String getHowtoUse() {
		return howtoUse;
	}
	public void setHowtoUse(String howtoUse) {
		this.howtoUse = howtoUse;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	

}
