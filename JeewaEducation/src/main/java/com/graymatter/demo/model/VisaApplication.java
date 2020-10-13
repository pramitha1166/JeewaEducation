package com.graymatter.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.UniqueElements;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import com.sun.istack.NotNull;

import net.bytebuddy.implementation.bind.annotation.Default;

@Entity
public class VisaApplication {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@NotEmpty
	@Size(min = 3, max = 30)
	private String fname;


	@NotEmpty
	@Size(min = 3, max = 30)
	private String lname;

	private String other;
	 
	@NotEmpty
	@Column(unique = true)
	private String email;

	@NotEmpty
	private String gender;

	@NotEmpty
	@DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull
	private String dob;
	
	@NotEmpty
	@Size(min = 3,max = 30)
	private String city;
	
	@NotEmpty
	@Size(min = 3,max = 30)
	private String state;

	private int zip;

	@NotEmpty
	@Size(min = 3,max = 30)
	private String marrage;

	@NotEmpty
	@Size(min = 3,max = 30)
	private String country;
	
	@Value("not-verified")
	private String status;
	
	@Column(unique = true)
	private String studentid;
	
	
	private String medical;

	/*	
 * 
 * 
	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name="visastidfk", nullable = false)
	private VisaStudent visastudent;
	*/
	/*
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "pendingStudent_FK")
	private VisaStudent visasastudent; 
	as
	*/
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "usernamefk", referencedColumnName = "id")
	private VisaStudent visastudent;
	
	
	
	
	public String getMedical() {
		return medical;
	}



	public void setMedical(String medical) {
		this.medical = medical;
	}



	public String getStudentid() {
		return studentid;
	}



	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public VisaStudent getVisastudent() {
		return visastudent;
	}



	public void setVisastudent(VisaStudent visastudent) {
		this.visastudent = visastudent;
	}



	public String getLname() {
		return lname;
	}



	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String getMarrage() {
		return marrage;
	}

	public void setMarrage(String marrage) {
		this.marrage = marrage;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
/*
	public VisaStudent getVisastudent() {
		return visastudent;
	}

	public void setVisastudent(VisaStudent visastudent) {
		this.visastudent = visastudent;
	}
*/
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



	@Override
	public String toString() {
		return "PendingForVisa [id=" + id + ", fname=" + fname + ", lname=" + lname + ", other=" + other + ", email="
				+ email + ", gender=" + gender + ", dob=" + dob + ", city=" + city + ", state=" + state + ", zip=" + zip
				+ ", marrage=" + marrage + ", country=" + country + ", status=" + status + ", studentid=" + studentid
				+ ", visastudent=" + visastudent + "]";
	}



	
	
}
