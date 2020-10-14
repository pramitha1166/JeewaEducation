package com.graymatter.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.validator.constraints.UniqueElements;

@Entity
public class VisaStudent {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	private String NIC;
	private String firstname;
	private String lastname;
	private String address;
	private int phonenum;
	private String email;
	private String uni;
	private String age;
	private String course;
	private String sex;
	@Column(unique = true)
	private String username;

	
	@OneToOne(mappedBy = "visastudent")
	private VisaApplication pendingvisastd;
	
	@OneToOne(mappedBy = "visastudent")
	private VerifiedVisa verifiedvisastd;
	
	public VisaApplication getPendingvisastd() {
		return pendingvisastd;
	}
	public void setPendingvisastd(VisaApplication pendingvisastd) {
		this.pendingvisastd = pendingvisastd;
	}
	public VerifiedVisa getVerifiedvisastd() {
		return verifiedvisastd;
	}
	public void setVerifiedvisastd(VerifiedVisa verifiedvisastd) {
		this.verifiedvisastd = verifiedvisastd;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public String getUni() {
		return uni;
	}
	public void setUni(String uni) {
		this.uni = uni;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNIC() {
		return NIC;
	}
	public void setNIC(String nIC) {
		NIC = nIC;
	}

	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(int phonenum) {
		this.phonenum = phonenum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "VisaStudent [id=" + id + ", NIC=" + NIC + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", address=" + address + ", phonenum=" + phonenum + ", email=" + email + ", uni=" + uni + ", age="
				+ age + ", course=" + course + ", sex=" + sex + ", username=" + username + ", pendingvisastd="
				+ pendingvisastd + ", verifiedvisastd=" + verifiedvisastd + "]";
	}

	
}
