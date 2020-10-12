	package com.graymatter.demo.model;


import javax.persistence.Entity;

import javax.persistence.Id;


@Entity

public class Studenttimetable {

	@Id
	
	private int stimetableID;
	
	private String batch;
	
	private String timetablefile;
	
	
	public int getStimetableID() {
		return stimetableID;
	}
	public void setStimetableID(int stimetableID) {
		this.stimetableID = stimetableID;
	}
	
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	

	public String getTimetablefile() {
		return timetablefile;
	}
	public void setTimetablefile(String timetablefile) {
		this.timetablefile = timetablefile;
	}
	
	
}

