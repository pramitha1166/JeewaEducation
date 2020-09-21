package com.graymatter.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PendingStudents {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pending_id;
	
	private String nameWithInitials;
	private String fullName;
	private String homeAddress;
	private String nic;
	private String degreeProgram;
	private String telHome;
	private String telMobile;
	
	private String fatherName;
	private String fatherNIC;
	private String fatherOccupation;
	
	private String motherName;
	private String motherNIC;
	private String motherOccupation;
	public int getPending_id() {
		return pending_id;
	}
	public void setPending_id(int pending_id) {
		this.pending_id = pending_id;
	}
	public String getNameWithInitials() {
		return nameWithInitials;
	}
	public void setNameWithInitials(String nameWithInitials) {
		this.nameWithInitials = nameWithInitials;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}
	public String getNic() {
		return nic;
	}
	public void setNic(String nic) {
		this.nic = nic;
	}
	public String getDegreeProgram() {
		return degreeProgram;
	}
	public void setDegreeProgram(String degreeProgram) {
		this.degreeProgram = degreeProgram;
	}
	public String getTelHome() {
		return telHome;
	}
	public void setTelHome(String telHome) {
		this.telHome = telHome;
	}
	public String getTelMobile() {
		return telMobile;
	}
	public void setTelMobile(String telMobile) {
		this.telMobile = telMobile;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getFatherNIC() {
		return fatherNIC;
	}
	public void setFatherNIC(String fatherNIC) {
		this.fatherNIC = fatherNIC;
	}
	public String getFatherOccupation() {
		return fatherOccupation;
	}
	public void setFatherOccupation(String fatherOccupation) {
		this.fatherOccupation = fatherOccupation;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getMotherNIC() {
		return motherNIC;
	}
	public void setMotherNIC(String motherNIC) {
		this.motherNIC = motherNIC;
	}
	public String getMotherOccupation() {
		return motherOccupation;
	}
	public void setMotherOccupation(String motherOccupation) {
		this.motherOccupation = motherOccupation;
	}
	@Override
	public String toString() {
		return "PendingStudents [pending_id=" + pending_id + ", nameWithInitials=" + nameWithInitials + ", fullName="
				+ fullName + ", homeAddress=" + homeAddress + ", nic=" + nic + ", degreeProgram=" + degreeProgram
				+ ", telHome=" + telHome + ", telMobile=" + telMobile + ", fatherName=" + fatherName + ", fatherNIC="
				+ fatherNIC + ", fatherOccupation=" + fatherOccupation + ", motherName=" + motherName + ", motherNIC="
				+ motherNIC + ", motherOccupation=" + motherOccupation + "]";
	}
	
	
	
	

}
