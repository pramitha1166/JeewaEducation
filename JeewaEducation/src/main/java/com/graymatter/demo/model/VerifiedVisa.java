package com.graymatter.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class VerifiedVisa {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String fname;
	private String lname;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "usernamefk", referencedColumnName = "id")
	private VisaStudent visastudent;
	@Column(unique = true)
	private String stdid;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public VisaStudent getVisastudent() {
		return visastudent;
	}
	public void setVisastudent(VisaStudent visastudent) {
		this.visastudent = visastudent;
	}
	@Override
	public String toString() {
		return "VisaVerifiedStudent [id=" + id + ", fname=" + fname + ", lname=" + lname + ", visastudent="
				+ visastudent + "]";
	}
	
	
	
}
