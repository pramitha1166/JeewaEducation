package com.graymatter.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Lecturertimetable {

	@Id
	private String ltimetableID;
	
	@Column(name = "Lname")
	private String lname;
	
	@Column(name = "Lyear")
	private String lyear;
	
	@Column(name = "Ltimetable")
	private String ltimetablefile;

	public String getLtimetableID() {
		return ltimetableID;
	}

	public void setLtimetableID(String ltimetableID) {
		this.ltimetableID = ltimetableID;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getLyear() {
		return lyear;
	}

	public void setLyear(String lyear) {
		this.lyear = lyear;
	}

	public String getLtimetablefile() {
		return ltimetablefile;
	}

	public void setLtimetablefile(String ltimetablefile) {
		this.ltimetablefile = ltimetablefile;
	}
	@Override
	public String toString() {
		return "Ltimetable [ltimetableID=" + ltimetableID + ", lname=" + lname + ",lyear="+ lyear + ",ltimetablefile=" + ltimetablefile +"]";
	}
	
}
