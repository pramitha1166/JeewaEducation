package com.graymatter.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentHall {
	
	@Id
	private String sHallID;
	
	@Column(name = "Sbatch")
	private String sbatch;
	
	@Column(name = "syear")
	private String syear;
	
	@Column(name = "shallfile")
	private String shallfile;

	public String getsHallID() {
		return sHallID;
	}

	public void setsHallID(String sHallID) {
		this.sHallID = sHallID;
	}

	public String getSbatch() {
		return sbatch;
	}

	public void setSbatch(String sbatch) {
		this.sbatch = sbatch;
	}

	public String getSyear() {
		return syear;
	}

	public void setSyear(String syear) {
		this.syear = syear;
	}

	public String getShallfile() {
		return shallfile;
	}

	public void setShallfile(String shallfile) {
		this.shallfile = shallfile;
	}
	
	@Override
	public String toString() {
		return "Shall [sHallID=" + sHallID + ", sbatch=" + sbatch + ",syear="+ syear + ",shallfile=" + shallfile +"]";
	}
	
	
}
